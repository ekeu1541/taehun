package hijava.prac;

public class N {
	int x = 10;
	int y = 20;
	
	
	public void swap() {
		int t= x;
//		x = y; 8
	
		y = t;
	}
	
	public static void main(String[] args) { 
		
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		
		int i = 10;
		double d = 2.0;
		
		int r1 = (int)(i + d);
		int r2 = (int)(i - d);
		int r3 = (int)(i * d);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		double k = 12.4;
		int p = 3;
		int p4 = (int)(k / p)
				
		System.out.println();
		
	}

}
