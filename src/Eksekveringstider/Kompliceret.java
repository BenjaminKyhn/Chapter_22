package Eksekveringstider;

public class Kompliceret {

    public static void main(String[] args) {


        int n = 20;
        int counter = 0;
        long resultat = 0;

        // Denne algoritme tager meget lang tid at gennemføre, og har en algoritmisk kompleksitet på O(N^2)
        for (int i = 10; i < n + 10; i++) {
            MyTimer.start();

            counter++;

            for (int j = 0; j < counter; j++) {
                System.out.print(".");
            }

            for (int j = 1; j <= Math.pow(2, i); j++) {
                resultat = i;
                for (int k = 0; k < n*j; k++) {
                    Math.pow(k, n);
                }
            }


            System.out.print(" ");
            MyTimer.stop();
        }

        System.out.println("Resultat " + resultat);

    }
}