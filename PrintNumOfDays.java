import java.util.*;
public class PrintNumOfDays {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String mMonth ;
		System.out.println("Enter Month:");
		
		mMonth=input.nextLine();
		mMonth=mMonth.toUpperCase();
		input.close();
		//System.out.println(mMonth);
		switch (mMonth) {
		case "JANUARY":
			System.out.println(mMonth + " :" + "31 days.");
			break;

		case "FABURARY":
			System.out.println(mMonth + " " + "28/29 days.");
			break;
		case "MARCH":
			System.out.println(mMonth + " " + "31 days.");
			break;

		case "APRIL":
			System.out.println(mMonth + " " + "30 days.");
			break;
		case "MAY":
			System.out.println(mMonth + " " + "31 days.");
			break;

		case "JUNE":
			System.out.println(mMonth + " " + "30 days.");
			break;
		case "JULY":
			System.out.println(mMonth + " " + "31 days.");
			break;

		case "AUGUST":
			System.out.println(mMonth + " " + "31 days.");
			break;
		case "SEPTEMBER":
			System.out.println(mMonth + " " + "30 days.");
			break;

		case "OCTOBER":
			System.out.println(mMonth + " " + "31 days.");
			break;
		case "NOVEMBER":
			System.out.println(mMonth + " " + "30 days.");
			break;

		case "DECEMBER":
			System.out.println(mMonth + " " + "31 days.");
			break;
		default:
			System.out.println("Please Enter Valid Month");
			break;
		}

	}

}
