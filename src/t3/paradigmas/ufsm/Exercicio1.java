package t3.paradigmas.ufsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wesleylopex
 */
public class Exercicio1 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Float> salaryList = new ArrayList<>();
        ArrayList<Integer> numberOfChildrenList = new ArrayList<>();
        
        float currentSalary;
        int currentNumberOfChildren;
        
        do {
            System.out.print("Digite seu salario (R$): ");
            currentSalary = scanner.nextFloat();
            
            if (currentSalary >= 0) {
                System.out.print("Digite o numero de filhos: ");
                currentNumberOfChildren = scanner.nextInt();

                salaryList.add(currentSalary);
                numberOfChildrenList.add(currentNumberOfChildren);
            }
            
            System.out.print("\n");
        } while (currentSalary >= 0);
        
        float averageSalary = getAverageSalary(salaryList);
        float averageNumberOfChildren = getAverageNumberOfChildren(numberOfChildrenList);
        float higherSalary = getHigherSalary(salaryList);
        float percentageSalaryUpTo1000 = getPercentageSalaryUpTo1000(salaryList);
        
        System.out.println("Media de salario: " + averageSalary);
        System.out.println("Media de filhos: " + averageNumberOfChildren);
        System.out.println("Maior salario: " + higherSalary);
        System.out.println("Percentual de pessoal com salario ate R$ 1000,00: " + percentageSalaryUpTo1000 + "%");
    }
    
    private static float getAverageSalary (ArrayList<Float> salaryList) {
        float average = 0;

        for (float salary : salaryList) {
            average += salary;
        }
        
        return average / salaryList.size();
    }
    
    private static float getHigherSalary (ArrayList<Float> salaryList) {
        float higher = 0;

        for (float salary : salaryList) {
            if (salary > higher) {
                higher = salary;
            }
        }
        
        return higher;
    }
    
    private static float getPercentageSalaryUpTo1000 (ArrayList<Float> salaryList) {
        float numberOfPeople = 0;

        for (float salary : salaryList) {
            if (salary <= 1000) {
                numberOfPeople++;
            }
        }
        
        return numberOfPeople / salaryList.size() * 100;
    }
    
    private static float getAverageNumberOfChildren (ArrayList<Integer> numberOfChildrenList) {
        float average = 0;

        for (float numberOfChildren : numberOfChildrenList) {
            average += numberOfChildren;
        }
        
        return average / numberOfChildrenList.size();
    }
}
