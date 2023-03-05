/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 6,iCol = 6
        
Output: *  *  *  *  *  *
        *  #  #  #  *  *
        *  #  #  *  $  *
        *  #  *  $  $  *
        *   * $  $  $  *
        *   *  *  *  * *
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int j = 0;
        for(int i = 1;i <= iRow;i++)
        {
           for(j = 1;j <= iCol;j++)
           {
            if(i == j || i == 1 || i == iRow)
            {
                System.out.print(j +"\t");
            }
            else if(j == 1)
            {
                System.out.print("1\t");
            }
            else if(j == iRow)
            {
                System.out.print("5\t");
            }
            else
            {
                System.out.print(" \t");
            }
           }
           System.out.println();
        }
    }
}

class Assign40_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();

        System.out.println("Enetr number of Rows :");
        int i = sobj.nextInt();

        System.out.println("Enetr number of Columns :");
        int j = sobj.nextInt();

        pobj.Display(i,j);
    }
}