package rvt;

public class chapter60 {
     public static void main(String[] args) {
    ex1();
    ex2();
    ex3();
    ex4();
    ex5();
    }
    public static void ex1(){
        int[] val = {1, 2, 3};
        int sum = val[0] + val[1] + val[2];
        System.out.println("Sum of all numbers = " + sum);
    }
    public static void ex2() {
        int[] val = {13, -4, 82, 17};
        int[] twice = {26, -8, 164, 34};
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
        // Construct an array object for twice
        // Put values in twice that are twice the
        // corresponding values in val.

        System.out.println( "New Array: " + twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
    }
    public static void ex3() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {-12,  24, -79, -13};
        int[] sum    = {  1,   2,   3,   4};


        System.out.println( "sum: " + sum[0] + " " + sum[1] + " " + sum[2] + " " + sum[3] );
    }
    public static void ex4() {
        int[] valA   = { 13, -22,  82,  17}; 
        int[] valB   = {  12,   47,   57,   8};

        System.out.println( "valA: " + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
        System.out.println( "valB: " + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

        System.out.println( "sum:  " + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) ); 
    }
    public static void ex5() {
        int[] val = {0, 1, 2, 3}; 
        int[] temp = {3, 2, 1, 0};
 
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

        System.out.println( "Reversed Array: " + val[3] + " " + val[2] + " " + val[1] + " " + val[0] );
    }
}
