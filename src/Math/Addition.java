package Math;

public class Addition {
	
	public int add(int a , int b) {
	  int c = a+b;
	  return c;
	}
	
	public void addno() {
		
		int a=12;
		int b= 20;
		int d=a+b;
		System.out.println("Addition result is:"+d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Addition ad=new Addition();
        Addition a=new Addition();
        a.addno();
        int result=ad.add(5,10);
        System.out.println("Addition result is:" +result);
        
	}

}


