import java.util.Scanner;

public class Hello {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Name ");
		String name =input.next();
		System.out.println("Your name is " + name);
		
		System.out.println("What is your age ");
		int age = input.nextInt();
		System.out.println("Your age is " + age);
	}
}