/*
Write a java program which accept two arrays from user & reverse
each number of that array.

Input : 89  687  56  549  87  9
Output: 98  786  65  954  78  9 
*/              

import java.util.*;

class MyArray
{
    public int Arr[];
    
    public MyArray(int iSize)
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
    public void ReverseArray()
    {
        int iRev = 0,iDigit = 0,iTemp = 0;
         for(int i = 0; i < Arr.length; i++)
         {
            while(Arr[i] != 0)
            {
                iDigit = Arr[i] % 10;
                iRev = (iRev * 10)+iDigit;
                Arr[i] = Arr[i] / 10;
            }
             Arr[i] = iRev;
            if(iTemp < iRev)
            {
                iRev = 0;
            }
            System.out.print(Arr[i]+" \t");
         }
    }
 
}

class Assign43_1
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        obj.ReverseArray();
    }
}