
import java.util.*;
public class SquareCubeRoot {
	public static void main(String[] args){
		try{
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=input.nextInt();
		System.out.println("Square root of "+num+" : "+Math.sqrt(num));
		System.out.println("cube root of "+num+" : "+Math.cbrt(num));
		input.close();
		}catch(Exception e){
			System.out.println("Please enter valid number");
		}
	}

}
