package com.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectUtil {
	
	@SuppressWarnings("unchecked")
	public static void setProperty(Object obj,String propertyName,Object objVaue){
		Class class1 = obj.getClass();
		
		//判断实体类有没有这个字段的setter方法
		String name = "set"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
		Method declaredMethod = null;
		try {
			declaredMethod = class1.getDeclaredMethod(name , String.class );
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		//动态调用setter方法
		try {
			declaredMethod.invoke(obj, objVaue);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@SuppressWarnings("unchecked")
	public static Object getProperty(Object obj,String propertyName){
		Class class1 = obj.getClass();
		//判断实体类有没有这个字段的getter方法
		String name = "get"+propertyName.substring(0,1).toUpperCase()+propertyName.substring(1);
		Method declaredMethod = null;
		try {
			declaredMethod = class1.getDeclaredMethod(name , null);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		//动态调用getter方法
		Object invoke = null;
		try {
			invoke = declaredMethod.invoke(obj,null);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoke;
	}
	
	//All Methods
		public static void getMethods(Object obj){
			Class class1 = obj.getClass();
			Method[] declaredMethods = class1.getDeclaredMethods();
			for (Method method : declaredMethods) {
				String name = method.getName();
				System.out.println(name);
			}
		}
		
		//All properties
		public static void getProperties(Object obj){
			Class class1 = obj.getClass();
			Field[] declaredFields = class1.getDeclaredFields();
			for (Field field : declaredFields) {
				String name = field.getName();
				System.out.println(name);
			}
		}
		
	//method
	public static Object reflectTest(Object obj1, Object obj1_val, Object obj2) throws Exception {
		
		Class class_obj2 = obj2.getClass();
		
		Method[] declaredMethods = class_obj2.getDeclaredMethods();
		for (Method method : declaredMethods) {
			
			String name = method.getName();
			
			if(name.startsWith("s")){
				
				String tail = name.substring(3);
				
				String firstUp = obj1.toString();
				firstUp = firstUp.substring(0, 1).toUpperCase()+firstUp.substring(1);
				
				if(tail.equals(firstUp)){
					
					method.invoke(obj2, obj1_val);
				}
				
			}
			
		}
		
		return obj2;
	}
}
