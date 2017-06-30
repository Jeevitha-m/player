import java.io.*;
import java.util.*;
class camelcase
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String arr[]=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            String str1=arr[i];
            
            String str2=String.valueOf(str1.charAt(0)).toUpperCase();
            System.out.print(str2+str1.substring(1)+" ");
        }
    }
}
