package com.sayesha;
interface AlphaTwo{
	void show();
}
public class LambdaExpressions {

	public static void main(String[] args) {
		//Lambda expressions is to handle lambda expressions
		AlphaTwo atwo = () ->
		{
			System.out.println("Lambda expressions");
		};
		atwo.show();

	}

}
