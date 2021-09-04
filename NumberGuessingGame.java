import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		Random rd=new Random();
		int userGuess;
		
		int ch;
		do {
			int random_number=1+rd.nextInt(10);
		
			int guessCount=1,guessLimit=3;
			boolean outOfGuesses=false;
		
			System.out.println("Guess the number between 1 to 10, you have 3 guesses");
			userGuess=sc.nextInt();
	
			while(userGuess!=random_number && !outOfGuesses) {
				if(guessCount<guessLimit) {
					if(userGuess<random_number) {
						System.out.println(userGuess+ "is Smaller than the right guess!");
						System.out.println("----------------------------------------------------");
					}
					else {
						System.out.println(userGuess+ "is Greater than the right guess!");
						System.out.println("----------------------------------------------------");
					}

					System.out.println("Guess another number: ");
					userGuess=sc.nextInt();
				guessCount++;
				}
				else
					outOfGuesses=true;
			}
		
			if(outOfGuesses) {
				System.out.println("");
				System.out.println("*****************************************************");
				System.out.println("\tYou loose! the right answer was: "+random_number);
				System.out.println("*****************************************************");
			}
			else {
				System.out.println("");
				System.out.println("*****************************************************");
				System.out.println("\t   Congratulations!!! You Win!");
				System.out.println("*****************************************************");
			}
			System.out.println("");
			System.out.println("Press 1 to play again else press 0");
			ch=sc.nextInt();
			
		}while(ch==1);
		if(ch==0)
			System.out.println("THANK YOU!");
	}
}