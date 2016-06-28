
public class PrintPattern {
	public static void main(String[]args){
		int x=0;
		for(int i=1;i<=5;i++){
			x=1;
			int j=i;
			while(x<=j){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--){
			x=1;
			int j=i;
			while(x<=j){
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
		
	}

}
