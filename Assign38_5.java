/*
Write a java program which accept number of rows & columns
from user & display below pattern
Input : Hello
        
Output: H 
        H e  
        H e l 
        H e l l
        H e l l o
        H e l l
        H e l 
        H e l 
        H e
        H 
*/

import java.util.*;

class Pattern
{
    public void Display(String str)
    {
        for(int i = 0;i <= str.length();i++)
        {
           for(int j = 0;j < i;j++)
            {
                System.out.print(str.charAt(j) +"\t");
    
            }
            
           System.out.println();
        }
        for(int i = 0;i < str.length();i++)
        {
           for(int j = 0;j < ((str.length())-i);j++)
            {
                System.out.print(str.charAt(j) +"\t");
    
            }
            
           System.out.println();
        }
    }
}

class Assign38_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();

        System.out.println("Enetr the String : ");
        String s = sobj.nextLine();

        pobj.Display(s);
    }
}