package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	
    	
    	
    	boolean run = true;
    	
    	
    	while(run) {
    		System.out.print(">>");
    		
    		
    		Scanner sc = new Scanner(System.in);
    	
    		String str = sc.nextLine();
    	
    		String[] str1 = str.split(" ");
    	
    		
    		
    	try {
    		int a = Integer.parseInt(str1[0]);
    		int b = Integer.parseInt(str1[2]);
    		
    		if(str1[1].equals("+")) {
    		
    			Add add = new Add();
    			add.setValue(a, b);
    			System.out.println(add.calculate());
    			
    		}
    		else if(str1[1].equals("-")) {
    			Sub sub = new Sub();
    			sub.setValue(a, b);
    			System.out.println(sub.calculate());
    		}
    		else if(str1[1].equals("*")) {
    			Mul mul = new Mul();
    			mul.setValue(a, b);
    			System.out.println(mul.calculate());
    			
    		}
    		else if(str1[1].equals("/")) {
    			Div div = new Div();
    			div.setValue(a, b);
    			System.out.println(div.calculate());
    		}
    	
    		
    		else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    		
    		
    	}
    	catch(java.lang.NumberFormatException e) {
    		if(str.equals("/q")) {
    			System.out.println("종료합니다.");
    		}
    	}
    	
    	
    	
    		
    		
    	}
    	
    	
    }
}
