
/*
Write a java program which accept N number from user & display all such
elements which are divisible by 3 & 5.
Input : N : 6
        Elements : 85 66 3 55 93 88
output: 66  55  88 
*/
import java.util.*;

class ArrayDemo
{
    protected int Arr[];

    public ArrayDemo(int iSize)
    {
        Arr = new int[iSize];
    }
    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter " + Arr.length + " elements");

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println("Enter the element no : " + (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }
    protected void Display()
    {
        System.out.println("Elements of Array are : ");

        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }
        System.out.println();
    }
}
class MarvellousX extends ArrayDemo
{
    public MarvellousX(int iSize)
    {
        super(iSize);
    }
    public void NumberDivisibleBy11()
    {
        for(int iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt]%11)==0)
            {
                 System.out.print(Arr[iCnt]+"\t");
            }
        }
    }
}
class Assign32_5
{
    public static void main(String ar[])
    {
     Scanner sobj = new Scanner(System.in);

     System.out.println("Please enter the size of array : ");
     int iSize = sobj.nextInt();

     MarvellousX obj = new MarvellousX(iSize);

     obj.Accept();
     obj.Display();

     obj.NumberDivisibleBy11();
    }
}