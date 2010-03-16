package jp.ndca.toolkit.compress.integer.pfor;

public class PForDecompress {


	static int fastDeCompressFor1Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val = encodedValue[ offSet ++ ];

			decode[ decodeOffset ++ ]  = ( val << 31 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 30 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 29 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 28 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 27 ) >>>  31 ;	//5
			decode[ decodeOffset ++ ]  = ( val << 26 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 25 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 24 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 23 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 22 ) >>>  31 ;	//10
			decode[ decodeOffset ++ ]  = ( val << 21 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 20 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 19 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 18 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 17 ) >>>  31 ;	//15
			decode[ decodeOffset ++ ]  = ( val << 16 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 15 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 14 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 13 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 12 ) >>>  31 ;	//20
			decode[ decodeOffset ++ ]  = ( val << 11 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 10 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 9 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 8 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 7 ) >>>  31 ;		//25
			decode[ decodeOffset ++ ]  = ( val << 6 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 5 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 4 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 3 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = ( val << 2 ) >>>  31 ;		//30
			decode[ decodeOffset ++ ]  = ( val << 1 ) >>>  31 ;
			decode[ decodeOffset ++ ]  = val >>>  31 ;

		}

		if( rest == 0 )
			return offSet;

		int val = encodedValue[ offSet++ ];

		decode[ decodeOffset ]  = ( val << 31 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 30 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 29 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 28 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 27 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 26 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 25 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 24 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 23 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 22 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 21 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 20 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 19 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 18 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 17 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 16 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 15 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 14 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 13 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 12 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 11 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 10 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 9 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 8 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 7 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 6 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 5 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 4 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 3 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 2 ) >>>  31 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ] = ( val << 1 ) >>>  31 ;
		return offSet;

	}


	static int fastDeCompressFor2Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 4;
		int rest		=  dataNum % 16;
		int val  = 0;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			val = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]  = ( val << 30 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 28 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 26 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 24 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 22 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 20 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 18 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 16 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 14 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 12 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val << 10 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val <<  8 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val <<  6 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val <<  4 ) >>> 30;
			decode[ decodeOffset++ ]  = ( val <<  2 ) >>> 30;
			decode[ decodeOffset++ ]  = val >>> 30;

		}

		if( rest == 0 )
			return offSet;

		val = encodedValue[ offSet++ ];

		decode[ decodeOffset   ]  = ( val << 30 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 28 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 26 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 24 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 22 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 20 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 18 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 16 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 14 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 12 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val << 10 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val <<  8 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val <<  6 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val <<  4 ) >>> 30;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val <<  2 ) >>> 30;
		return offSet;

	}


	static int fastDeCompressFor3Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){


		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];
			int val2 = encodedValue[ offSet++ ];
			int val3 = encodedValue[ offSet++ ];

			decode[ decodeOffset ++	]  = ( val1 << 29 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 26 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 23 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 20 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 17 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 14 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 << 11 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 <<  8 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 <<  5 ) >>>  29 ;
			decode[ decodeOffset ++ ]  = ( val1 <<  2 ) >>>  29 ;

			decode[ decodeOffset ++ ]  = ( (val2 << 31) >>> 29 ) | (val1 >>> 30) ;
			decode[ decodeOffset ++ ]  = ( val2 << 28 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 25 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 22 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 19 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 16 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 13 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 << 10 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 <<  7 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 <<  4 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val2 <<  1 ) >>> 29 ;

			decode[ decodeOffset ++ ] = ( (val3 << 30 ) >>> 29 ) | (val2 >>> 31);
			decode[ decodeOffset ++ ]  = ( val3 << 27 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 << 24 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 << 21 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 << 18 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 << 15 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 << 12 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 <<  9 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 <<  6 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = ( val3 <<  3 ) >>> 29 ;
			decode[ decodeOffset ++ ]  = val3 >>> 29 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]  = ( val1 << 29 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 26 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 23 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 20 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 17 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 14 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 11 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 <<  8 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 <<  5 ) >>>  29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 <<  2 ) >>>  29 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  = ( (val2 << 31) >>> 29 ) | (val1 >>> 30) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 28 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 25 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 22 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 19 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 16 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 13 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 << 10 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 <<  7 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 <<  4 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val2 <<  1 ) >>> 29 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ] = ( (val3 << 30 ) >>> 29 ) | (val2 >>> 31);
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 27 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 24 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 21 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 18 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 15 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 << 12 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 <<  9 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 <<  6 ) >>> 29 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val3 <<  3 ) >>> 29 ;
		return offSet;

	}


	static int fastDeCompressFor4Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 3;
		int rest		=  dataNum % 8;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];

			decode[ decodeOffset ++ ]  = ( val1 << 28 ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 24 ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 20 ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 16 ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 12 ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 8  ) >>> 28 ;
			decode[ decodeOffset ++ ]  = ( val1 << 4  ) >>> 28 ;
			decode[ decodeOffset ++ ]  = val1 >>> 28 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];

		decode[ decodeOffset ]  = ( val1 << 28 ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 24 ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 20 ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 16 ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 12 ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 8  ) >>> 28 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  = ( val1 << 4  ) >>> 28 ;
		return offSet;

	}

	static int fastDeCompressFor5Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet ++ ];
			int val2 = encodedValue[ offSet ++ ];
			int val3 = encodedValue[ offSet ++ ];
			int val4 = encodedValue[ offSet ++ ];
			int val5 = encodedValue[ offSet ++ ];

			decode[ decodeOffset ++ ]  =  ( val1 << 27 ) >>>  27 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 22 ) >>>  27 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 17 ) >>>  27 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 12 ) >>>  27 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 7  ) >>>  27 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 2  ) >>>  27 ;

			decode[ decodeOffset ++ ]  =  ( ( val2 << 29 ) >>> 27 ) | ( val1 >>> 30 ) ;
			decode[ decodeOffset ++ ]  =  ( val2 << 24 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 19 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 14 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 9  ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 4  ) >>> 27 ;

			decode[ decodeOffset ++	]  =  ( ( val3 << 31 ) >>> 27 ) | ( val2 >>> 28 ) ;
			decode[ decodeOffset ++ ]  =  ( val3 << 26 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 21 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 16 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 11 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 6  ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 1  ) >>> 27 ;

			decode[ decodeOffset ++ ]  =  ( ( val4 << 28 ) >>> 27 ) | ( val3 >>> 31 ) ;
			decode[ decodeOffset ++ ]  =  ( val4 << 23 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 18 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 13 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 8  ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 3  ) >>> 27 ;

			decode[ decodeOffset ++ ]  =  ( ( val5 << 30 ) >>> 27 ) | ( val4 >>> 29 ) ;
			decode[ decodeOffset ++ ]  =  ( val5 << 25 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val5 << 20 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val5 << 15 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val5 << 10 ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  ( val5 << 5  ) >>> 27 ;
			decode[ decodeOffset ++ ]  =  val5 >>> 27 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++  ];
		decode[ decodeOffset ]  =  ( val1 << 27 ) >>>  27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 22 ) >>>  27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 17 ) >>>  27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 12 ) >>>  27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 7  ) >>>  27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 2  ) >>>  27 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++  ];
		decode[ ++decodeOffset ]   =  ( ( val2 << 29 ) >>> 27 ) | ( val1 >>> 30 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]   =  ( val2 << 24 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]   =  ( val2 << 19 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]   =  ( val2 << 14 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 9  ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 4  ) >>> 27 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val3 << 31 ) >>> 27 ) | ( val2 >>> 28 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 26 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 21 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 16 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 11 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 6  ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 1  ) >>> 27 ;
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val4 << 28 ) >>> 27 ) | ( val3 >>> 31 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 23 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 18 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 13 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 8  ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 3  ) >>> 27 ;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val5 << 30 ) >>> 27 ) | ( val4 >>> 29 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 25 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 20 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 15 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 10 ) >>> 27 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 5  ) >>> 27 ;
		return offSet;

	}


	static int fastDeCompressFor6Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 4;
		int rest		=  dataNum % 16;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];
			int val2 = encodedValue[ offSet++ ];
			int val3 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]  =  ( val1 << 26 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val1 << 20 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val1 << 14 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val1 <<  8 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val1 <<  2 ) >>> 26 ;

			decode[ decodeOffset++ ]  = ( ( val2 << 28 ) >>> 26 ) | ( val1 >>> 30 );
			decode[ decodeOffset++ ]  =  ( val2 << 22 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val2 << 16 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val2 << 10 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val2 <<  4 ) >>> 26 ;

			decode[ decodeOffset++ ]  =  ( ( val3 << 30 ) >>> 26 ) | ( val2 >>> 28 );
			decode[ decodeOffset++ ]  =  ( val3 << 24 )  >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val3 << 18 )  >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val3 << 12 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  ( val3 <<  6 ) >>> 26 ;
			decode[ decodeOffset++ ]  =  val3 >>> 26 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset  ]  =  ( val1 << 26 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 20 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 14 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 <<  8 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 <<  2 ) >>> 26 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  = ( ( val2 << 28 ) >>> 26 ) | ( val1 >>> 30 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 22 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 16 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 10 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 <<  4 ) >>> 26 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val3 << 30 ) >>> 26 ) | ( val2 >>> 28 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 24 )  >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 18 )  >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 12 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 <<  6 ) >>> 26 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  val3 >>> 26 ;
		return offSet;

	}


	static int fastDeCompressFor7Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet ++ ];
			int val2 = encodedValue[ offSet ++ ];
			int val3 = encodedValue[ offSet ++ ];
			int val4 = encodedValue[ offSet ++ ];
			int val5 = encodedValue[ offSet ++ ];
			int val6 = encodedValue[ offSet ++ ];
			int val7 = encodedValue[ offSet ++ ];

			decode[ decodeOffset++ ]  =  ( val1 << 25 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val1 << 18 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val1 << 11 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val1 <<  4 ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val2 << 29 ) >>> 25 ) | ( val1 >>> 28 ) ;
			decode[ decodeOffset++ ]  =  ( val2 << 22 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val2 << 15 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val2 << 8  ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val2 << 1  ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val3 << 26 ) >>> 25 ) | ( val2 >>> 31 ) ;
			decode[ decodeOffset++ ]  =  ( val3 << 19 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val3 << 12 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val3 <<  5 ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val4 << 30 ) >>> 25 ) | ( val3 >>> 27 ) ;
			decode[ decodeOffset++ ]  =  ( val4 << 23 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val4 << 16 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val4 << 9  ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val4 << 2  ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val5 << 27 ) >>> 25 ) | ( val4 >>> 30 ) ;
			decode[ decodeOffset++ ]  =  ( val5 << 20 ) >>> 25  ;
			decode[ decodeOffset++ ]  =  ( val5 << 13 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val5 <<  6 ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val6 << 31 ) >>> 25 ) |  ( val5 >>> 26 ) ;
			decode[ decodeOffset++ ]  =  ( val6 << 24 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val6 << 17 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val6 << 10 ) >>> 25 ;
			decode[ decodeOffset++ ]  =  ( val6 <<  3 ) >>> 25 ;

			decode[ decodeOffset++ ]  =  ( ( val7 << 28 ) >>> 25 ) |  ( val6 >>> 29 ) ;
			decode[ decodeOffset++ ]  =  ( val7 << 21 ) >>> 25;
			decode[ decodeOffset++ ]  =  ( val7 << 14 ) >>> 25;
			decode[ decodeOffset++ ]  =  ( val7 << 7  ) >>> 25;
			decode[ decodeOffset++ ]  =  val7 >>> 25;

		}

		if( rest == 0 )
			return offSet;


		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]  =  ( val1 << 25 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 18 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 11 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val1 <<  4 ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val2 << 29 ) >>> 25 ) | ( val1 >>> 28 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 22 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 15 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 8  ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 1  ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val3 << 26 ) >>> 25 ) | ( val2 >>> 31 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 19 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 12 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val3 <<  5 ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val4 << 30 ) >>> 25 ) | ( val3 >>> 27 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 23 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 16 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 9  ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 2  ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val5 << 27 ) >>> 25 ) | ( val4 >>> 30 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 20 ) >>> 25  ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 13 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val5 <<  6 ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val6 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val6 << 31 ) >>> 25 ) |  ( val5 >>> 26 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 24 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 17 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 10 ) >>> 25 ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val6 <<  3 ) >>> 25 ;
		if( --rest == 0 )return offSet;

		int val7 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val7 << 28 ) >>> 25 ) |  ( val6 >>> 29 ) ;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val7 << 21 ) >>> 25;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val7 << 14 ) >>> 25;
		if( --rest == 0 )return offSet;
		decode[ ++decodeOffset ]  =  ( val7 << 7  ) >>> 25;
		return offSet;

	}


	static int fastDeCompressFor8Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 2;
		int rest		=  dataNum % 4;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];

			decode[ decodeOffset ++	]  =  ( val1 << 24 ) >>> 24 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 16 ) >>> 24 ;
			decode[ decodeOffset ++ ]  =  ( val1 <<  8 ) >>> 24 ;
			decode[ decodeOffset ++ ]  =  val1 >>> 24 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];

		decode[ decodeOffset   ]  =  ( val1 << 24 ) >>> 24 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 16 ) >>> 24 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 8  ) >>> 24 ;
		return offSet;

	}


	static int fastDeCompressFor9Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet ++ ];
			int val2 = encodedValue[ offSet ++ ];
			int val3 = encodedValue[ offSet ++ ];
			int val4 = encodedValue[ offSet ++ ];
			int val5 = encodedValue[ offSet ++ ];
			int val6 = encodedValue[ offSet ++ ];
			int val7 = encodedValue[ offSet ++ ];
			int val8 = encodedValue[ offSet ++ ];
			int val9 = encodedValue[ offSet ++ ];

			decode[ decodeOffset ++ ]  =  ( val1 << 23 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 14 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val1 << 5  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val2 << 28 ) >>> 23 ) | ( val1 >>> 27 ) ;

			decode[ decodeOffset ++ ]  =  ( val2 << 19 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 10 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val2 << 1  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val3 << 24 ) >>> 23 ) | ( val2 >>> 31 ) ;

			decode[ decodeOffset ++ ]  =  ( val3 << 15 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val3 << 6  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val4 << 29 ) >>> 23 ) | ( val3 >>> 26 ) ;

			decode[ decodeOffset ++ ]  =  ( val4 << 20 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 11 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val4 << 2  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val5 << 25 ) >>> 23 ) | ( val4 >>> 30 ) ;

			decode[ decodeOffset ++ ]  =  ( val5 << 16 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val5 << 7  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val6 << 30 ) >>> 23 ) | ( val5 >>> 25 ) ;

			decode[ decodeOffset ++ ]  =  ( val6 << 21 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val6 << 12 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val6 << 3  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val7 << 26 ) >>> 23 ) | ( val6 >>> 29 ) ;

			decode[ decodeOffset ++ ]  =  ( val7 << 17 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val7 << 8  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val8 << 31 ) >>> 23 ) | ( val7 >>> 24 ) ;

			decode[ decodeOffset ++ ]  =  ( val8 << 22 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val8 << 13 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val8 << 4  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( ( val9 << 27 ) >>> 23 ) | ( val8 >>> 28 ) ;

			decode[ decodeOffset ++ ]  =  ( val9 << 18 ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val9 << 9  ) >>> 23 ;
			decode[ decodeOffset ++ ]  =  ( val9 ) >>> 23 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset ]  =  ( val1 << 23 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 14 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 5  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++  ];
		decode[ ++decodeOffset ]  =  ( ( val2 << 28 ) >>> 23 ) | ( val1 >>> 27 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 19 ) >>> 23 ;							//5
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 10 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 1  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val3 << 24 ) >>> 23 ) | ( val2 >>> 31 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 15 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 6  ) >>> 23 ;							//10
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val4 << 29 ) >>> 23 ) | ( val3 >>> 26 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 20 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 11 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 2  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val5 << 25 ) >>> 23 ) | ( val4 >>> 30 ) ;		//15
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 16 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 7  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val6 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val6 << 30 ) >>> 23 ) | ( val5 >>> 25 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 21 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 12 ) >>> 23 ;							//20
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val6 << 3  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val7 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val7 << 26 ) >>> 23 ) | ( val6 >>> 29 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val7 << 17 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val7 << 8  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val8 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val8 << 31 ) >>> 23 ) | ( val7 >>> 24 ) ;		//25
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val8 << 22 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val8 << 13 ) >>> 23 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val8 << 4  ) >>> 23 ;
		if( --rest == 0 ) return offSet;

		int val9 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val9 << 27 ) >>> 23 ) | ( val8 >>> 28 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val9 << 18 ) >>> 23 ;							//30
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val9 << 9  ) >>> 23 ;
		return offSet;

	}



	static int fastDeCompressFor10Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode){

		int maxBlocks	=  dataNum >> 4;
		int rest		=  dataNum % 16;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];
			int val2 = encodedValue[ offSet++ ];
			int val3 = encodedValue[ offSet++ ];
			int val4 = encodedValue[ offSet++ ];
			int val5 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]  =  ( val1 << 22 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val1 << 12 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val1 <<  2 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( ( val2 << 24 ) >>> 22 ) | ( val1 >>> 30 ) ;

			decode[ decodeOffset++ ]  =  ( val2 << 14 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val2 <<  4 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( ( val3 << 26 ) >>> 22 ) | ( val2 >>> 28 ) ;

			decode[ decodeOffset++ ]  =  ( val3 << 16 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val3 <<  6 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( ( val4 << 28 ) >>> 22 ) | ( val3 >>> 26 ) ;

			decode[ decodeOffset++ ]  =  ( val4 << 18 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val4 <<  8 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( ( val5 << 30 ) >>> 22 ) | ( val4 >>> 24 ) ;

			decode[ decodeOffset++ ]  =  ( val5 << 20 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  ( val5 << 10 ) >>> 22 ;
			decode[ decodeOffset++ ]  =  val5 >>> 22 ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[   decodeOffset ]  =  ( val1 << 22 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 << 12 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val1 <<  2 ) >>> 22 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val2 << 24 ) >>> 22 ) | ( val1 >>> 30 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 << 14 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val2 <<  4 ) >>> 22 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val3 << 26 ) >>> 22 ) | ( val2 >>> 28 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 << 16 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val3 <<  6 ) >>> 22 ;
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val4 << 28 ) >>> 22 ) | ( val3 >>> 26 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 << 18 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val4 <<  8 ) >>> 22 ;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val5 << 30 ) >>> 22 ) | ( val4 >>> 24 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 20 ) >>> 22 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val5 << 10 ) >>> 22 ;
		return offSet;

	}


	static int fastDeCompressFor11Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet ++ ];
			int val2  = encodedValue[ offSet ++ ];
			int val3  = encodedValue[ offSet ++ ];
			int val4  = encodedValue[ offSet ++ ];
			int val5  = encodedValue[ offSet ++ ];
			int val6  = encodedValue[ offSet ++ ];
			int val7  = encodedValue[ offSet ++ ];
			int val8  = encodedValue[ offSet ++ ];
			int val9  = encodedValue[ offSet ++ ];
			int val10 = encodedValue[ offSet ++ ];
			int val11 = encodedValue[ offSet ++ ];

			decode[ decodeOffset++ ]  =	( val1 << 21 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val1 << 10 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val2 << 31) >>> 21 ) | ( val1 >>> 22 ) ;

			decode[ decodeOffset++ ]  =	( val2 << 20 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val2 << 9  ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val3 << 30 ) >>> 21 ) | ( val2 >>> 23 ) ;

			decode[ decodeOffset++ ]  =	( val3 << 19 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val3 <<  8 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val4 << 29 ) >>> 21 ) | ( val3 >>> 24 ) ;

			decode[ decodeOffset++ ]  =	( val4 << 18  ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val4 <<  7  ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val5 << 28 ) >>> 21 ) | ( val4 >>> 25 ) ;

			decode[ decodeOffset++ ]  =	( val5 << 17 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val5 <<  6 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val6 << 27 ) >>> 21 ) | ( val5 >>> 26 ) ;

			decode[ decodeOffset++ ]  =	( val6 << 16 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val6 <<  5 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val7 << 26 ) >>> 21 ) | ( val6 >>> 27 ) ;

			decode[ decodeOffset++ ]  =	( val7 << 15 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val7 <<  4 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val8 << 25 ) >>> 21 ) | ( val7 >>> 28 ) ;

			decode[ decodeOffset++ ]  =	( val8 << 14 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val8 <<  3 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val9 << 24 ) >>> 21 ) | ( val8 >>> 29 ) ;

			decode[ decodeOffset++ ]  =	( val9 << 13 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val9 <<  2 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val10 << 23 ) >>> 21 ) | ( val9 >>> 30 ) ;

			decode[ decodeOffset++ ]  =	( val10 << 12 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( val10 <<  1 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	( ( val11 << 22 ) >>> 21  ) | ( val10 >>> 31 ) ;

			decode[ decodeOffset++ ]  =	( val11 << 11 ) >>> 21 ;
			decode[ decodeOffset++ ]  =	val11 >>> 21;

		}


		if( rest == 0 )
			return offSet;;


		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	=   ( val1 << 21 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	=   ( val1 << 10 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	=   ( ( val2 << 31) >>> 21 ) | ( val1 >>> 22 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	=   ( val2 << 20 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	=   ( val2 << 9  ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val3 << 30 ) >>> 21 ) | ( val2 >>> 23 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =   ( val3 << 19 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	=   ( val3 <<  8 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val4 << 29 ) >>> 21 ) | ( val3 >>> 24 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]   =   ( val4 << 18  ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 <<  7  ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val5 << 28 ) >>> 21 ) | ( val4 >>> 25 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =   ( val5 << 17 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 <<  6 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val6 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val6 << 27 ) >>> 21 ) | ( val5 >>> 26 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =   ( val6 << 16 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 <<  5 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val7 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val7 << 26 ) >>> 21 ) | ( val6 >>> 27 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =   ( val7 << 15 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 <<  4 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val8 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val8 << 25 ) >>> 21 ) | ( val7 >>> 28 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =   ( val8 << 14 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 <<  3 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val9 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =   ( ( val9 << 24 ) >>> 21 ) | ( val8 >>> 29 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val9 << 13 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =  ( val9 <<  2 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val10 << 23 ) >>> 21 ) | ( val9 >>> 30 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val10 << 12 ) >>> 21 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =  ( val10 <<  1 ) >>> 21 ;
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]  =  ( ( val11 << 22 ) >>> 21  ) | ( val10 >>> 31 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]  =  ( val11 << 11 ) >>> 21 ;
		return offSet;
	}


	static int fastDeCompressFor12Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 3;
		int rest		=  dataNum % 8;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];
			int val2 = encodedValue[ offSet++ ];
			int val3 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 20 ) >>> 20;
			decode[ decodeOffset++ ]	 =   ( val1 <<  8  ) >>> 20;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 28 ) >>> 20 ) | ( val1 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val2 << 16 ) >>> 20;
			decode[ decodeOffset++ ]	 =   ( val2 <<  4 ) >>> 20;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 24 ) >>> 20 ) | ( val2 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( val3 << 12 ) >>> 20;
			decode[ decodeOffset++ ]	 =   val3 >>> 20;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	 =   ( val1 << 20 ) >>> 20;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val1 <<  8  ) >>> 20;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 28 ) >>> 20 ) | ( val1 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 16 ) >>> 20;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 <<  4 ) >>> 20;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 24 ) >>> 20 ) | ( val2 >>> 28 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 12 ) >>> 20;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   val3 >>> 20;
		return offSet;
	}


	static int fastDeCompressFor13Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 5;
		int rest		=  dataNum % 32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10 = encodedValue[ offSet++ ];
			int val11 = encodedValue[ offSet++ ];
			int val12 = encodedValue[ offSet++ ];
			int val13 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 19 ) >>> 19;
			decode[ decodeOffset++ ]	 =   ( val1 << 6  ) >>> 19;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 25 ) >>> 19 ) | ( val1 >>> 26 );

			decode[ decodeOffset++ ]	 =   ( val2 << 12 ) >>> 19;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 31 ) >>> 19 ) | ( val2 >>> 20 );

			decode[ decodeOffset++ ]	 =   ( val3 << 18 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( val3 << 5  ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val4 << 24 ) >>> 19 ) | ( val3 >>> 27 );

			decode[ decodeOffset++ ]	 =   ( val4 << 11 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val5 << 30 ) >>> 19 ) | ( val4 >>> 21 );

			decode[ decodeOffset++ ]	 =   ( val5 << 17 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( val5 << 4  ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val6 << 23 ) >>> 19 ) | ( val5 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( val6 << 10 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val7 << 29 ) >>> 19 ) | ( val6 >>> 22 );

			decode[ decodeOffset++ ]	 =   ( val7 << 16 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( val7 <<  3 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val8 << 22 ) >>> 19 ) | ( val7 >>> 29 );

			decode[ decodeOffset++ ]	 =   ( val8 << 9 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   (( val9 << 28  ) >>> 19 ) | ( val8 >>> 23 );

			decode[ decodeOffset++ ]	 =   ( val9 << 15 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( val9 << 2  ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val10 << 21  ) >>> 19 ) | ( val9 >>> 30 );

			decode[ decodeOffset++ ]	 =   ( val10 << 8 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val11 << 27  ) >>> 19 ) | ( val10 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val11 << 14 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( val11 <<  1 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val12 << 20  ) >>> 19 ) | ( val11 >>> 31 );

			decode[ decodeOffset++ ]	 =   ( val12 << 7 ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   ( ( val13 << 26  ) >>> 19 ) | ( val12 >>> 25 );

			decode[ decodeOffset++ ]	 =   ( val13 << 13  ) >>> 19 ;
			decode[ decodeOffset++ ]	 =   val13 >>> 19;

		}

		if( rest == 0 )
			return offSet;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	 =   ( val1 << 19 ) >>> 19;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val1 << 6  ) >>> 19;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 25 ) >>> 19 ) | ( val1 >>> 26 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 12 ) >>> 19;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 31 ) >>> 19 ) | ( val2 >>> 20 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 18 ) >>> 19 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 5  ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 24 ) >>> 19 ) | ( val3 >>> 27 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 11 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 30 ) >>> 19 ) | ( val4 >>> 21 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 17 ) >>> 19 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 4  ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 23 ) >>> 19 ) | ( val5 >>> 28 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 10 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 29 ) >>> 19 ) | ( val6 >>> 22 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 << 16 ) >>> 19 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 <<  3 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val8 << 22 ) >>> 19 ) | ( val7 >>> 29 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 << 9 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   (( val9 << 28  ) >>> 19 ) | ( val8 >>> 23 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val9 << 15 ) >>> 19 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val9 << 2  ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val10 << 21  ) >>> 19 ) | ( val9 >>> 30 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val10 << 8 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val11 << 27  ) >>> 19 ) | ( val10 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val11 << 14 ) >>> 19 ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val11 <<  1 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val12 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val12 << 20  ) >>> 19 ) | ( val11 >>> 31 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val12 << 7 ) >>> 19 ;
		if( --rest == 0 ) return offSet;

		int val13 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val13 << 26  ) >>> 19 ) | ( val12 >>> 25 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val13 << 13  ) >>> 19 ;
		return offSet;
	}


	static int fastDeCompressFor14Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum >> 4;
		int rest		=  dataNum % 16;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];
			int val2 = encodedValue[ offSet++ ];
			int val3 = encodedValue[ offSet++ ];
			int val4 = encodedValue[ offSet++ ];
			int val5 = encodedValue[ offSet++ ];
			int val6 = encodedValue[ offSet++ ];
			int val7 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 18 ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( val1 <<  4 ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 22 ) >>> 18 ) | ( val1 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( val2 << 8  ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 26 ) >>> 18 ) | ( val2 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val3 << 12 ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val4 << 30 ) >>> 18 ) | ( val3 >>> 20 );

			decode[ decodeOffset++ ]	 =   ( val4 << 16 ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( val4 << 2  ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val5 << 20 ) >>> 18 ) | ( val4 >>> 30 );

			decode[ decodeOffset++ ]	 =   ( val5 << 6 )  >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val6 << 24 ) >>> 18 ) | ( val5 >>> 26 );

			decode[ decodeOffset++ ]	 =   ( val6 << 10 ) >>> 18;
			decode[ decodeOffset++ ]	 =   ( ( val7 << 28 ) >>> 18 ) | ( val6 >>> 22 );

			decode[ decodeOffset++ ]	 =   ( val7 << 14 ) >>> 18;
			decode[ decodeOffset++ ]	 =   val7 >>> 18;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset ]	 =   ( val1 << 18 ) >>> 18;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val1 <<  4 ) >>> 18;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 22 ) >>> 18 ) | ( val1 >>> 28 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 8  ) >>> 18;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 26 ) >>> 18 ) | ( val2 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 12 ) >>> 18;
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 30 ) >>> 18 ) | ( val3 >>> 20 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 16 ) >>> 18;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 2  ) >>> 18;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 20 ) >>> 18 ) | ( val4 >>> 30 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 6 )  >>> 18;
		if( --rest == 0 ) return offSet;

		int val6 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 24 ) >>> 18 ) | ( val5 >>> 26 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 10 ) >>> 18;
		if( --rest == 0 ) return offSet;

		int val7 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 28 ) >>> 18 ) | ( val6 >>> 22 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 << 14 ) >>> 18;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   val7 >>> 18;
		return offSet;

	}


	static int fastDeCompressFor15Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  5;
		int rest		=  dataNum  %  32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10 = encodedValue[ offSet++ ];
			int val11 = encodedValue[ offSet++ ];
			int val12 = encodedValue[ offSet++ ];
			int val13 = encodedValue[ offSet++ ];
			int val14 = encodedValue[ offSet++ ];
			int val15 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 17 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( val1 << 2  ) >>> 17;
			decode[ decodeOffset++ ]	 =   (( val2 << 19 ) >>>  17 ) | ( val1 >>> 30 );

			decode[ decodeOffset++ ]	 =   ( val2 << 4 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 21 ) >>> 17 ) | ( val2 >>> 28 ) ;

			decode[ decodeOffset++ ]	 =   ( val3 << 6  ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val4 << 23  ) >>> 17 ) | ( val3 >>> 26 );

			decode[ decodeOffset++ ]	 =   ( val4 << 8  ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val5 << 25 ) >>> 17 ) | ( val4 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val5 << 10 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val6 << 27 ) >>> 17 ) | ( val5 >>> 22 );

			decode[ decodeOffset++ ]	 =   ( val6 << 12 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val7 << 29 ) >>> 17 ) | ( val6 >>> 20 );

			decode[ decodeOffset++ ]	 =   ( val7  << 14 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val8 << 31 ) >>> 17 ) | ( val7 >>> 18 );

			decode[ decodeOffset++ ]	 =   ( val8 << 16 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( val8 <<  1 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val9 << 18  ) >>> 17 ) | ( val8 >>> 31 );

			decode[ decodeOffset++ ]	 =   ( val9 << 3 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val10 << 20 ) >>> 17 ) | ( val9 >>> 29 );

			decode[ decodeOffset++ ]	 =   ( val10 << 5 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val11 << 22 ) >>> 17 ) | ( val10 >>> 27 );

			decode[ decodeOffset++ ]	 =   ( val11 << 7 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val12 << 24 ) >>> 17 ) | ( val11 >>> 25 );

			decode[ decodeOffset++ ]	 =   ( val12 << 9 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val13 << 26 ) >>> 17 ) | ( val12 >>> 23 );

			decode[ decodeOffset++ ]	 =   ( val13 << 11 ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val14 << 28 ) >>> 17 ) | ( val13 >>> 21 );

			decode[ decodeOffset++ ]	 =   ( val14 << 13  ) >>> 17;
			decode[ decodeOffset++ ]	 =   ( ( val15 << 30 ) >>> 17 ) | ( val14 >>> 19 );

			decode[ decodeOffset++ ]	 =   ( val15 << 15  ) >>> 17;
			decode[ decodeOffset++ ]	 =   val15 >>> 17 ;

		}

		if( rest == 0 )
			return offSet;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	 =   ( val1 << 17 ) >>> 17;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val1 << 2  ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   (( val2 << 19 ) >>>  17 ) | ( val1 >>> 30 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 4 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 21 ) >>> 17 ) | ( val2 >>> 28 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 6  ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 23  ) >>> 17 ) | ( val3 >>> 26 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 8  ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 25 ) >>> 17 ) | ( val4 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 10 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 27 ) >>> 17 ) | ( val5 >>> 22 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 12 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 29 ) >>> 17 ) | ( val6 >>> 20 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7  << 14 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val8 << 31 ) >>> 17 ) | ( val7 >>> 18 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 << 16 ) >>> 17;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 <<  1 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val9 << 18  ) >>> 17 ) | ( val8 >>> 31 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val9 << 3 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val10 << 20 ) >>> 17 ) | ( val9 >>> 29 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val10 << 5 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val11 << 22 ) >>> 17 ) | ( val10 >>> 27 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val11 << 7 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val12 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val12 << 24 ) >>> 17 ) | ( val11 >>> 25 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val12 << 9 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val13 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val13 << 26 ) >>> 17 ) | ( val12 >>> 23 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val13 << 11 ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val14 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val14 << 28 ) >>> 17 ) | ( val13 >>> 21 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val14 << 13  ) >>> 17;
		if( --rest == 0 ) return offSet;

		int val15 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val15 << 30 ) >>> 17 ) | ( val14 >>> 19 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val15 << 15  ) >>> 17;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   val15 >>> 17 ;
		return offSet;

	}


	static int fastDeCompressFor16Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){


		int maxBlocks	=  dataNum >> 1;
		int rest		=  dataNum  %  2;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet++ ];

			decode[ decodeOffset ++ ]	 =   ( val1 << 16 ) >>> 16;
			decode[ decodeOffset ++ ]	 =   ( val1 >>> 16 ) ;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset ] = ( val1 << 16 ) >>>  16;
		return offSet;

	}


	static int fastDeCompressFor17Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  5;
		int rest		=  dataNum  %  32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10 = encodedValue[ offSet++ ];
			int val11 = encodedValue[ offSet++ ];
			int val12 = encodedValue[ offSet++ ];
			int val13 = encodedValue[ offSet++ ];
			int val14 = encodedValue[ offSet++ ];
			int val15 = encodedValue[ offSet++ ];
			int val16 = encodedValue[ offSet++ ];
			int val17 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 15 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 30 ) >>> 15 ) | ( val1 >>> 17 );

			decode[ decodeOffset++ ]	 =   ( val2 << 13 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 28 ) >>> 15 ) | ( val2 >>> 19 );

			decode[ decodeOffset++ ]	 =   ( val3 << 11 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val4 << 26 ) >>> 15 ) | ( val3 >>> 21 );

			decode[ decodeOffset++ ]	 =   ( val4 << 9  ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val5 << 24 ) >>> 15 ) | ( val4 >>> 23 );

			decode[ decodeOffset++ ]	 =   ( val5 << 7  ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val6 << 22 ) >>> 15 ) | ( val5 >>> 25 );

			decode[ decodeOffset++ ]	 =   ( val6 << 5  ) >>>  15 ;
			decode[ decodeOffset++ ]	 =   ( ( val7 << 20 ) >>> 15 ) | ( val6 >>> 27 );

			decode[ decodeOffset++ ]	 =   ( val7 << 3  ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val8 << 18 ) >>> 15 ) | ( val7 >>> 29 );

			decode[ decodeOffset++ ]	 =   ( val8 << 1  ) >>>  15 ;
			decode[ decodeOffset++ ]	 =   ( ( val9 << 16 ) >>> 15 ) | ( val8 >>> 31 );

			decode[ decodeOffset++ ]	 =   ( ( val10 << 31 ) >>> 15 ) | ( val9 >>> 16 );

			decode[ decodeOffset++ ]	 =   ( val10 << 14 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val11 << 29 ) >>> 15 ) | ( val10 >>> 18 );

			decode[ decodeOffset++ ]	 =   ( val11 << 12 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val12 << 27 ) >>> 15 ) | ( val11 >>> 20 );

			decode[ decodeOffset++ ]	 =   ( val12 << 10 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val13 << 25 ) >>> 15 ) | ( val12 >>> 22 );

			decode[ decodeOffset++ ]	 =   ( val13 << 8 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val14 << 23 ) >>> 15 ) | ( val13 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val14 << 6 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val15 << 21 ) >>> 15 ) | ( val14 >>> 26 );

			decode[ decodeOffset++ ]	 =   ( val15 << 4 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val16 << 19 ) >>> 15 ) | ( val15 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( val16 >> 2 ) >>> 15 ;
			decode[ decodeOffset++ ]	 =   ( ( val17 << 17 ) >>> 15 ) | ( val16 >>> 30 );

			decode[ decodeOffset++ ]	 =   val17 >>> 15 ;

		}

		if( rest == 0 )
			return offSet;


		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset ]	 =   ( val1 << 15 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 30 ) >>> 15 ) | ( val1 >>> 17 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 13 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 28 ) >>> 15 ) | ( val2 >>> 19 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 11 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 26 ) >>> 15 ) | ( val3 >>> 21 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 9  ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 24 ) >>> 15 ) | ( val4 >>> 23 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 7  ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 22 ) >>> 15 ) | ( val5 >>> 25 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 5  ) >>>  15 ;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 20 ) >>> 15 ) | ( val6 >>> 27 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 << 3  ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val8 << 18 ) >>> 15 ) | ( val7 >>> 29 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 << 1  ) >>>  15 ;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val9 << 16 ) >>> 15 ) | ( val8 >>> 31 );
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val10 << 31 ) >>> 15 ) | ( val9 >>> 16 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val10 << 14 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val11 << 29 ) >>> 15 ) | ( val10 >>> 18 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val11 << 12 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val12 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val12 << 27 ) >>> 15 ) | ( val11 >>> 20 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val12 << 10 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val13 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val13 << 25 ) >>> 15 ) | ( val12 >>> 22 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val13 << 8 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val14 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val14 << 23 ) >>> 15 ) | ( val13 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val14 << 6 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val15 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val15 << 21 ) >>> 15 ) | ( val14 >>> 26 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val15 << 4 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val16 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val16 << 19 ) >>> 15 ) | ( val15 >>> 28 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val16 >> 2 ) >>> 15 ;
		if( --rest == 0 ) return offSet;

		int val17 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val17 << 17 ) >>> 15 ) | ( val16 >>> 30 );
		return offSet;

	}


	static int fastDeCompressFor18Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  4;
		int rest		=  dataNum  %  16;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1 = encodedValue[ offSet ++ ];
			int val2 = encodedValue[ offSet ++ ];
			int val3 = encodedValue[ offSet ++ ];
			int val4 = encodedValue[ offSet ++ ];
			int val5 = encodedValue[ offSet ++ ];
			int val6 = encodedValue[ offSet ++ ];
			int val7 = encodedValue[ offSet ++ ];
			int val8 = encodedValue[ offSet ++ ];
			int val9 = encodedValue[ offSet ++ ];

			decode[ decodeOffset ++	]	 =   (val1 << 14 ) >>> 14;
			decode[ decodeOffset ++	]	 =   ( ( val2 << 28 ) >>> 14 ) | ( val1 >>> 18 ) ;

			decode[ decodeOffset ++	]	 =   ( val2 << 10 ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val3 << 24 ) >>> 14 ) | ( val2 >>> 22 ) ;

			decode[ decodeOffset ++	]	 =   ( val3 << 6  ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val4 << 20 ) >>> 14 ) | ( val3 >>> 26 ) ;

			decode[ decodeOffset ++	]	 =   ( val4 << 2  ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val5 << 16 ) >>> 14 ) | ( val4 >>> 30 ) ;

			decode[ decodeOffset ++	]	 =   ( ( val6 << 30 ) >>> 14 ) | ( val5 >>> 16 ) ;

			decode[ decodeOffset ++	]	 =   ( val6 << 12 ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val7 << 26 ) >>> 14 ) | ( val6 >>> 20 ) ;

			decode[ decodeOffset ++	]	 =   ( val7 << 8  ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val8 << 22 ) >>> 14 ) | ( val7 >>> 24 ) ;

			decode[ decodeOffset ++	]	 =   ( val8 << 4  ) >>> 14 ;
			decode[ decodeOffset ++	]	 =   ( ( val9 << 18 ) >>> 14 ) | ( val8 >>> 28 ) ;

			decode[ decodeOffset ++	]	 =   val9 >>> 14;

		}

		if( rest == 0 )
			return offSet;

		int val1 = encodedValue[ offSet++ ];
		decode[ decodeOffset ]	 =   (val1 << 14 ) >>> 14;
		if( --rest == 0 ) return offSet;

		int val2 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 28 ) >>> 14 ) | ( val1 >>> 18 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 10 ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val3 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 24 ) >>> 14 ) | ( val2 >>> 22 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 6  ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val4 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 20 ) >>> 14 ) | ( val3 >>> 26 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 2  ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val5 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 16 ) >>> 14 ) | ( val4 >>> 30 ) ;
		if( --rest == 0 ) return offSet;

		int val6 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 30 ) >>> 14 ) | ( val5 >>> 16 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 12 ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val7 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 26 ) >>> 14 ) | ( val6 >>> 20 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val7 << 8  ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val8 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val8 << 22 ) >>> 14 ) | ( val7 >>> 24 ) ;
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 << 4  ) >>> 14 ;
		if( --rest == 0 ) return offSet;

		int val9 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val9 << 18 ) >>> 14 ) | ( val8 >>> 28 ) ;
		return offSet;

	}


	static int fastDeCompressFor19Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  5;
		int rest		=  dataNum  %  32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10 = encodedValue[ offSet++ ];
			int val11 = encodedValue[ offSet++ ];
			int val12 = encodedValue[ offSet++ ];
			int val13 = encodedValue[ offSet++ ];
			int val14 = encodedValue[ offSet++ ];
			int val15 = encodedValue[ offSet++ ];
			int val16 = encodedValue[ offSet++ ];
			int val17 = encodedValue[ offSet++ ];
			int val18 = encodedValue[ offSet++ ];
			int val19 = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 13) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 26 ) >>> 13 ) | ( val1 >>> 19 );

			decode[ decodeOffset++ ]	 =   ( val2 << 7 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 20 ) >>> 13 ) | ( val2 >>> 25 );

			decode[ decodeOffset++ ]	 =   ( val3 << 1  ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val4 << 14 ) >>> 13 ) | ( val3 >>> 31 );

			decode[ decodeOffset++ ]	 =   ( ( val5 << 27 ) >>> 13 ) | ( val4 >>> 18 );

			decode[ decodeOffset++ ]	 =   ( val5 << 8  ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val6 << 8  ) >>> 21 ) | ( val5 >>> 24 );

			decode[ decodeOffset++ ]	 =   ( val6 << 2 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val7 << 15 ) >>> 13 ) | ( val6 >>> 30 );

			decode[ decodeOffset++ ]	 =   ( ( val8 << 28 ) >>> 13 ) | ( val7 >>> 17 );

			decode[ decodeOffset++ ]	 =   ( val8 << 9 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val9 << 22 ) >>> 13 ) | ( val8 >>> 23 );

			decode[ decodeOffset++ ]	 =   ( val9 << 3 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val10 << 16 ) >>> 13 ) | ( val9 >>> 29 );

			decode[ decodeOffset++ ]	 =   ( ( val11 << 29 ) >>> 13 ) | ( val10 >>> 16 );

			decode[ decodeOffset++ ]	 =   ( val11 << 10 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val12 << 23 ) >>> 13 ) | ( val11 >>> 22 );

			decode[ decodeOffset++ ]	 =   ( val12 << 4 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val13 << 17 ) >>> 13 ) | ( val12 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( ( val14 << 30 ) >>> 13 ) | ( val13 >>> 15 );

			decode[ decodeOffset++ ]	 =   ( val14 << 11 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val15 << 24 ) >>> 13 ) | ( val14 >>> 21 );

			decode[ decodeOffset++ ]	 =   ( val15 << 5 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val16 << 18 ) >>> 13 ) | ( val15 >>> 27 );

			decode[ decodeOffset++ ]	 =   ( ( val17 << 31 ) >>> 13 ) | ( val16 >>> 14 );

			decode[ decodeOffset++ ]	 =   ( val17 << 12 ) >>> 13;
			decode[ decodeOffset++ ]	 =   ( ( val18 << 25 ) >>> 13 ) | ( val17 >>> 20 );

			decode[ decodeOffset++ ]	 =   ( val18 << 6 ) >>> 13;
			decode[ decodeOffset++ ]	 =   (( val19 << 19  ) >>> 13 ) | ( val18 >>> 26 );

			decode[ decodeOffset++ ]	 =   val19 >>> 13 ;

		}

		if( rest == 0 )
			return offSet;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	 =   ( val1 << 13) >>> 13;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 26 ) >>> 13 ) | ( val1 >>> 19 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 7 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 20 ) >>> 13 ) | ( val2 >>> 25 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val3 << 1  ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 14 ) >>> 13 ) | ( val3 >>> 31 );
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 27 ) >>> 13 ) | ( val4 >>> 18 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val5 << 8  ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val6 << 8  ) >>> 21 ) | ( val5 >>> 24 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val6 << 2 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val7 << 15 ) >>> 13 ) | ( val6 >>> 30 );
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val8 << 28 ) >>> 13 ) | ( val7 >>> 17 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val8 << 9 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val9 << 22 ) >>> 13 ) | ( val8 >>> 23 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val9 << 3 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val10 << 16 ) >>> 13 ) | ( val9 >>> 29 );
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val11 << 29 ) >>> 13 ) | ( val10 >>> 16 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val11 << 10 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val12 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val12 << 23 ) >>> 13 ) | ( val11 >>> 22 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val12 << 4 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val13 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val13 << 17 ) >>> 13 ) | ( val12 >>> 28 );
		if( --rest == 0 ) return offSet;

		int val14 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val14 << 30 ) >>> 13 ) | ( val13 >>> 15 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val14 << 11 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val15 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val15 << 24 ) >>> 13 ) | ( val14 >>> 21 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val15 << 5 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val16 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val16 << 18 ) >>> 13 ) | ( val15 >>> 27 );
		if( --rest == 0 ) return offSet;

		int val17 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val17 << 31 ) >>> 13 ) | ( val16 >>> 14 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val17 << 12 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val18 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val18 << 25 ) >>> 13 ) | ( val17 >>> 20 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val18 << 6 ) >>> 13;
		if( --rest == 0 ) return offSet;

		int val19 = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   (( val19 << 19  ) >>> 13 ) | ( val18 >>> 26 );
		return offSet;

	}


	static int fastDeCompressFor20Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  3;
		int rest		=  dataNum  %  8;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];

			decode[ decodeOffset++ ]	 =   ( val1 << 12 ) >>> 12 ;
			decode[ decodeOffset++ ]	 =   ( ( val2 << 24) >>> 12 | ( val1 >>> 20 ));

			decode[ decodeOffset++ ]	 =   ( val2 << 4 ) >>> 12 ;
			decode[ decodeOffset++ ]	 =   ( ( val3 << 16 ) >>> 12 ) | ( val2 >>> 28 );

			decode[ decodeOffset++ ]	 =   ( ( val4 << 28 ) >>> 12 ) | ( val3 >>> 16 );

			decode[ decodeOffset++ ]	 =   ( val4 << 8 ) >>> 12 ;
			decode[ decodeOffset++ ]	 =   ( ( val5 << 20 ) >>> 12 ) | ( val4 >>> 24 );

			decode[ decodeOffset++ ]	 =   val5 >>> 12;

		}

		if( rest == 0 )
			return offSet;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset   ]	 =   ( val1 << 12 ) >>> 12 ;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val2 << 24) >>> 12 | ( val1 >>> 20 ));
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val2 << 4 ) >>> 12 ;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val3 << 16 ) >>> 12 ) | ( val2 >>> 28 );
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val4 << 28 ) >>> 12 ) | ( val3 >>> 16 );
		if( --rest == 0 ) return offSet;
		decode[ ++decodeOffset ]	 =   ( val4 << 8 ) >>> 12 ;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ ++decodeOffset ]	 =   ( ( val5 << 20 ) >>> 12 ) | ( val4 >>> 24 );
		return offSet;

	}


	static int mask21bit = ( 1 << 21 ) - 1;
	static int fastDeCompressFor21Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  5;
		int rest		=  dataNum  %  32;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10 = encodedValue[ offSet++ ];
			int val11 = encodedValue[ offSet++ ];
			int val12  = encodedValue[ offSet++ ];
			int val13  = encodedValue[ offSet++ ];
			int val14  = encodedValue[ offSet++ ];
			int val15  = encodedValue[ offSet++ ];
			int val16  = encodedValue[ offSet++ ];
			int val17  = encodedValue[ offSet++ ];
			int val18  = encodedValue[ offSet++ ];
			int val19  = encodedValue[ offSet++ ];
			int val20  = encodedValue[ offSet++ ];
			int val21  = encodedValue[ offSet++ ];


			decode[ decodeOffset	 ]	 =   val1 & mask21bit ;
			decode[ decodeOffset + 1 ]	 =   (( val2 << 11) | ( val1 >>> 21 )) & mask21bit ;

			decode[ decodeOffset + 2 ]	 =   ( val2 >> 10 ) &  mask21bit ;
			decode[ decodeOffset + 3]	 =   (( val3 << 1) | ( val2 >>> 31 )) & mask21bit ;

			decode[ decodeOffset + 4 ]	 =   (( val4 << 12) | ( val3 >>> 20 )) & mask21bit ;

			decode[ decodeOffset + 5 ]	 =   ( val4 >> 9 ) &  mask21bit ;
			decode[ decodeOffset + 6 ]	 =   (( val5 << 2 ) | ( val4 >>> 30 )) & mask21bit ;

			decode[ decodeOffset + 7 ]	 =   (( val6 << 13) | ( val5 >>> 19 )) & mask21bit ;

			decode[ decodeOffset + 8 ]	 =   ( val6 >> 8 ) &  mask21bit ;
			decode[ decodeOffset + 9 ]	 =   (( val7 << 3 ) | ( val6 >>> 29 )) & mask21bit ;

			decode[ decodeOffset + 10 ]	 =   (( val8 << 14) | ( val7 >>> 18 )) & mask21bit ;

			decode[ decodeOffset + 11 ]	 =   ( val8 >> 7 ) &  mask21bit ;
			decode[ decodeOffset + 12 ]	 =   (( val9 << 4 ) | ( val8 >>> 28 )) & mask21bit ;

			decode[ decodeOffset + 13 ]	 =   (( val10 << 15) | ( val9 >>> 17 )) & mask21bit ;

			decode[ decodeOffset + 14 ]	 =   ( val10 >> 6 ) &  mask21bit ;
			decode[ decodeOffset + 15 ]	 =   (( val11 << 5 ) | ( val10 >>> 27 )) & mask21bit ;

			decode[ decodeOffset + 16 ]	 =   (( val12 << 16) | ( val11 >>> 16 )) & mask21bit ;

			decode[ decodeOffset + 17 ]	 =   ( val12 >> 5 ) &  mask21bit ;
			decode[ decodeOffset + 18 ]	 =   (( val13 << 6 ) | ( val12 >>> 26 )) & mask21bit ;

			decode[ decodeOffset + 19 ]	 =   (( val14 << 17) | ( val13 >>> 15 )) & mask21bit ;

			decode[ decodeOffset + 20 ]	 =   ( val14 >> 4 ) &  mask21bit ;
			decode[ decodeOffset + 21 ]	 =   (( val15 << 7 ) | ( val14 >>> 25 )) & mask21bit ;

			decode[ decodeOffset + 22 ]	 =   (( val16 << 18) | ( val15 >>> 14 )) & mask21bit ;

			decode[ decodeOffset + 23 ]	 =   ( val16 >> 3 ) &  mask21bit ;
			decode[ decodeOffset + 24 ]	 =   (( val17 << 8 ) | ( val16 >>> 24 )) & mask21bit ;

			decode[ decodeOffset + 25 ]	 =   (( val18 << 19) | ( val17 >>> 13 )) & mask21bit ;

			decode[ decodeOffset + 26 ]	 =   ( val18 >> 2 ) &  mask21bit ;
			decode[ decodeOffset + 27 ]	 =   (( val19 << 9 ) | ( val18 >>> 23 )) & mask21bit ;

			decode[ decodeOffset + 28 ]	 =   (( val20 << 20) | ( val19 >>> 12 )) & mask21bit ;

			decode[ decodeOffset + 29 ]	 =   ( val20 >> 1 ) &  mask21bit ;
			decode[ decodeOffset + 30 ]	 =   (( val21 << 10) | ( val20 >>> 22 )) & mask21bit ;

			decode[ decodeOffset + 31 ]	 =   ( val21 >> 11 ) &  mask21bit ;

			decodeOffset += 32;

		}

		if( rest == 0 )
			return offSet;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset	 ]	 =   val1 & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 1 ]	 =   (( val2 << 11) | ( val1 >>> 21 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 2 ]	 =   ( val2 >> 10 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 3]	 =   (( val3 << 1) | ( val2 >>> 31 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 4 ]	 =   (( val4 << 12) | ( val3 >>> 20 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 5 ]	 =   ( val4 >> 9 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 6 ]	 =   (( val5 << 2 ) | ( val4 >>> 30 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 7 ]	 =   (( val6 << 13) | ( val5 >>> 19 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 8 ]	 =   ( val6 >> 8 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 9 ]	 =   (( val7 << 3 ) | ( val6 >>> 29 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 10 ]	 =   (( val8 << 14) | ( val7 >>> 18 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 11 ]	 =   ( val8 >> 7 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 12 ]	 =   (( val9 << 4 ) | ( val8 >>> 28 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val10 = encodedValue[ offSet++ ];
		decode[ decodeOffset + 13 ]	 =   (( val10 << 15) | ( val9 >>> 17 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 14 ]	 =   ( val10 >> 6 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val11 = encodedValue[ offSet++ ];
		decode[ decodeOffset + 15 ]	 =   (( val11 << 5 ) | ( val10 >>> 27 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val12  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 16 ]	 =   (( val12 << 16) | ( val11 >>> 16 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 17 ]	 =   ( val12 >> 5 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val13  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 18 ]	 =   (( val13 << 6 ) | ( val12 >>> 26 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val14  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 19 ]	 =   (( val14 << 17) | ( val13 >>> 15 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 20 ]	 =   ( val14 >> 4 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val15  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 21 ]	 =   (( val15 << 7 ) | ( val14 >>> 25 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val16  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 22 ]	 =   (( val16 << 18) | ( val15 >>> 14 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 23 ]	 =   ( val16 >> 3 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val17  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 24 ]	 =   (( val17 << 8 ) | ( val16 >>> 24 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val18  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 25 ]	 =   (( val18 << 19) | ( val17 >>> 13 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 26 ]	 =   ( val18 >> 2 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val19  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 27 ]	 =   (( val19 << 9 ) | ( val18 >>> 23 )) & mask21bit ;
		if( --rest == 0 ) return offSet;

		int val20  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 28 ]	 =   (( val20 << 20) | ( val19 >>> 12 )) & mask21bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 29 ]	 =   ( val20 >> 1 ) &  mask21bit ;
		if( --rest == 0 ) return offSet;

		int val21  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 30 ]	 =   (( val21 << 10) | ( val20 >>> 22 )) & mask21bit ;
		return offSet;

	}


	static int mask22bit = ( 1 << 22 ) - 1;

	static int fastDeCompressFor22Bit( int offSet, int[] encodedValue, int dataNum, int decodeOffset, int[] decode ){

		int maxBlocks	=  dataNum  >>  4;
		int rest		=  dataNum  %  16;

		// block process
		for( int  block = 0 ; block < maxBlocks ; block++ ){

			int val1  = encodedValue[ offSet++ ];
			int val2  = encodedValue[ offSet++ ];
			int val3  = encodedValue[ offSet++ ];
			int val4  = encodedValue[ offSet++ ];
			int val5  = encodedValue[ offSet++ ];
			int val6  = encodedValue[ offSet++ ];
			int val7  = encodedValue[ offSet++ ];
			int val8  = encodedValue[ offSet++ ];
			int val9  = encodedValue[ offSet++ ];
			int val10  = encodedValue[ offSet++ ];
			int val11  = encodedValue[ offSet++ ];

			decode[ decodeOffset	 ]	 =   val1 & mask22bit ;
			decode[ decodeOffset + 1 ]	 =   (( val2 << 10) | ( val1 >>> 22 )) & mask22bit ;

			decode[ decodeOffset + 2 ]	 =   (( val3 << 20) | ( val2 >>> 12 )) & mask22bit ;

			decode[ decodeOffset + 3 ]	 =   ( val3 >> 2 ) &  mask22bit ;
			decode[ decodeOffset + 4 ]	 =   (( val4 << 8 ) | ( val3 >>> 24 )) & mask22bit ;

			decode[ decodeOffset + 5 ]	 =   (( val5 << 18) | ( val4 >>> 14 )) & mask22bit ;

			decode[ decodeOffset + 6 ]	 =   ( val5 >> 4 ) &  mask22bit ;
			decode[ decodeOffset + 7 ]	 =   (( val6 << 6) | ( val5 >>> 26 )) & mask22bit ;

			decode[ decodeOffset + 8 ]	 =   (( val7 << 16) | ( val6 >>> 16 )) & mask22bit ;

			decode[ decodeOffset + 9  ]	 =   ( val7 >> 6) &  mask22bit ;
			decode[ decodeOffset + 10 ]	 =   (( val8 << 4 ) | ( val7 >>> 28 )) & mask22bit ;

			decode[ decodeOffset + 11 ]	 =   (( val9 << 14) | ( val8 >>> 18 )) & mask22bit ;

			decode[ decodeOffset + 12 ]	 =   ( val9 >> 8 ) &  mask22bit ;
			decode[ decodeOffset + 13 ]	 =   (( val10 << 2 ) | ( val9 >>> 30 )) & mask22bit ;

			decode[ decodeOffset + 14 ]	 =   (( val11 << 12) | ( val10 >>> 20 )) & mask22bit ;

			decode[ decodeOffset + 15 ]	 =   ( val11 >> 10 ) &  mask22bit ;

			decodeOffset += 16;
		}

		if( rest == 0 )
			return offSet;;

		int val1  = encodedValue[ offSet++ ];
		decode[ decodeOffset	 ]	 =   val1 & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val2  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 1 ]	 =   (( val2 << 10) | ( val1 >>> 22 )) & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val3  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 2 ]	 =   (( val3 << 20) | ( val2 >>> 12 )) & mask22bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 3 ]	 =   ( val3 >> 2 ) &  mask22bit ;
		if( --rest == 0 ) return offSet;

		int val4  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 4 ]	 =   (( val4 << 8 ) | ( val3 >>> 24 )) & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val5  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 5 ]	 =   (( val5 << 18) | ( val4 >>> 14 )) & mask22bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 6 ]	 =   ( val5 >> 4 ) &  mask22bit ;
		if( --rest == 0 ) return offSet;

		int val6  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 7 ]	 =   (( val6 << 6) | ( val5 >>> 26 )) & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val7  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 8 ]	 =   (( val7 << 16) | ( val6 >>> 16 )) & mask22bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 9  ]	 =   ( val7 >> 6) &  mask22bit ;
		if( --rest == 0 ) return offSet;

		int val8  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 10 ]	 =   (( val8 << 4 ) | ( val7 >>> 28 )) & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val9  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 11 ]	 =   (( val9 << 14) | ( val8 >>> 18 )) & mask22bit ;
		if( --rest == 0 ) return offSet;
		decode[ decodeOffset + 12 ]	 =   ( val9 >> 8 ) &  mask22bit ;
		if( --rest == 0 ) return offSet;

		int val10  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 13 ]	 =   (( val10 << 2 ) | ( val9 >>> 30 )) & mask22bit ;
		if( --rest == 0 ) return offSet;

		int val11  = encodedValue[ offSet++ ];
		decode[ decodeOffset + 14 ]	 =   (( val11 << 12) | ( val10 >>> 20 )) & mask22bit ;
		return offSet;

	}

}
