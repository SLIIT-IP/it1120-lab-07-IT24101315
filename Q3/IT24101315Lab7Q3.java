import java.util.Scanner;

public class IT24101315Lab7Q3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int customer =5;
		
		for(int i=1; i<=customer; i++){

			System.out.println("Customer"+i);
			
			System.out.print("Enter total bill amount : ");
			double amount = input.nextDouble();

			System.out.print("Enter mode of payment (C for cash,O for other) : ");
			char mode = input.next().charAt(0);

			if(mode=='C' || mode=='c'){
				double discount = amount*0.05;
				double newamount=amount-discount;
				System.out.println("Discount is : "+discount);
				System.out.println("Amount to be paid : "+newamount);
			}else if(mode=='O' || mode=='o'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid : "+amount);
			}else{
				System.out.println("Payment is not valid");
			}
			System.out.println();
		}
	}
}