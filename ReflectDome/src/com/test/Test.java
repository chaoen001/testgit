package com.test;

public class Test {

	public static void main(String[] args) throws Exception {
		
		ReflectUtil.getMethods(new Cut());
		
		ReflectUtil.getProperties(new Cut());
		
//		Cut cut = new Cut();
////		cut = (Cut) ReflectUtil.reflectTest("ponevalue", "zhangsan",cut);
////		cut = (Cut) ReflectUtil.reflectTest("ptwovalue", "a123", cut);
////		
////		System.out.println(cut.toString());
//		
//		ReflectUtil.setProperty(cut, "ponevalue", "aa");
//		Object property = ReflectUtil.getProperty(cut, "ponevalue");
//		System.out.println(property.toString());
	}
}
