/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 4,iCol = 4
        
Output: 4  4  4  4  4
        3  3  3  3  3
        2  2  2  2  2
        1  1  1  1  1
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        for(int i = iRow;i > 0;i--)
        {
           for(int j = 1;j <= iCol;j++)
           {
                System.out.print(i +"\t");
           }
           System.out.println();
        }
    }
}

class Assign36_3
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