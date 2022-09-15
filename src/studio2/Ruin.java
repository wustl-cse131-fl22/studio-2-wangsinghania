package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your starting amount: ");
		int startAmount = in.nextInt();

		System.out.print("Enter your winning chance: ");
		double winChance = in.nextDouble();

		System.out.print("Enter your winning limit: ");
		int winLimit = in.nextInt();

		int money = startAmount;

		while (money > 0 && money < winLimit)
		{
			if (Math.random() < winChance) {
				money += 1;
				System.out.println("You won! Your total is: " + money);
			}
			else {
				money -=1; 
				System.out.println("You lost :( Your total is: " + money);
			}
		}

	}
}
