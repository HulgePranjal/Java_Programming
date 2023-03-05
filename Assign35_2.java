/*
Write a java program which accept 2 string from user &
check whether contents of two strings are equal or not.

Input : "Marvellous Infosystems"
        "Marvellous Infosystems"
        
Output: TRUE
*/

import java.util.*;

class StringDemo
{
        public boolean StrCmpX(String src,String dest)
        {
                if (src.equals(dest)) 
                 {
                   return true;
                 }
                 else 
                 {
                   return false;
                 }
        }
        
}
class Assign35_2
{
        public static void main(String pj[])
        {
                Scanner sobj = new Scanner(System.in);

                System.out.println("Please enter First String :");
                String str1 = sobj.nextLine();

                System.out.println("Please enter Second String :");
                String str2 = sobj.nextLine();

                StringDemo dobj = new StringDemo();

                boolean bRet = dobj.StrCmpX(str1,str2);
                if(bRet == true)
                {
                        System.out.println("TRUE");
                }
                else
                {
                        System.out.println("FALSE");
                }
        }
}