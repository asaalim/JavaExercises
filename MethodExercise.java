public class MethodExercise{

	//Multiplication Method
	public int multiplyTogether(int x , int y){
		return x*y;
	}
	
	
	//Printing Name Method
	public void printName(String personName){
	 System.out.println("Your name is  "+personName);
	}
	
	// Divide and Cube Method
	public void divideAndCube(double aNumber){
		double divideResult = aNumber/3;
		double x = divideResult;
		double numberCubed = x*x*x;
		System.out.println(numberCubed);
	}
	
	
	
	public static void main(String[] args)
	{
		MethodExercise me1 = new MethodExercise();
		
		int multiplyResult = me1.multiplyTogether(13,16);
		System.out.println(multiplyResult);
		multiplyResult = me1.multiplyTogether(11,122);
		System.out.println(multiplyResult);
		
		me1.printName("Nikola  Tesla");
		me1.printName("Peter  Higgs");
		
		me1.divideAndCube(2);
		me1.divideAndCube(321);
	}



}