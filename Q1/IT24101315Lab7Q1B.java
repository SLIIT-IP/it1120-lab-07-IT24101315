import java.util.Scanner;

public class IT24101315Lab7Q1B
{
	public static void main (String[] args)
	{
		Scanner input= new Scanner(System.in);

		int sub1=0,sub2=0,sub3=0,sub4=0;

			for(int student=1; student<=3; student++){

				System.out.println("Student " + student);
			
				while(true){

					System.out.print("Enter marks for 4 subjects (separated by spaces): ");

					sub1=input.nextInt();
					sub2=input.nextInt();
					sub3=input.nextInt();
					sub4=input.nextInt();

					if((sub1 < 0 || sub1 > 100) || (sub2 < 0 || sub2 > 100) || (sub3 < 0 || sub3 > 100) || (sub4 < 0 || sub4 > 100)){
						System.out.println("Invalid marks. All marks should be between 0 and 100.");
						continue;
					}else{
						break;
					}
				}

				double avg=(sub1+sub2+sub3+sub4)/4.0;
				System.out.println("Average is : " +avg);

				if(avg>=75){
					System.out.println("Overall Grade is Distinction");
				}else if(avg>=50){
					System.out.println("Overall Grade is Credit");
				}else{
					System.out.println("Overall Grade is Fail");
				}
				System.out.println();
				
			
			}


		

			
	}
}