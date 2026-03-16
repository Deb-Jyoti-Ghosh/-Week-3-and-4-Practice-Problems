import java.util.Scanner;

public class Level_2_Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, bonus;
        int years;

        System.out.print("Enter employee salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        years = sc.nextInt();

        if (years > 10) {
            bonus = salary * 0.10;
        } 
        else if (years >= 6) {
            bonus = salary * 0.08;
        } 
        else if (years >= 1) {
            bonus = salary * 0.05;
        } 
        else {
            bonus = 0;
        }

        System.out.println("Bonus amount: " + bonus);

        sc.close();
    }
}
