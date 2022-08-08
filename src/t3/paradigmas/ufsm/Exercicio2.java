package t3.paradigmas.ufsm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author wesleylopex
 */
public class Exercicio2 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> voteList = new ArrayList<>();
        int currentVote;
        
        do {
            System.out.print("Digite o seu voto (1 a 6): ");
            currentVote = scanner.nextInt();
            
            if (currentVote > 0 && currentVote <= 6) {
                voteList.add(currentVote);
            }
        } while (currentVote != 0);
        
        int numberOfVotesForCandidate1 = getNumberOfVotesByCode(voteList, 1);
        int numberOfVotesForCandidate2 = getNumberOfVotesByCode(voteList, 2);
        int numberOfVotesForCandidate3 = getNumberOfVotesByCode(voteList, 3);
        int numberOfVotesForCandidate4 = getNumberOfVotesByCode(voteList, 4);
        
        int numberOfNullVotes = getNumberOfVotesByCode(voteList, 5);
        int numberOfWhiteVotes = getNumberOfVotesByCode(voteList, 6);
        
        System.out.println("Candidato 1: " + numberOfVotesForCandidate1);
        System.out.println("Candidato 2: " + numberOfVotesForCandidate2);
        System.out.println("Candidato 3: " + numberOfVotesForCandidate3);
        System.out.println("Candidato 4: " + numberOfVotesForCandidate4);
        System.out.println("Votos nulos: " + numberOfNullVotes);
        System.out.println("Votos em branco: " + numberOfWhiteVotes);
    }
    
    private static int getNumberOfVotesByCode (ArrayList<Integer> voteList, int code) {
        int numberOfVotes = 0;
        
        for (int vote : voteList) {
            if (vote == code) {
                numberOfVotes++;
            }
        }
        
        return numberOfVotes;
    }
}
