
/*
Write a java program which accept string from user & print
frequency of each word

Input : India is Demo India Hello Demo
output: India 2
        is    1
        Demo  2
        Hello 1
*/
import java.util.*;
class StringDemo
{
    public void CheckFrequency(String s1)
    {
        Map<String,Integer>mp = new TreeMap<>();

        //Spliting to find the word
        String Arr[] = s1.split(" ");

        for(int i = 0;i < Arr.length;i++)
        {
            if(mp.containsKey(Arr[i]))
            {
                mp.put(Arr[i],mp.get(Arr[i])+1);
            }
            else
            {
                mp.put(Arr[i],1);
            }
        }
        for(Map.Entry<String,Integer> entry:mp.entrySet())
        {
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
class Assign45_2
{
    public static void main(String og[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter string : ");
        String str = sobj.nextLine();

        StringDemo dobj = new StringDemo();

        dobj.CheckFrequency(str);        
    }
}

/*
we have to use here Map datastructure to store the occurance of each wordin the string.
traverse the entire string & check whether the current word is present in map or not.
*/
