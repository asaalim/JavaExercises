public class WhichQuarter{

	public String whichQuarter(int x){
		String quarterRes = new String();
		if(x>=1 && x<=25)
		return quarterRes = "Number "+x+" belongs to first quarter";
		else if(x>=26 && x<=50)
		return quarterRes = "Number "+x+" belongs to second quarter";
		else if(x>=51 && x<=75)
		return quarterRes = "Number "+x+" belongs to third quarter";
		else if(x>=76 && x<=100)
		return quarterRes = "Number "+x+" belongs to fourth quarter";
		else
		return quarterRes = "Number "+x+" is outside the allowed range of integers";
	}
	
	public static void main(String[] args){
	 WhichQuarter te1 = new WhichQuarter();
	 String quarterResult = new String();
	 
	 quarterResult = te1.whichQuarter(17);
	 System.out.println(quarterResult);
	 quarterResult = te1.whichQuarter(100);
	  System.out.println(quarterResult);
	 quarterResult = te1.whichQuarter(999); 
	  System.out.println(quarterResult);
	 quarterResult = te1.whichQuarter(-123);
	  System.out.println(quarterResult);
	 
	  
	}
}