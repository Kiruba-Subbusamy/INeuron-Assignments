package com.sayesha;
interface AlphaThree{
	int add(int a,int b);
}
public class LambdaReturn {

	public static void main(String[] args) {
		AlphaThree athree = (a,b) ->
		{
			return a + b;
		};
		int res = athree.add(12, 12);
		System.out.println(res);
	}

}
