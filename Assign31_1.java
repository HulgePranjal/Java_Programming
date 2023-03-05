
/*
Write a java program which accept string from user & count number 
of capital characters

Input : "Marvellous Multi OS"
output: 4
*/
import java.util.*;
class StringDemo
{
    public int CountCapital(String s)
    {
        int iCnt = 0;

        for(int i = 0;i < s.length();i++)
        {
            if ((s.charAt(i) >= 'A')&&(s.charAt(i)  <= 'Z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}
class Assign31_1
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");

        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        int iRet = dobj.CountCapital(str);

        System.out.println("Number of capital case letters are : "+iRet);
        
    }
}