public class Tutorial6{
	
	private static int counter=0;
	
	//////*********Sum Of Squares Method********//////////
	public int sumOfSquares(int x){
	  int totalSq = x*x;
	  
		if(x==0){
			return 0;
		}
		else{
			return totalSq + sumOfSquares(x-1);
		}
	}
	////////////////////////////////////////////////////
	
	
	/////////****Collatz Conjecture Method******////////
	public void collatzConjecture(int x){
		if(x==1)
			return;
		else if(x%2==0){
			collatzConjecture(x/2);
			counter++;
			}
		else{
			collatzConjecture((x*3)+1);
			counter++;
			}
	}
	
	///////////////////////////////////////////////////
	
	///////////******Reverse Array******///////////////
	public void reverseArray(String[] chrArray,int firstIndex,int lastIndex)
	{
		String temp ;
	
		if(firstIndex >= lastIndex )
		{
			for(int i=0; i<=chrArray.length-1 ; i++)
			System.out.print(chrArray[i]+",");
		
			return;
		}
		
		else {
		
			temp = chrArray[firstIndex];
			chrArray[firstIndex]=chrArray[lastIndex];
			chrArray[lastIndex]=temp;
			
			reverseArray(chrArray,firstIndex+1,lastIndex-1);
			
			}
		
	}
	
	/////////////////////////////////////////////////
	
	public static void main(String[] args){
		Tutorial6 te = new Tutorial6();
		/*int sum=te.sumOfSquares(9);
		int sum=te.sumOfSquares(12);
		int sum=te.sumOfSquares(17);
		System.out.println(sum);*/
		
		/*te.collatzConjecture(27);
		te.collatzConjecture(111);
		te.collatzConjecture(3721248);
		System.out.println(counter);*/
		
		//String[] revArray = {"The","World","Cup","was","full","of","surprises"};
		String[] revArray = {"a","b","c","d","e","f","g","h","i","j"};
		
		int firstIndex = 0;
		int lastIndex = revArray.length-1;
		
		te.reverseArray(revArray,firstIndex,lastIndex);
		//te.reverseArray(revArray,firstIndex,lastIndex);
	}
	
}
