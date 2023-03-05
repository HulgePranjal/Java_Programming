
/*
Write a java program which accept number from user & return 
difference between summation of even digits & summation of odd
digits.

Input : 2395
output: -15 (2 - 17)

Input : 1018
output: 6  (8 - 2)

Input : 8440
output: 16  (16 - 0)

Input : 5733
output: -18 (0 - 18)
*/
import java.util.*;
class Digit
{
    public int CountDiff(int iNo)
    {
        int iDigit = 0,iDiff = 0,iEvenSum = 0,iOddSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else if((iDigit % 2) != 0)
            {
                iOddSum = iOddSum + iDigit;
            }
            iNo = iNo / 10;
        }
        return (iDiff = (iEvenSum-iOddSum));
    }
}

class Assign33_5
{
    public static void main(String a[])
    {
        Digit dobj = new Digit();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int i = sobj.nextInt();
        
        int iRet = dobj.CountDiff(i);
        System.out.println("Summation is : " +iRet);
    }
}