import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            Integer num = Integer.parseInt(token);
            numbers.add(num);
        }

        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Sum = " + sum);

        sc.close();
    }
}
