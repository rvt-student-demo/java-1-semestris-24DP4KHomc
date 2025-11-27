package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {

    public static void main(String[] args) {
        onlythesenumbers();
        listSize();
        onTheList();
        removeLastTest();
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


    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.println();
        System.out.println("In total: " + list.size());
    }



    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

      
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.println();
        System.out.print("Search for? ");
        String search = scanner.nextLine();

        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }


    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            strings.remove(strings.size() - 1);
        }
    }

    public static void removeLastTest() {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
}
