/*
Write a java program which accept two arrays from user & copy
the contents of that array into another array in reverse order &
return new array.

Input : 12 57 23 3
        99 23 54 58 6 67

Output : 12 57 23 3 99 23 54 58 6 67
        67 6 58 54 23 99 3 23 57 12
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

    public void CopyArrayRev()
    {
        System.out.println(" new array is : ");

        int iSize1 = Arr1.length;
        int iSize2 = Arr2.length;

        int iSize = iSize1 + iSize2;

        int Arr[] = new int[iSize];
        
        for(int iCnt1 =0; iCnt1 < iSize1; iCnt1 = iCnt1+1)
        {
               Arr[iCnt1] = Arr1[iCnt1];
        }
        
        for(int iCnt2 =0; iCnt2 < iSize2; iCnt2 = iCnt2+1)
        {
               Arr[iSize1 + iCnt2] = Arr2[iCnt2];
        }

         for(int iCnt3 =0; iCnt3 < iSize; iCnt3 = iCnt3+1)
        {
               System.out.print(Arr[iCnt3] + " \t");
        }
         System.out.println("Original Array printed in reverse order:");
         for(int i = iSize-1; i >= 0;i--)
         {
         System.out.print(Arr[i] + " \t");
        }
        System.out.println();
}
}

class Assign42_3
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

        obj.CopyArrayRev();
    }
}