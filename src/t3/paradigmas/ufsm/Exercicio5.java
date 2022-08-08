package t3.paradigmas.ufsm;

import java.util.Scanner;

/**
 *
 * @author wesleylopex
 */
public class Exercicio5 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float totalPrice = 0;
        int code, numberOfProducts = 0;
        
        do {
            System.out.print("Digite o codigo: ");
            code = scanner.nextInt();
            
            if (code >= 0) {
                System.out.print("Digite o preco de custo: ");
                double price = scanner.nextDouble();
                
                double finalPrice = price + (price* 0.2);
                
                System.out.println("\nCodigo do produto: " + code);
                System.out.println("Preco do produto: " + finalPrice);
                
                totalPrice += finalPrice;
                numberOfProducts++;
            }
            
            System.out.println("");
        } while (code >= 0);
        
        System.out.println("Media de preco: " + totalPrice / numberOfProducts);
    }
}
