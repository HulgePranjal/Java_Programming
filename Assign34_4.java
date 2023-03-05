
/*
Write a java program which accept N number from user & accept 
Range,Display all elements from that range.

Input : N :  6
        Start:  60
        End: 90
        Elements: 85  66  3  76  93  88
Output : 66 76 88 

Input : N :  6
        Start:  30
        End: 50
        Elements: 85  66  3  76  93  88
Output :
*/
import java.util.*;

class Number
{
    protected int Arr[];
    protected int iStart;
    protected int iEnd;

    public Number(int iSize,int s,int e)
    {
        Arr = new int[iSize];
        iStart = s;
        iEnd = e;
    }

    protected void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter "+Arr.length + " elements ");
        for(int iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println("Enter the element no : "+ (iCnt+1));
            Arr[iCnt] = sobj.nextInt();
        }
    }

    protected void Display()
    {
        System.out.println("Elements of array are : ");

        for(int iCnt =0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt]+"\t");
        }

        System.out.println();
    }
}

class MarvellousX extends Number
{
    public MarvellousX(int iSize,int iStart,int iEnd)
    {
        super(iSize,iStart,iEnd);
    }

    public void DisplayRange()
    {
        int iCnt = 0;
        for(iCnt = 0;iCnt < Arr.length; iCnt++)
        {
            if(((Arr[iCnt]) >= iStart)&&((Arr[iCnt]) <= iEnd))
            {
                 System.out.print(Arr[iCnt]+"\t");
            }
        }
    }
 }

class Assign34_4
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the Start");
        int s = sobj.nextInt();

        System.out.println("Enter the End");
        int e = sobj.nextInt();
        
        MarvellousX obj = new MarvellousX(iSize,s,e);
        
        obj.Accept();
        obj.Display();

        obj.DisplayRange();
       
    }
}