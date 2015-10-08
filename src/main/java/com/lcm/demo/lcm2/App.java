package com.lcm.demo.lcm2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String str = "CCAxx-DFCE-4xxx";
    	String[] split = str.split("-");
    	System.out.println(split[1]);
        System.out.println( "Hello World!" );
    }
   
}
