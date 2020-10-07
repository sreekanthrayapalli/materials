package com.myc.javafeatures.methodref;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFunctional {
	
	int m1(int a) {
		return a*a;
	}

	public static void main(String[] args) {
		Function<Integer, Integer> f = (a)->{
			int c = a*a;
			return c;
		};
		
		int result = f.apply(10);
		System.out.println(result);
		
		BiFunction<Integer, Integer, Integer> bi = (a,b)->{
			int c= a+b;
			return c;
		};
		
		UnaryOperator<Integer> u = (a)->a*2;
		
		BinaryOperator<Integer> bu = (a,b)->a+b;
		bu.apply(10, 20);
		
		System.out.println();
		
		Predicate<String> p = (s)->s.equals("abc");
		
		Consumer<String> c = (s)->{
			System.out.println(s);
		};
		
		Supplier<String> s= ()->{
			return "abc";
		};
		
		
		
		System.out.println(bi.apply(10, 20));
		
		System.out.println();
		
		
		I1 obj;
	}

}
