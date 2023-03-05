
/*
Write a java program which accept string from user & check whether
first string is the rotation of second string or not

Input : abcdefg   cdefgab
output: true
*/
import java.util.*;
class StringDemo
{
    public boolean IsStringRotation(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            System.out.println("Second string is not a rotation with First string");
        }
        
        s1 = s1.concat(s1);

            if(s1.indexOf(s2) != -1)
             {
                return true;
             }
            else
            {
                return false;
            }
    }
}
class Assign45_1
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter First string : ");
        String str = sobj.nextLine();

        System.out.println("Please Enter Second string : ");
        String dest = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        boolean bRet = dobj.IsStringRotation(str,dest);
        if(bRet == true)
        {
           System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}