public class IsPrime{
	public boolean isPrime(int x){
		int tempNum , result = 0;
		for(int i =2 ;i<x ; i++)
		{
			tempNum = x%i;
				if(tempNum != 0)
				  result = tempNum ;
				
				else if (tempNum == 0)
					return false;
				
		}
		  if (result != 0)
			 return true;
		  else if (x==2)
		     return true;
		  else
		  	return false;
		
		}
	
	public static void main(String[] args)
	{
		IsPrime ip = new IsPrime();
		
		boolean isPrime = ip.isPrime(31);
		System.out.println(isPrime);
		
		isPrime = ip.isPrime(2);
		System.out.println(isPrime);
		
		isPrime = ip.isPrime(287);
		System.out.println(isPrime);
	}
	
}