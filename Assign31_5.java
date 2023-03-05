
/*
Write a java program which accept string from user & display
it in reverse order

Input : "Marvellous"
output: "suollevraM"
*/
import java.util.*;
class StringDemo
{
    public void Reverse(String s)
    {
        for(int i = s.length();i > 0;i--)
        {
            System.out.print(s.charAt(i)+"\t");
        }        
    }
}
class Assign31_5
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter the string : ");

        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        dobj.Reverse(str);
    }
}