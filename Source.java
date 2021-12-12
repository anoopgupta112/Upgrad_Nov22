package homeWorkAbs;

import homeWorkAbs.Source.Mobile1;
import homeWorkAbs.Source.Mobile2;

class Resu implements Mobile1,Mobile2{
	
	public void Mob1()
	{
		System.out.println(getMobile1.getDetails());
	
	}
	public void Mob2()
	{
		System.out.println(getMobile2.getDetails());
	}	}

public class Source{

	public static void main (String[] args) {
		Resu R = new Resu();
		R.Mob1();
		R.Mob2();
	
		
		
//			int a = 10, b = 5;
//			
//			System.out.println("add: " + CalcUtil.add(a, b));
//			System.out.println("sub: " + CalcUtil.sub(a, b));
//			System.out.println("mul: " + CalcUtil.mul(a, b));
//			System.out.println("div: " + CalcUtil.div(a, b));
	}
	
	 static interface Mobile1{
		Mobile getMobile1 = new Mobile("Sumsung", 15000);
			
	}
   static interface Mobile2  {
		 
		Mobile getMobile2 = new Mobile("Apple",50000);
	}
}

