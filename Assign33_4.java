
/*
Write a java program which accept number from user & return 
multiplication of all digits.

Input : 2395
output: 270

Input : 1018
output: 8

Input : 9440
output: 144

Input : 922432
output: 864
*/
import java.util.*;
class Digit
{
    public int Multiply(int iNo)
    {
        int iDigit = 0,iMult = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit == 0)
            {
                iDigit = 1;
            }
            iMult = iMult * iDigit;

            iNo = iNo / 10;
        }
        return iMult;
    }
}

class Assign33_4
{
    public static void main(String a[])
    {
        Digit dobj = new Digit();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        int i = sobj.nextInt();
        
        int iRet = dobj.Multiply(i);
        System.out.println("Number between 3 & 7 is : " +iRet);
    }
}