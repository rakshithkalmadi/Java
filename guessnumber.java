import java.util.Random;
import java.util.Scanner;

public class guessnumber
{
	public static void main(String[] args) {
		System.out.println("Welcome to Guess Random Number Game ");
		System.out.println("Please enter your name: ");
		try (Scanner in = new Scanner(System.in)) {
			String name = in.next();
			System.out.println("Hello "+name);
			System.out.println("Shall we start the game? (y/n)");
			String start = in.next();
			if(start.equals("y")){
				Random r = new Random();
				int number = r.nextInt(10);
				System.out.println("Please guess the number: ");
				int guess = in.nextInt();
				int i=0;
				while(i<5){
					i++;
					if(guess==number){
						System.out.println("Congratulations! You guessed the number!");
						break;
					}
					else if(guess>number){
						System.out.println("Your guess is high. Please try again: ");
						guess = in.nextInt();
					}
					else if(guess<number){
						System.out.println("Your guess is low. Please try again: ");
						guess = in.nextInt();
					}
				}
				System.out.println("The number was "+number);
			}
		}
	}
}
