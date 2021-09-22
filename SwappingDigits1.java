import java.util.Scanner;

public class SwappingDigits1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        long n=sc.nextLong();
        System.out.print("\nafter swapping: "+swapnumber(n));
    }
    static long swapnumber(long n)
    {
        String s=String.valueOf(n);
        int len=s.length();

        if(len%2==0)
        {
            return Long.parseLong(swapping(s,len));
        }
        else
        {
            return Long.parseLong(String.valueOf(s.charAt(0))+swapping(s.substring(1),len-1));
        }
    }
    static String swapping(String t,int len)
    {
        StringBuffer sb=new StringBuffer();

        for(int i=0;i<len;i+=2)
        {
            sb.append(t.charAt(i+1));
            sb.append(t.charAt(i));
        }
        return sb.toString();
    }
}