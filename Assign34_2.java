
/*
Write a java program which accept N number from user & accept 
one another number as NO,return index of first occurance of
that NO.

Input : N :  6
        NO:  66
        Elements: 85  66  3  66  93  88
Output : 1

Input : N :  6
        NO:  12
        Elements: 85  11  3  15  11  111
Output : -1
*/
import java.util.*;

class Number
{
    protected int Arr[];
    protected int iNo;

    public Number(int iSize,int j)
    {
        Arr = new int[iSize];
        iNo = j;
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
    public MarvellousX(int iSize,int iNo)
    {
        super(iSize,iNo);
    }

    public int FirstOcc()
    {
        int iCnt = 0;
        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            if((Arr[iCnt]) == iNo)
            {
                break;
            }
        }
        if(iCnt == Arr.length)
        {
            return -1;
        }
        else
        {
            return iCnt;
        }
    }
}

class Assign34_2
{
    public static void main(String ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array that you want to create ");
        int iSize = sobj.nextInt();

        System.out.println("Enter the No");
        int j = sobj.nextInt();
        
        MarvellousX obj = new MarvellousX(iSize,j);
        
        obj.Accept();
        obj.Display();

        int iRet = obj.FirstOcc();
         System.out.println("Index is : " +iRet);
    }
}