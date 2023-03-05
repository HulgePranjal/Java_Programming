/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 4,iCol = 4
        
Output: *  #  *  #
        *  #  *  #
        *  #  *  #
        *  #  *  #
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        for(int i = 1;i <= iRow;i++)
        {
           for(int j = 1;j <= iCol;j++)
           {
            if((j % 2) == 0)
            {
                System.out.print("#\t");
            }
            else
            {
                System.out.print("*\t");
            }
            }
           System.out.println();
        }
    }
}

class Assign37_4
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