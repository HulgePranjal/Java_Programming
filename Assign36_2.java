/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 4,iCol = 4
        
Output: A  A  A  A  A
        B  B  B  B  B
        C  C  C  C  C
        
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        for(int i = 'A';i <= 'C';i++)
        {
           for(int j = 1;j <= iCol;j++)
           {
                System.out.print((char)i +"\t");
           }
           System.out.println();
        }
    }
}

class Assign36_2
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