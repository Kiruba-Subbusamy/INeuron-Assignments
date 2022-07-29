package com.ineuron;

public class CoralPattern {

	public static void main(String[] args) {
		int n,i,j;
		n=6;
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0) {
					System.out.print(n*j+1+" ");
				}
				else {
					System.out.print(n*j+i+1+" ");
				}
			}System.out.println();
		}
	}

}
