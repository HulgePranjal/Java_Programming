
/*
Write a java program which accept N number from user & return difference between 
summation of even elements & summation of odd elements.

Input : N : 6
        Elements : 85 66 3 80 93 88
output: 53  (234-181)
*/
import java.util.*;
class ArrayDemo
{
    public int Arr[];

    public ArrayDemo(int iSize)
    {
         Arr = new int[iSize];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt =0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }

        System.out.println();
    }
}
class MarvellousX extends ArrayDemo
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }

    public int Difference()
    {
        int iEvenSum = 0,iOddSum = 0,iDiff = 0;
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] % 2)==0)
            {
                iEvenSum = iEvenSum + Arr[iCnt];
            }
            else
            {
                iOddSum = iOddSum + Arr[iCnt];
            }
        }
        return (iDiff=(iEvenSum-iOddSum));
    }
}
class Assign32_1
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MarvellousX obj = new MarvellousX(iSize);

        obj.Accept();
        obj.Display();

        int iRet = obj.Difference();
        System.out.println("Difference is : "+iRet);
    }
}