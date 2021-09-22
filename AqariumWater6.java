import java.util.Scanner;

public class AqariumWater6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pH value: ");
        double n = sc.nextDouble();

        if(n<7)
            System.out.println("pH value is low, partial water change required");
        else if(n>=7 && n<=8)
            System.out.println("pH value is fine");
        else
            System.out.println("pH value is high, partial water change required");
    }
}