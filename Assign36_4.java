/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 3,iCol = 4
        
Output: 1  2  3  4
        5  6  7  8
        9  10  11  12
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int k =1;
        for(int i = 1;i <= iRow;i++)
        {
           for(int j = 1;j <= iCol;j++,k++)
           {
                System.out.print(k +"\t");
           }
           System.out.println();
        }
    }
}

class Assign36_4
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