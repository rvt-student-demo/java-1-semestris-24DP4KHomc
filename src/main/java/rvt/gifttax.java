package rvt;

import java.util.Scanner;

public class gifttax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of the gift: ");
        Double valuegift = scanner.nextDouble();

            Double value = 0.0;
            if(valuegift >= 5000){
            value = (100 + (valuegift-5000)*0.08);
            }
            else if(valuegift >= 25000){
            value = (1700 + (valuegift-25000)*0.10);
            }
            else if(valuegift >= 55000){
            value = (4700 + (valuegift-55000)*0.12);
            }
            else if(valuegift >= 200000){
            value = (22100 + (valuegift-200000) * 0.15);
            }
            else if(valuegift >= 1000000000){
            value = (142100 + (valuegift - 1000000000) * 0.17);
            }
            
        System.out.println("The gift tax is: " + value);
        scanner.close();









    }
    
}
