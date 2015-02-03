public class OddEvenMethod{
	
	public void oddEvenProduct(int x , int y){
		int product =  x * y;
		
		if(x%2==0 && y%2==0)
			System.out.println("The first number is even, the second number is even. The product of these numbers is "+product+" and it is even.");
		
		else if(x%2==0 && y%2==1)
			System.out.println("The first number is even, the second number is odd. The product of these numbers is "+product+" and it is even.");
			
		else if (x%2==1 && y%2==0)
			System.out.println("The first number is odd, the second number is even. The product of these numbers is "+product+" and it is even.");
			
		else if(x%2==1 && y%2==1)
			System.out.println("The first number is odd, the second number is odd. The product of these numbers is "+product+" and it is odd.");
			
		}
		
	public static void main(String[] args){
		OddEvenMethod oe1 = new OddEvenMethod();
		oe1.oddEvenProduct(17,19);
		oe1.oddEvenProduct(23,12);
		//oe1.oddEvenProduct(4,4);
		//oe1.oddEvenProduct(12,13);
	}





}
