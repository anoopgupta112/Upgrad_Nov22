
class Try {
	private int a;
	private int b;
	public Try(int a) {
		this.a = a;
	}
	public int seta() {
		return a;
	}
	public void getb(int b) {
		this.b = b;
	}
	public int setb() {
		return b*a;
	}
	
}
public class checking {
	
	public static void main(String[] args) {
		Try t = new Try(2);
//		I want multiply both number with Constructor(2). exp - 2*3*4=24
		
		t.getb(3);//I want multiply this with 2 which in Constructor
	    t.getb(4);//And I want this too multiply with Constructor number
		
		System.out.println(t.setb()); //ans should be 24 here but It's multiplying only with last one (2*4)=8
	}

}
