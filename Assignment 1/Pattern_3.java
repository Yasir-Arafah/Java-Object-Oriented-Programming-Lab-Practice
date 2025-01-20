/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince
 */
public class Pattern_3 
{
    

    public static void main(String[] args) {
		int line = 8;

		for (int i = line; i >= 1; i--)
                {
			for (int j = line; j > i; j--) 
                        {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) 
                        {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
