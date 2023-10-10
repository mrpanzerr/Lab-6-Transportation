/**
*   PROGRAM PURPOSE: Basic Java Program Converted from Python
*   Name: Gaetano Panzer
*   Date: 8.25.2023
*   Section: CSC 331-001
**/

public class CoinsPanzerGaetano {
    public static void main(String[] args) {
	// Welcome Statement
        System.out.println("This program displays the result of 1,000,000 coin tosses.");

	// Initialize variables
        int count = 1;
        int heads = 0;
        int tails = 0;

	// Flip a coin 1000000 times and increase the count based on the flip
        while (count <= 1000000) {
            int flip = (int) (Math.random() * 2);
            if (flip == 0){
                heads += 1;
            }
            else{
                tails += 1;
            }
            count += 1;
        }
	// Print the results
        System.out.println("\tHeads:" + heads);
        System.out.println("\tTails:" + tails);
    }
}