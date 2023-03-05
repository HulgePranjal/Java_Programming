/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 4,iCol = 4
        
Output: *  *  *  #
        *  *  #  @
        *  #  @  @
        #  @  @  @
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
            if(i+j == iRow+1)
            {
                System.out.print("#\t");
            }
            else if(j > iRow-1 || i+j == iRow+2 || i+j == iRow+3)
            {
                System.out.print("@\t");
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

class Assign40_2
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