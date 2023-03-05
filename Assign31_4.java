
/*
Write a java program which accept string from user & check
whwether it contains vowels in it or not.

Input : "marvellous"
output: TRUE

Input : "Demo"
output: TRUE

Input : "xyz"
output: FALSE
*/
import java.util.*;
class StringDemo
{
    public boolean ChkVowel(String s)
    {
        int foundA = 0,foundE = 0,foundI = 0,foundO = 0,foundU = 0;
        for(int i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ('a'))
            {
                foundA = 1;
            } 
            else if(s.charAt(i)  == ('e'))
            {
                foundE = 1;
            }
            else if(s.charAt(i)  == ('i'))
            {
                foundI = 1;
            }
            else if(s.charAt(i)  == ('o'))
            {
                foundO = 1;
            }
            else if(s.charAt(i)  == ('u'))
            {
                foundU = 1;
            }
        }
        if((foundA == 1)||(foundE == 1)||(foundI == 1)||(foundO == 1)||(foundU == 1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Assign31_4
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");

        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        boolean bRet = dobj.ChkVowel(str);
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