package com.sayesha;
@FunctionalInterface
interface AlphaOne{
	int beta();
}
public class returnFInterface {

	public static void main(String[] args) {
		AlphaOne a = new AlphaOne() {
			
			@Override
			public int beta() {
				int r = 20;
				System.out.println("This is anonymous inner class");
				return r;
				
			}

			
		};int res = a.beta();
		System.out.println(res);
		

	}

}


