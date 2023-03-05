
/*
Write a java program which accept string from user & return 
difference between frequency of small characters & frequency 
of capital characters

Input : "MarvellouS"
output: 6 (8-2)
*/
import java.util.*;
class StringDemo
{
    public int CountDiff(String s)
    {
        int iCnt1 = 0,iCnt2 = 0,iDiff = 0;

        for(int i = 0;i < s.length();i++)
        {
            if ((s.charAt(i) >= 'a')&&(s.charAt(i)  <= 'z'))
            {
                iCnt1++;
            }
            else if((s.charAt(i) >= 'A')&&(s.charAt(i)  <= 'Z'))
            {
                iCnt2++;
            }
        }
        return (iDiff = (iCnt1-iCnt2));
    }
}
class Assign31_3
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");

        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        int iRet = dobj.CountDiff(str);

        System.out.println("Difference is : " +iRet);
        
    }
}