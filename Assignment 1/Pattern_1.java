/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince
 */
public class Pattern_1 
{
  public static void main(String[] args) 
  {
    int line = 8;

    for (int i = 1; i <= line; i++) 
    {
      for (int j = 1; j <= i; j++) 
      {
        System.out.print("# ");
      }
      System.out.println();
    }
  }
}
