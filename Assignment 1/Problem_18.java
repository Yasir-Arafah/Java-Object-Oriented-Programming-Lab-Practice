/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince
 */
import java.util.Scanner;

public class Problem_18 
{

	public static void main(String[] args) 
        {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Binary string: ");

		int bin = sc.nextInt();

		int temp = bin, j = 1, dec = 0, base1 = 1;
		
		while (temp > 0) 
                {
                    int last_digit = temp % 10;
                    if(last_digit != 0 && last_digit != 1) 
                    {
                        System.out.println("error: invalid binary string " + bin);
                                
                        j = 0;
                        break;
                    }
                    temp = temp / 10;
 
                    dec = dec +  last_digit * base1;
 
                    base1 = base1 * 2;
                }

		if (j == 1)
                {
			System.out.println("The equivalent decimal number for binary " + bin + " is: " + dec);

		}
        }
}