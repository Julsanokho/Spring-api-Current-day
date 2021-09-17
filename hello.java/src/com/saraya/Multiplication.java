package com.saraya;

public class Multiplication {
	 void tableMultiplication(int x){
		for(int i = 1; i <=10 ;i++) {
			System.out.printf("%d x %d = %d",x,i,x*i).println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplication mp = new Multiplication();
		mp.tableMultiplication(2);

	}

}

