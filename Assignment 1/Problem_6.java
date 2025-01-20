/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince
 */
import java.lang.Math;

public class Problem_6 
{
    
    public static void main(String[] args) 
    {
        
        int num = 50000;
        
        double sum_1 = 0.0;
        for (int i = 1; i <= num; i++)
            sum_1 = sum_1 + (double) 1/i;
        System.out.printf("Harmonic sum from left to right %.15f\n", sum_1);
        
        double sum_2 = 0.0;
        for (int i = num; i >= 1; i--)
        {
            sum_2 = sum_2 + (double) 1/i;
        }
        System.out.printf("Harmonic sum from right to left %.15f\n", sum_2);

        if(sum_1 == sum_2)
        {
            System.out.println("Sums are the same");
        }
        else 
        {
            System.out.println("Sums are not the same");
            System.out.printf("Absolute Difference : %.15f\n", Math.abs(sum_1 - sum_2));
        }
        
    }

}