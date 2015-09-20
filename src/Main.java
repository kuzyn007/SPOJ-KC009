/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/KC009/
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextLine())
		{
			String s = in.nextLine();
			
			for(int i=s.length()-1; i>=0; i--)
			{
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
		in.close();
	}
}

