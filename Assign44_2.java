/*
Write a java program which accept array of characters from user
&count number of vowels.

Input : i N e B R b A d i G
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
    public int ArrayCountVowels()
    {
      int iCnt = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == 'A')||(Arr[i] == 'E')||(Arr[i] == 'I')||(Arr[i] == 'O')
            ||(Arr[i] == 'U')||(Arr[i] == 'a')||(Arr[i] == 'e')||(Arr[i] == 'i')
            ||(Arr[i] == 'o')||(Arr[i] == 'u'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
 
}

class Assign44_2
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        int iRet = obj.ArrayCountVowels();
        System.out.println("vowels are : " +iRet);
    }
}