/*
Write a java program which accept two arrays from user & check
whether that array & its elements are pallindrome or not

Input : 11  252  387783  252  11
Output : TRUE

Input : 11  252  387743  77  11
Output : FALSE

Input : 11  252  786  252  11
Output : FALSE

Input : 11  252  786  253  11
Output : FALSE
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
    public boolean ChkPallindrome()
    {
        boolean iFlag = false;

        int iSize = Arr.length;
        for(int i = 0;i <= iSize/2 && iSize != 0;i++)
        {
            if(Arr[i] != Arr[iSize-i-1])
            {
                iFlag = true;
                break;
            }
        }
        return iFlag;
    }
 
}

class Assign42_5
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        boolean bRet = obj.ChkPallindrome();
        if(bRet == false)
        {
            System.out.println("Array is Pallindrome");
        }
        else
        {
            System.out.println("Array is not Pallindrome");
        }
    }
}