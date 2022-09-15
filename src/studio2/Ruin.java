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

		System.out.print("Enter total simulations: ");
		int totalSimulations = in.nextInt();
		
		
		for (int day = 0; day < totalSimulations; day++) {
			int money = startAmount;
			int count = 0;
			while (money > 0 && money < winLimit)
			{
			
				
				if (Math.random() < winChance) {
					money += 1;

				}
				else {
					money -=1; 	

				}
				count++;
			}
			if (money<winLimit) {
				System.out.println("The day ended in ruin :(");
			}
			else {
				System.out.println("The day was a success!");
			}
			System.out.print("For day " + (day+1) + " you've completed " + count + " rounds.");
		double a = (1.0 - winChance * 1.0)/ winChance * 1.0;	
		double expectedRuin = 0;
		if (winChance == 0.5) {
			expectedRuin = 1.0 - (startAmount * 1.0 / winLimit * 1.0);
		}
		else {
			a = (Math.pow(a, startAmount) - Math.pow(a, winLimit))/(1.0 - Math.pow(a,winLimit));
			
		}
		
		}
		System.out.print(expectedRuin);
	}
}
