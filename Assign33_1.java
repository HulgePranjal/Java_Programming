
/*
Write a java program which accept number from user & return the
count of even digits.

Input : 2395
output: 1

Input : 1018
output: 2

Input : -1018
output: 2

Input : 8462
output: 4
*/
import java.util.*;
class Digit
{
    public int CountEven(int iNo)
    {
        int iDigit = 0,iCount = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2)==0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }
}

class Assign33_1
{
    public static void main(String a[])
    {
        Digit dobj = new Digit();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int i = sobj.nextInt();
        
        int iRet = dobj.CountEven(i);
        System.out.println("count of even digit is : " +iRet);
    }
}