package jp.ndca.toolkit.compress.integer.variant;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class VariantCodesTest {


	static VariantCodes code = new VariantCodes();

	static Log log = LogFactory.getLog(VariantCodesTest.class);


	//@Test
	public void testCodec(){

		//int[] numbers = new int[]{ 1,23, 46, 87, 1, 261, 281};
		int[] numbers = new int[]{ 1,23, 46, 87, 1, 99999, 3732, 261, 18182, 281, 72187 };
		//int[] numbers = new int[]{ 1, 23, 46 };
		String line = "";
		for( int num : numbers)
			line += num +"\t";
		log.info("numbers : "+line);
		line = "";
		boolean useSort = true;
		log.info("size :" + ( 4 * numbers.length) );
		byte[] dd = code.encode( numbers, useSort, true );
		log.info( "size :" + dd.length );

		for( byte d :dd ){
			String strNum = Integer.toBinaryString((int)d);
			int length = strNum.length();
			if( 8 < length )
				strNum = strNum.substring(length-8);
			else{
				for(int i =0 ; i < 8 - length ; i++ )
					strNum = "0" + strNum;
			}

			System.out.println(strNum );
		}

		int[] decoded = code.decode(dd, false);
		for( int num : decoded)
			line += num +"\t";
		log.info(line);

	}



	@Test
	public void sequenceCompressPeformanceTest() throws IOException, InterruptedException{

		String fileName	= "word.txt";
		String encode	=	"UTF-8";
		InputStream is		=	Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		BufferedReader br	=	new BufferedReader( new InputStreamReader(is, encode) );

		int pForNum	 = 0;
		int dataNum	 = 0;
		int originNum = 0;
		while( br.ready() ){

			String line = br.readLine();
			dataNum++;
			if( dataNum % 10000 == 0 )
				System.out.println( "now line : " + dataNum );
			String[] part = line.split(":");
			if( part.length != 2 )
				throw new IllegalArgumentException();

			String[] strIds = part[1].split("\t");
			int len = strIds.length;
			originNum += len;
			if( strIds == null || len <= 0 )
				throw new IllegalArgumentException();
			int[] ids		= new int[len];
			for( int i = 0 ; i < len ; i++  )
				ids[i] = Integer.parseInt( strIds[i] );

			try{
				boolean useArraySorte = true;
				byte[] encoded = code.encode( ids, useArraySorte, true );
				pForNum  += encoded.length;
				int[] decoded = code.decode( encoded , false);
				assertEquals(ids.length , decoded.length);
			}
			catch( RuntimeException e ){
				System.out.println(line);
				throw e;
			}

		}
		br.close();

		System.out.println( "originNum : "  + originNum * 4  + 		 "byte" );
		System.out.println( "vbyteNum : "  + pForNum  + 		 "byte" );

	}


	//@Test
	public void deCompressPeformanceTest() throws IOException{

		String fileName	= "word.txt";
		String encode	=	"UTF-8";
		InputStream is 		=	Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		BufferedReader br	=	new BufferedReader( new InputStreamReader(is, encode) );


		int dataNum	 = 0;
		List<byte[]> encodedDatam = new ArrayList<byte[]>();
		while( br.ready() ){

			String line = br.readLine();
			dataNum++;
			if( dataNum % 10000 == 0 )
				System.out.println( "now line : " + dataNum );
			String[] part = line.split(":");
			if( part.length != 2 )
				throw new IllegalArgumentException();

			String[] strIds = part[1].split("\t");
			if( strIds == null || strIds.length <= 0 )
				throw new IllegalArgumentException();
			int[] ids		= new int[strIds.length];
			for( int i = 0 ; i < strIds.length ; i++  )
				ids[i] = Integer.parseInt( strIds[i] );

			boolean useArraySorte = true;
			byte[] encoded = code.encode(ids, useArraySorte, true);
			encodedDatam.add(encoded);

//			if(dataNum == 500000)
//				break;

		}
		br.close();


		System.out.println("dataSize : "+encodedDatam.size());

		long start = System.currentTimeMillis();


//		for( byte[] data : encodedDatam ){
//			code.decode(data);
//			num++;
//		}
		for(int num = 0 ; num < 10 ; num++ )
			for( int  i =0 ; i < encodedDatam.size() ; i++ )
				code.decode( encodedDatam.get(i), false );

		long end = System.currentTimeMillis();
		long diff = end - start;

		System.out.println(diff);

	}





}

