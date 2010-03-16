package jp.ndca.toolkit.compress.integer.vbyte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class VariableByteCodecTest {

	static VariableByteCodes codec = new VariableByteCodes();

	static Log log = LogFactory.getLog(VariableByteCodecTest.class);


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

		boolean useGaplist = true;

		log.info("size :" + ( 4 * numbers.length) );
		byte[] dd = codec.encode( numbers, true );
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

		int[] decoded = codec.decode(dd, useGaplist);
		for( int num : decoded)
			line += num +"\t";
		log.info(line);

	}


	@Test
	public void deCompressPeformanceTest() throws IOException{

		String fileName		=	"word.txt";
		String encode		=	"UTF-8";
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		BufferedReader br	=	new BufferedReader(
									new InputStreamReader( is, encode) );

		VariableByteCodes code = new VariableByteCodes();

		int dataNum	  = 0;
		int byteCount = 0;
		int dataCount = 0;
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

			int dataLength = strIds.length;
			dataCount += dataLength;

			int[] ids = new int[dataLength];
			for( int i = 0 ; i < dataLength ; i++  )
				ids[i] = Integer.parseInt( strIds[i] );

			boolean useArraySorte = true;
			byte[] encoded = code.encode(ids, useArraySorte);
			byteCount += encoded.length;
			encodedDatam.add(encoded);

		}
		br.close();


		boolean useGaplist = true;
		long start = System.currentTimeMillis();

		for(int num = 0 ; num < 10 ; num++ )

			for( int i =0 ; i < encodedDatam.size() ; i++ )
				code.decode( encodedDatam.get(i), useGaplist );

		long end = System.currentTimeMillis();
		long diff = end - start;

		System.out.println(diff + "ms");
		System.out.println("dataNum : " + encodedDatam.size());
		System.out.println("original : " + dataCount * 4 + "byte");
		System.out.println("compress : " + byteCount+ "byte");

	}





}

