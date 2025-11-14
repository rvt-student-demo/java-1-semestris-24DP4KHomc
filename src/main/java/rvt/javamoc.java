package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class javamoc {
    public static void main(String[] args) {
        onlythesenumbers();

    }
        public static void onlythesenumbers() {
            Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Enter numbers (-1 to stop): ");
            while (true) {
                int num = scanner.nextInt();
                if (num == -1) {
                    break;
                }
                    numbers.add(num);   
            }

                System.out.println("From where?");
                int start = scanner.nextInt();

                System.out.println("To where?");
                int end = scanner.nextInt();

                
                for (int i = start; i <= end; i++) {
                System.out.println(numbers.get(i));
                }


                scanner.close();
        }

}
