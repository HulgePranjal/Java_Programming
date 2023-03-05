/*
Write a java program which accept array of characters from user
& count number of capital characters.

Input : b N e B R b A i G i B
        b
Output: 4
*/              

import java.util.*;

class MyArray
{
    public char Arr[];
    
    public MyArray(int iSize)
    {
        Arr = new char[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextLine().charAt(0);
        }
    }
    public int Search()
    {
      int iCnt = 0;

      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter the Character :");
        char ch = sobj.nextLine().charAt(0);

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == ch) && (Arr[i] <= ch))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
 
}

class Assign44_3
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        int iRet = obj.Search();
        System.out.println("Count is : " +iRet);
    }
}