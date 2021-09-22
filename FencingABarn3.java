import java.util.Scanner;

public class FencingABarn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Select an option from list to calculate area of fence\n" +
                "1. Square area for the chickens\n" +
                "2. Circular area for ducks\n" +
                "3. Rectangular area for cows\n");
        int i=sc.nextInt();
        int a,b;
        switch (i)
        {
            case 1: System.out.println("enter side: ");
                    a=sc.nextInt();
                    System.out.println("Area of square for chickens is "+square(a));break;
            case 2: System.out.println("enter radius: ");
                    a=sc.nextInt();
                    System.out.println("Area of circle for ducks is "+circular(a));break;
            case 3: System.out.println("enter length and breadth: ");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("Area of rectangle for cows is "+rectangle(a,b));break;
        }
    }
    static double square(int r)
    {
        return r*r;
    }
    static double circular(int r)
    {
        return 3.14159265359*r*r;
    }
    static double rectangle(int a,int b)
    {
        return a*b;
    }
}