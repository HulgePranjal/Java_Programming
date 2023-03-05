/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 3,iCol = 5
        
Output: 5  4  3  2  1
        5  4  3  2  1
        5  4  3  2  1
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        for(int i = 1;i <= iRow;i++)
        {
           for(int j = iCol;j > 0;j--)
           {
                System.out.print(j +"\t");
           }
           System.out.println();
        }
    }
}

class Assign37_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();

        System.out.println("Enter number of Rows :");
        int i = sobj.nextInt();

        System.out.println("Enter number of Columns :");
        int j = sobj.nextInt();

        pobj.Display(i,j);
    }
}