package demo;

import java.io.*;
import java.util.*;

public class project8 {

	public static void main(String[] args)
	{
		try 
		{
			
		 Scanner sc =new Scanner(new FileInputStream("C:\\Users\\A.J\\eclipse-workspace\\demo\\src\\demo\\example.csv"));
		while(sc.hasNext()) 
		{
			String s=sc.nextLine();
			System.out.println(s);
			
		}
		
		 } 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}
