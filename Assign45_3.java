
/*
Write a java program which accept string from user & display such a word 
which occurs maximum number of times

Input : India is Demo India Hello Demo
output: India 
*/
import java.util.*;
class StringDemo
{
    public void Maximum(String s)
    {
        int iCount = 0;
        String Arr[] = s.split(" ");

        for(int i = 0;i < Arr.length;i++)
        {
            iCount(Arr[i])++;
        }
         int iCount = 0,iMax = 0;
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if(iMax < iCount(Arr[iCnt]))
            {
                iMax = iCount(Arr[iCnt]);
                System.out.println(Arr[iCnt]);
            }
        }
    }
}
class Assign45_3
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        dobj.Maximum(str);        
    }
}

