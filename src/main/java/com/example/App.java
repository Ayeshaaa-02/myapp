package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
	public int add(int a , int b)
	{
		return a+b;
	}
    public static void main( String[] args )
    {
    	App app = new App();
    	int result = app.add(2,2);
        System.out.println( "2 + 2 = " +result );
    }
}
