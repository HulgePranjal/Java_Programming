/*
Write a java program which accept marks of N students from
user & display class of each student.

Less than 35 - Fail
Less than 50 - Pass Class
Less than 60 - Second class
Less than 70 - First class
Greater than 70 - first class with distinction 

Input : 67.3  45.8  88.9  77.5  55.2
67.3   First class
45.8   Pass class
88.9  First class with Distinction
77.5  First class with Distinction
55.2  Second class
*/              

import java.util.*;

class MyArray
{
    public float Arr[];
    
    public MyArray(int iSize)
    {
        Arr = new float[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextFloat();
        }
    }
    public void Percentage()
    {
        for(int i = 0;i <= Arr.length;i++)
        {
            if(Arr[i] <= 35)
            {
                System.out.println("Fail");
            }
            else if((Arr[i] > 35)&&(Arr[i] < 50))
            {
               System.out.println("Pass Class");
            }
            else if((Arr[i] > 50)&&(Arr[i] < 60))
            {
               System.out.println("Second Class");
            }
            else if((Arr[i] > 60)&&(Arr[i] < 70))
            {
               System.out.println("First Class");
            }
            else if(Arr[i] > 70)
            {
               System.out.println("First class with Distinction");
            }
        }
    }
 
}

class Assign43_4
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        MyArray obj = new MyArray(iSize);
        
        obj.Accept();

        obj.Percentage();
    }
}