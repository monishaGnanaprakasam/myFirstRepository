/*
 * Description :Java basics
 */
package com.abc;
import java.io.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=-25;
		byte b1=0x5a;
		short sm=45;
		char c='\u0905';
		boolean bool=true;
		int i=0xabcdef01;
		int i1= 0b11;
		long l=25L;
		float f$ =10.978f;
		double d= 6.023E23;
		String s= "BYE :)";
				System.out.println("Hello :)");
				
				System.out.println("byte b:"+b +"\tb1:"+ b1);
				
				System.out.println("unicode "+ "\u00a5123");
				
			
				System.out.println("short sm:"+sm);
				
				System.out.println("char c:"+c);
				
				System.out.println("boolean bool:"+bool);
				
				System.out.println("int i:"+i+"i1:"+i1);
				
				System.out.println("long l:"+l );
				
				System.out.println("float f:"+f$ );
				
				System.out.println("double d:"+d);
				
				System.out.println(s);
				
				byte type =(byte)0xab;
				int a=type;
				type=(byte)a;
				
				System.out.println(a);
				
				long l1=1024*1024*1024+9;
				
				l1*=l1;
								
				System.out.println("l1 :" + l1);
				
				a=(int)l1;
				System.out.println("Type caste l1:"+a);
				double d1=1.602E19*1.602E19;
				d1*=d1;
				System.out.println("d1:"+d1);
				float f2 =(float)d1;
				System.out.println("typecasted d1:"+f2);
	
				byte bitwise = (byte) 0xab;
				System.out.println(bitwise>>2);
				System.out.printf("%x",bitwise>>>2);
				bitwise<<=2;
				System.out.println(bitwise);
				
				
	}

}
