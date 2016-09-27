import java.util.Scanner;

public class TuitionRate {
	
	private static int initialCost;
	private static double percentageIncrease;
	private static double APR;
	private static int year;
	private static int fourYears; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TuitionRate TuitionObject = new TuitionRate();
		
		System.out.println("Enter the tuition rate: ");
		initialCost = sc.nextInt();
		
		System.out.println("How much is the percentage increase? ");
		percentageIncrease = sc.nextDouble();
		
		fourYears = TuitionObject.totalCost(initialCost, percentageIncrease);
		
		System.out.printf("The total cost for four years will be: %d", TuitionObject.totalCost(initialCost, percentageIncrease));
		
	}
	
	public int totalCost(int initialCost, double percentageIncrease) {
		return (int)((initialCost * percentageIncrease) + initialCost) * 4;
		}
	
	

}