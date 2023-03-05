
/*
Write a java program which accept string from user & count number 
of small characters

Input : "Marvellous"
output: 9
*/
import java.util.*;
class StringDemo
{
    public int CountSmall(String s)
    {
        int iCnt = 0;

        for(int i = 0;i < s.length();i++)
        {
            if ((s.charAt(i) >= 'a')&&(s.charAt(i)  <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}
class Assign31_2
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");

        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        int iRet = dobj.CountSmall(str);

        System.out.println("Number of Small case letters are : " +iRet);
        
    }
}