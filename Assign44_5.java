/*
Write a java program which accept array of characters from user
& return difference between frequency of capital & frequency of small 
character

Input : b N j B R b A I O G i
Output: 3  (7-4)
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
    public void Pattern()
    {
        for(int i = 0; i < Arr.length; i++)
        {
            for(int iCnt = 1;iCnt <= Arr[i];iCnt++)
                {
                System.out.print("*\t");
                }
            System.out.println();
        }
    }
 
}

class Assign44_5
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        obj.Pattern();
    }
}