import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int min;
        int max;


        if (num1 < num2) {
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }

        System.out.print("Numbers between: ");
        for (int i = min + 1; i < max; i++) {
            if(i % 2 == 0){
                System.out.print(i + " ")
            }  
        }
        System.out.println();
    }
}
