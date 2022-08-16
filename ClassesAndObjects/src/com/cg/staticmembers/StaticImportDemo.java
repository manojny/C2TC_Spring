package com.cg.staticmembers;

import static java.lang.Math.*;

public class StaticImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("finding square root of a number :" + sqrt(23));
 System.out.println("finding random number which grater than 0.0 and less than 1.0 :" + random());
         System.out.println("nearest value grater than and close to 12.9 :" + ceil(12.9));
         System.out.println("nearest value lesser than and close to 12.9 :" + floor(12.9));
         System.out.println("round the given value" + round(12.9));
         System.out.println(" calculate 2 ^3" + pow(2,3));
	}

}
