import java.util.Scanner;

public class DoublingDigits5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("Ans: "+doubleDigit(0,n,0));
    }
    static long doubleDigit(long tot,int num,int pow) {

        if(num!=0)
        {
            tot=tot+(num%10)*(long)Math.pow(10,pow)+(num%10)*(long)Math.pow(10,pow+1);
            return doubleDigit(tot,num/10,pow+2);
        }
        else
        {
            return tot;
        }
    }
}