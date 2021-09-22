import java.util.Scanner;

public class HourlyWageCalculator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of the employee");
        String name=sc.nextLine();

        System.out.println("Enter base pay of the employee");
        double pay=sc.nextDouble();

        System.out.println("Enter number of hours worked by the employee");
        int hr=sc.nextInt();

        System.out.println("Name :: "+name+
                "\nBase pay :: "+pay+
                "$\nHours worked :: "+hr+
                "\nSalary of employee :: "+calSalary(pay,hr)+"$");
    }
    static double calSalary(double pay,int hr)
    {
        if(hr>60)
            hr=60;

        if(hr>40)
            return (40*pay)+((hr-40)*pay*2);
        else
            return hr*pay;
    }
}