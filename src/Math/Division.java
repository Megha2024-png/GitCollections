package Math;

public class Division {

		
		public int div(int a , int b) {
		  int d = a/b;
		  return d;
		}
		
		public void divn() {
			
			int a=15;
			int b= 5;
			int d=a/b;
			System.out.println("Division result is:"+d);
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Division dv=new Division();
			Division d=new Division();
	        d.divn();
	        int result=dv.div(625,25);
	        System.out.println("Division result is:" +result);
	        
		}

	}
	

