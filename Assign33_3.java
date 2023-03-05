
/*
Write a java program which accept number from user & return the
count of digits in between 3 & 7.

Input : 2395
output: 1

Input : 1018
output: 0

Input : 4521
output: 2

Input : 9922
output: 0
*/
import java.util.*;
class Digit
{
    public int CountRange(int iNo)
    {
        int iDigit = 0,iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit > 3)&&(iDigit < 7))
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class Assign33_3
{
    public static void main(String a[])
    {
        Digit dobj = new Digit();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int i = sobj.nextInt();
        
        int iRet = dobj.CountRange(i);
        System.out.println("Number between 3 & 7 is : " +iRet);
    }
}