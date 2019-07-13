package home.arrays;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test implements TestInterface{

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		/*int count = 0;
		int x = 3;
		while(count++ < 3) {
		int y = (1 + 2 * count) % 3;
		switch(y) {
		default:
		case 0: x -= 1; break;
		case 1: x += 5;
		}
		}
		System.out.println(x);*/
		
		TestInterface testInt = new TestIntImpl();
		
		Method[] methods = testInt.getClass().getMethods();
		
		for(Method method:methods) {
			Deprecated annotation = method.getDeclaredAnnotation(Deprecated.class);
			
			if(annotation!=null) {
				System.out.println("Annotation found!!");
				method.invoke(testInt);
			}
			
		}
		
		}

	

}
