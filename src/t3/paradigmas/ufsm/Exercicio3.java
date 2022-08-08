package t3.paradigmas.ufsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wesleylopex
 */
public class Exercicio3 {
    
    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Codigo do aluno: ");
            String studentCode = scanner.nextLine();
            
            ArrayList<Float> gradeList = new ArrayList<>();
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                float grade = scanner.nextFloat();
                gradeList.add(grade);
            }
            
            System.out.println("\nAluno: " + studentCode);
            
            float weightedGradeAverage = getWeightedGradeAverage(gradeList);
            System.out.println("Media ponderada: " + weightedGradeAverage);
            
            if (weightedGradeAverage >= 5) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
            
            System.out.println("");
        }
    }
    
    private static float getWeightedGradeAverage (ArrayList<Float> gradeList) {
        float higherGrade = getHigherGrade(gradeList);
        float average = 0;
        
        boolean higherGradeAlreadyChecked = false;
        
        for (float grade : gradeList) {
            if (grade == higherGrade && higherGradeAlreadyChecked != true) {
                average += grade * 4;
                higherGradeAlreadyChecked = true;
            } else {
                average += grade * 3;
            }
        }
        
        return average / 10;
    }
    
    private static float getHigherGrade (ArrayList<Float> gradeList) {
        float higher = 0;

        for (float grade : gradeList) {
            if (grade > higher) {
                higher = grade;
            }
        }
        
        return higher;
    }
}
