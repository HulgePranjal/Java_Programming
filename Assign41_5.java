/*
Write a java program which accept two arrays from user & display
odd contents of each array.

Input : 2  9  7  5  2  3 
        45 6  12 18 23 4

Output : 9  5  3
        45 23
*/              

import java.util.*;

class MyArray
{
    public int Arr1[];
    public int Arr2[];

    public MyArray(int iSize1,int iSize2)
    {
        Arr1 = new int[iSize1];
        Arr2 = new int[iSize2];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr1.length + " elements ");
        for(int iCnt = 0; iCnt < Arr1.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr1[iCnt] = sobj.nextInt();
        }

        System.out.println("Please enter "+Arr2.length + " elements ");
        for(int iCnt = 0; iCnt < Arr2.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr2[iCnt] = sobj.nextInt();
        }
    }

    public void SumArray()
    {
        System.out.println(" Summation of array1 are : ");

        int iSum1 = 0;
        for(int iCnt =0; iCnt < Arr1.length; iCnt++)
        {
            iSum1 = iSum1 +Arr1[iCnt];
        }
        System.out.print(iSum1);
        System.out.println();

        System.out.println("Summation of array2 are : ");

        int iSum2 = 0;
        for(int iCnt =0; iCnt < Arr2.length; iCnt++)
        {
             iSum2 = iSum2 +Arr2[iCnt];   
        }
        System.out.print(iSum2);
        System.out.println();
    }
}

class Assign41_5
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array1 that you want to create ");
        int iSize1 = sobj.nextInt();

         System.out.println("Enter the size of array2 that you want to create ");
        int iSize2 = sobj.nextInt();

        MyArray obj = new MyArray(iSize1,iSize2);
        
        obj.Accept();

        obj.SumArray();
    }
}