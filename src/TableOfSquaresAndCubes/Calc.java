package TableOfSquaresAndCubes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calc {
	
	public static void main(String [] Args)
	{
		int f_num=0,l_num; //Declaring data type Int for input numbers
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number for which you would like to calculate Squres and Cubes for"); // Prompting the user to enter 1st and last numbers for calculation
		f_num = reader.nextInt();
		System.out.println("Enter the last number");
		l_num = reader.nextInt();
		
		BigDecimal ibl= new BigDecimal(l_num); //Taking BigDecimal since int cannot calculate for vales beyond 65000.
		int check;
			System.out.println("Number\t\tSquares\t\tCubes");
		for(BigDecimal ibf= new BigDecimal(f_num);ibf.compareTo(ibl) < 0;ibf=ibf.add(new BigDecimal(1)))
		{
			System.out.println(ibf+"		"+ibf.pow(2)+"		"+ibf.pow(3)+"");
		}
	}

}
