package Exercice_2;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args)
    {
        String mail;
        if (args.length == 0) mail = "tetsts@gmail.com";
        else mail = args[0];

        Instant start = Instant.now();

        FileToHashMap filetoHM = new FileToHashMap("sample.txt");
        filetoHM.printAllScores();
        System.out.println("Score moyen = " + filetoHM.calculateMean());
        System.out.println("Score de " + mail + " : " + filetoHM.getScore(mail));

        Duration duration = Duration.between(start, Instant.now());
        System.out.println("Temps d'éxécution: " + duration);
    }
}