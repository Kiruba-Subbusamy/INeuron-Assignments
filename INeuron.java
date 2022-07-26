package com.ineuron;

public class INeuron {

	public static void main(String[] args) {
		int n = 5;
		int i,j;
		//For Loop to print I
		for(i=0;i<n;i++) {
					System.out.println("*");
			}System.out.println();
		//Loop to print N
			for(i=0;i<n;i++) {
				for(j=0;j<n;j++) {
					if((i>=0&&j==0)||(i==j)||(i>=0&&j==n-1)) {
						System.out.print("*");
						
					}
					else {
						System.out.print(" ");
					}
				}System.out.println();
			}
		//Loop o print E
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((i==0&&j>=0)||(i>=0&&j==0)||(i==n-1&&j>0)||(i==(n-1)/2&&j>0)){
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		//Loop to print U
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((i==n-1&&j==0&&j==n-1)||(i>=0&&i<n-1&&j>0&&j<n-1)) {
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}System.out.println();
		}
		//Loop to print R
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0 && j!=0 && j!=(n-1) || i==(n-1)/2 && j!=(n-1) ||j==0 && i!=0 || (j==(n-1) && i<=(n-1)/2) && i!=(n-1)/2 && i!=0 || (i>(n-1)/2 && i==j))
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
			
			}
		//Loop to print O
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((i==0&&j==0)||(i==n-1&&j==0)||(i==0&&j==n-1)||(i==n-1&&j==n-1)||(i>0&&i<n-1&&j>0&&j<n-1)) {
					System.out.print(" ");
			}
				else {
					System.out.print("*");
				}
		}System.out.println();
			}
		//Loop to print N
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if((i>=0&&j==0)||(i==j)||(i>=0&&j==n-1)) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		
		
	}

}
