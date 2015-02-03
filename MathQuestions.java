public class MathQuestions {
	
	public int conditionFunction(int x){
		
		if(x==0){
			return 0;
		}
		else if(x%2==1 && x<0){
			x=x+100;
			return x;
		}
		else if(x%2==1 && x>0){
			x=x*x*x;
			return x;
		}
		else if(x%2==0 && x<0){
			x=x-100;
			return x;
		}
			
		else if(x%2==0 && x>0){
			x++;
			x=x*x*x;
			return x;
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}