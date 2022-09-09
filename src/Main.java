import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи свой вес");
        int weight = scan.nextInt();
        System.out.println("Введи свой рост");
        double height = scan.nextInt();
        double bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}
