package com.sayesha;
interface Alpha{
	void beta();
	void theta();
}
public class FInterface {

	public static void main(String[] args) {
		Alpha a = new Alpha() {
			
			@Override
			public void beta() {
				System.out.println("This is anonymous inner class");
				
			}

			@Override
			public void theta() {
				System.out.println("An example of having more than one unimplemented methods \n and can me implemented by anonymous inner class\n But if we use @FunctionalInterface annotation, we cannot have more than one interface");
			}
		};a.beta();
		a.theta();

	}

}
