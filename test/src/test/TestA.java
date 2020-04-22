package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestA {
	public static void main(String[] args) throws Exception {
		
		AA aa = new AA();
		aa.a();
		Class cls = Class.forName("test.A");
		Object obj = cls.newInstance();
		Method method = cls.getDeclaredMethod("a", null);
		method.invoke(obj, null);
	}

}
