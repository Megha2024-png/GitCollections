package Math;

public class Substaction {

		
		public int sub(int a , int b) {
		  int d = a-b;
		  return d;
		}
		
		public void subno() {
			
			int a=40;
			int b= 30;
			int d=a-b;
			System.out.println("Substaction result is:"+d);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Substaction subt=new Substaction();
			Substaction s=new Substaction();
	        s.subno();
	        int result=subt.sub(85,60);
	        System.out.println("Substaction result is:" +result);
	        
		}

	}
	

