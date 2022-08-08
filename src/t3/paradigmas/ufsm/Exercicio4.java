package t3.paradigmas.ufsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wesleylopex
 */
public class Exercicio4 {
    
    public static void main (String[] args) {
        int numbersFrom0To25 = 0;
        int numbersFrom26To50 = 0;
        int numbersFrom51To75 = 0;
        int numbersFrom76To100 = 0;
        
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um numero: ");
            int number = scanner.nextInt();
            
            if (number >= 0 && number <= 25) {
                numbersFrom0To25++;
            } else if (number <= 50) {
                numbersFrom26To50++;
            } else if (number <= 75) {
                numbersFrom51To75++;
            } else if (number <= 100) {
                numbersFrom76To100++;
            }
        }
        
        System.out.println("[0, 25]: " + numbersFrom0To25);
        System.out.println("[26, 50]: " + numbersFrom26To50);
        System.out.println("[51, 75]: " + numbersFrom51To75);
        System.out.println("[76, 100]: " + numbersFrom76To100);
    }
}
