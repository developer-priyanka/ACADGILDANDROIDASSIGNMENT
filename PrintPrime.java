
public class PrintPrime {
	public static void main(String[] args){
		for (int i=2;i<100;i++){
			
			for(int j=2;j<=i;j++){
				
				if(i!=j&&i%j==0)
					break;
				
				if(i==j && i%j==0){
					System.out.print(i+" ");
				}
			}
		}
	}

}
