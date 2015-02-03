public class DivisiableByNine{

	public boolean divisiableByNine(int x){
	
		int[] tempIntArr = new int[5];
		int sum = 0;
		String tempStr = Integer.toString(x);
		
		if(tempStr.length()== 5)
			{
				for(int i=0 ; i<5 ; i++)
				{
					tempIntArr[i] = Integer.parseInt(String.valueOf(tempStr.charAt(i)));
					sum = sum + tempIntArr[i];
				}
			if(sum%9 == 0)
				return true;
			else
				return false;
			}
		else
			{
			System.out.println("Invalid Parameter!);
			return false;
			}
		}
		
	public static void main(String[] args)
		{
		  DivisiableByNine dbn = new DivisiableByNine();
		   boolean result = dbn.divisiableByNine(11763);
		   System.out.println(result);
		   
		   result = dbn.divisiableByNine(82369);
		   System.out.println(result);
		   
		   result = dbn.divisiableByNine(9999);
		   System.out.println(result);
		}
}