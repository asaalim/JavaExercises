public class ArrayBetween{
	public int[] arrayBetween(int x , int y)
	{
		int arraySize = 0;
		if(x>y)
			arraySize = x-y;
		else
			arraySize = y-x;
		int[] intArray = new int[arraySize];
		for(int i=0; i<arraySize ; i++)
			{
				if(x<y)
				{
					intArray[i] = x;
					x++;
				}
				else
				{
					intArray[i] = y;
					y++;
				}
			}
			return intArray;
	}
	
	public static void main(String[] args)
	{
		ArrayBetween ab = new ArrayBetween();
	  int[] intArray = ab.arrayBetween(296,295);
	  for(int i =0 ; i<intArray.length ; i++)
	  	{
	  	System.out.print(intArray[i]+",");
	  	}
	}
}