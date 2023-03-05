/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : iRow = 4,iCol = 4
        
Output: A  B  C  D
        A  B  C  D
        A  B  C  D
        A  B  C  D
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int j = 'A';
        for(int i = 1;i <= iRow;i++)
        {
           for(j = 'A';j <= 'D';j++)
           {
                System.out.print((char)j +"\t");
           }
           System.out.println();
        }
    }
}

class Assign36_1
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