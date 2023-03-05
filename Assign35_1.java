/*
Write a java program which accept 2 string from user &
concate N characters of second string after first string.
value of N should be accepted from user.

Note : If third parameter is greater than the size of second string
then concate whole string after first string.

Input : "Marvellous Infosystems"
        "Logic Building"
        5
Output: "Marvellous Infosystems Logic"
*/
import java.lang.String;
import java.util.*;

class StringDemo
{
        public void StrNCatX(String s1,String s2,int iCnt)
        {
          for(int i = 0;i <= s2.length();i++)
           {
                if(i <= iCnt)
                {
                System.out.print(s1 + s2.charAt(i));
                }
           }
        }
        
}
class Assign35_1
{
        public static void main(String pj[])
        {
                Scanner sobj = new Scanner(System.in);

                System.out.println("Please enter First String :");
                String src = sobj.nextLine();

                System.out.println("Please enter Second String :");
                String dest = sobj.nextLine();

                System.out.println("Please enter number:");
                int iNo = sobj.nextInt();

                StringDemo dobj = new StringDemo();

                 dobj.StrNCatX(src,dest,iNo);
        }
}