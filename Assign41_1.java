/*
Write a java program which accept two arrays from user & display
contents of each array.

Input : 2  9  7  5  2  3 
        9  3  5  5

Output : 2  9  7  5  2  3 
        9  3  5  5 
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

    public void Display()
    {
        System.out.println("Elements of array1 are : ");

        for(int iCnt =0; iCnt < Arr1.length; iCnt++)
        {
            System.out.print(Arr1[iCnt]+"\t");
        }

        System.out.println();

        System.out.println("Elements of array2 are : ");

        for(int iCnt =0; iCnt < Arr2.length; iCnt++)
        {
            System.out.print(Arr2[iCnt]+"\t");
        }

        System.out.println();
    }
}

class Assign41_1
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

        obj.Display();
    }
}