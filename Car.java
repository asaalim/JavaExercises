public class Car{

private boolean driving ;
private String model , colour;
private int horsePower;

	public Car()
	{
	}
	
	public Car(String m , String c , int bhp , boolean d){
	model = m;
	colour = c;
	horsePower = bhp;
	driving = d;
	} 
	
	public void setDriving(boolean driv){
		driving = driv;
	}
	public void setModel(String mod){
		model = mod;
	}
	public void setColour(String colr){
		colour = colr;
	}
	public void setHorsePower(int hPower){
		horsePower = hPower;
	}
	public boolean getDriving(){
		return driving;
	}
	public String getModel(){
		return model;
	}
	public String getColour(){
		return colour;
	}
	public int gethorsePower(){
		return horsePower;
	}

	public void drive(){
		driving = true;
	}
	
	public void brake(){
		driving = false;
	}
	
	public void printDetails(){
		System.out.println("The car is a "+colour+" "+model+" with "+horsePower+" bhp. "+"Driving:"+driving);
	}
	
	public static void main(String[] args)
	{
		Car car1 = new Car("Fiesta" , "red" , 130 , false);
		car1.printDetails();
		
		Car car2 = new Car();
		car2.setModel("Mondeo");
		car2.setColour("black");
		car2.setHorsePower(200);
		car2.setDriving(true);
		car2.printDetails();
	}

}