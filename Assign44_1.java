/*
Write a java program which accept array of characters from user
& replace each capital character with its corresponding small
character.

Input : b N j B R b A d G G
Output: b n j b r b a d g g
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
    public void ArrayReplace()
    {
      int iCnt = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Character.isLetter(Arr[i]) && Character.isUpperCase(Arr[i]))||(Character.isLetter(Arr[i]) && Character.isLowerCase(Arr[i])))
            {
                Arr[i] = Character.toLowerCase(Arr[i]);
                System.out.println(Arr[i]  +" \t");
            }
        }
    }
 
}

class Assign44_1
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        obj.ArrayReplace();
        
    }
}