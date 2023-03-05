/*
Write a java program which accept two arrays from user & 
display minimum element of each array.

Input : 2  9  7  5  2  3 
        9 3 5 5

Output : 2  3
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

    public void MinArray()
    {
        int iMin1 = Arr1[0];
        System.out.println(" Minimum element of array1 are : ");
        for(int iCnt =0; iCnt < Arr1.length; iCnt++)
        {
            if(Arr1[iCnt] < iMin1)
            {
                iMin1 = Arr1[iCnt];
            }
        }
         System.out.print(iMin1);
        System.out.println();

        System.out.println("Minimum element of array2 are : ");

        int iMin2 = Arr2[0];
        for(int iCnt =0; iCnt < Arr2.length; iCnt++)
        {
            if(Arr2[iCnt] < iMin2)
            {
                iMin2 = Arr2[iCnt];
            } 
        }
        System.out.print(iMin2);
        System.out.println();
    }
}

class Assign42_2
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

        obj.MinArray();
    }
}