import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.*;
import java.util.*;
public class proxy {
	public static void main(String[] args) {
		anony a = new anony() {
				//replace dun to fun
				public void dun() {  
					System.out.println("dun");
				}
		};
		//a.dun();
		a.fun();
	try {
	String s = "Happy";
	Integer i = 3;
	//InvocationHandler handler = new Handler(s);
	InvocationHandler handler = new Handler(i);
	Class[] interfaces = s.getClass().getInterfaces();
	//Class[] interfaces = i.getClass().getInterfaces();
	Object proxy = Proxy.newProxyInstance(null,interfaces,handler);
	//Object ps = proxy;
	//String ps = (String) proxy;
	//Comparable c = (Comparable )proxy;
	//System.out.println(s.compareTo("hoppu"));
	//System.out.println((Comparable)proxy.compareTo("hopp"));
	System.out.println(((Comparable<String>)proxy).compareTo("hoppu"));
	//System.out.println(ps);
	reflection.printclass(proxy.getClass().getName(),"");
	}
	catch(Exception e) {
		System.out.println(e.getClass().getName());
	}
	}
}
class anony {
	public void fun() {
		System.out.println("fun");
	}
}

class Handler implements InvocationHandler {
	public Handler(Object t) {
		target = t;
	}
	public Object invoke(Object proxy,Method m,Object[] args) throws Throwable {
		System.out.println(m.getName());
		return m.invoke(target,args);
	}
	private Object target;
}