import java.io.Console;


public class AgeCheck {
	public static void main(String[] args) {
		Console c = System.console();
		String a = c.readLine("Enter your age:");
		try {
			int age = Integer.parseInt(a);
			if(age>100){
				System.out.println("Please enter vaild age");
				return;
			}
			if (age >= 18)
				System.out.println("you are eligible to vote.");
			else
				System.out.println("you are not eligible to vote.");
			

		} catch (NumberFormatException e) {
			System.out.println("Wrong format of age entered.Please enter the vaid age");
			return;
		}

	}

}
