public class Tutorial5{

	public void oddsUpTo(int x)
	{
		if(x+1 <= 0)
		System.out.println("-1");
		
		else{
			int[] oddNumArray = new int[x+1];
		
			for(int i=0; i<oddNumArray.length;i++)
				{
				  oddNumArray[i] = i;
			  
			 	 if(oddNumArray[i]%2 == 1)
			  		System.out.print(oddNumArray[i]+",");
				}
			}
		}
	
	public static void main(String[] args)
	{
		Tutorial5 t5 = new Tutorial5();
		t5.oddsUpTo(18);
		t5.oddsUpTo(-7);
		t5.oddsUpTo(31);
	}

}