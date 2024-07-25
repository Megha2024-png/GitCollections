package Math;

public class Multiplication {
	
	
		
		public int mul(int a , int b) {
		  int c = a*b;
		  return c;
		}
		
		public void multi() {
			
			int a=4;
			int b= 5;
			int d=a*b;
			System.out.println("Multiplication result is:"+d);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Multiplication m=new Multiplication();
			Multiplication ml=new Multiplication();
	        ml.multi();
	        int result=m.mul(20,30);
	        System.out.println("Multiplication result is:" +result);
	        
		}

	}


