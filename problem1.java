//pg no 6


import java.util.Scanner;
public class practice_sheet_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.next();
        float height = sc.nextFloat();
        int no_of_cars = sc.nextInt();
        float salary = sc.nextFloat();
        System.out.print(name);
        System.out.print(" gender ");
        System.out.print(gender);
        System.out.print(" is ");
        System.out.print(height);
        System.out.print(" meters tall,has ");
        System.out.print(no_of_cars);
        System.out.print(" cars and annual salary of ");
        System.out.print(salary);
        System.out.print(" L per annum.");
    }
}
