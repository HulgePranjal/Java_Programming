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
    public int Difference()
    {
      int iCntC = 0,iCntS = 0,iDiff = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCntC++;
            }
            else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCntS++;
            }
        }
        return iDiff = (iCntC-iCntS);
    }
 
}

class Assign44_4
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        int iRet = obj.Difference();
        System.out.println("Frequency is: " +iRet);
    }
}