package com.gs.car;

public class Accountor extends Employee {

	public static void main(String[] args) {
		int a=127;
		Integer b =127;
		Integer c =127;
		Integer d =128;
		Integer e =128;
		int f =128;
		if(a==b){
			System.out.println("a=b");
		}else{
			System.out.println("a!=b");
		}
		
		if(c==b){
			System.out.println("c=b");
		}else{
			System.out.println("c!=b");
		}
		
		if(d==e){
			System.out.println("d=e");
		}else{
			System.out.println("d!=e");
		}
		
		if(f==e){
			System.out.println("f=e");
		}else{
			System.out.println("f!=e");
		}
	}
}
