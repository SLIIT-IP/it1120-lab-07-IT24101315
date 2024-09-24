import java.util.Scanner;

public class IT24101315Lab7Q1A
{
	public static void main(String[] args)
	{
		Scanner input =new Scanner(System.in);

		int sub1=0,sub2=1,sub3=0,sub4=0;
		String grade="";

		System.out.println("Enter marks for four subjects :");
		
		while(true){
			System.out.print("Enter Subject Mark 1 : ");
			sub1= input.nextInt();
			if(sub1<100 && sub1>0){
				break;
			}else{
				System.out.println("invalid marks");
			}
		}
		while(true){
			System.out.print("Enter Subject Mark 2 : ");
			sub2= input.nextInt();
			if(sub2<100 && sub2>0){
				break;
			}else{
				System.out.println("invalid marks");
			}
		}
		while(true){
			System.out.print("Enter Subject Mark 3 : ");
			sub3= input.nextInt();
			if(sub3<100 && sub3>0){
				break;
			}else{
				System.out.println("invalid marks");
			}
		}

		while(true){
			System.out.print("Enter Subject Mark 4 : ");
			sub4= input.nextInt();
			if(sub4<100 && sub4>0){
				break;
			}else{
				System.out.println("invalid marks");
			}
		}

		System.out.println();
		
		double average =(sub1 + sub2 + sub3 + sub4)/4.0;

		if (average< 49.0){
			grade= "Fail";
		}else if(average>49.0 && average<75.0){
			grade="Credit";
		}else{
			grade="Distinction";
		}
		System.out.println("Average is : "+average);
		System.out.println("Overrall Grade is : "+grade);
	}
}