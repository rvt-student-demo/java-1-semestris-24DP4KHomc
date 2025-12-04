package rvt;

import java.util.Scanner;

public class delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Ievadi preci: ");
        String prece = scanner.nextLine();

        System.out.println("Ievadi cenu: ");
        Double cena = scanner.nextDouble();

        System.out.println("Vai Jums ir nepieciešama ekspress piegāde? (0==nē, 1==jā): ");
        Double ekspress = scanner.nextDouble();

        Double piegades_cena = 0.0;

        if (cena < 10) {
            piegades_cena = 2.00;
        } else {
            piegades_cena = 0.00;
        }

        if (ekspress == 1) {
            piegades_cena = piegades_cena + 3.00;
        }

        Double kopaa = cena + piegades_cena;

        System.out.println("Rēķins:");
        
        System.out.println("   Prece: " + prece);
        System.out.println("   Cena: " + cena);
        System.out.println("   Piegāde: " + piegades_cena);
        System.out.println("   Kopā: " + kopaa);
    }
}
