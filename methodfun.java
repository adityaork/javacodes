import java.lang.reflect.*;
import static java.lang.System.*;
public class methodfun {
	public static void main(String[] a) {
		try {
			ca c1 = new ca();
			cb c2 = new cb();
			Method m =  (ca.class.getDeclaredMethods())[0];
			System.out.println(m.getName());
			//Object[] args= new Object[1];
			//args[1] =2;
			Object imp = c2.retThis();
			if(imp==c2) System.out.println("TRUE");
			out.println("Good");
			m.invoke(c2,(Integer)4);
		}
		catch(Throwable t) {
			System.out.println(t.getMessage());
		}
	}
}	

class ca {
	public void prt(Integer a) {
			System.out.println("Value is = "+a);
	}
	private int a=23;
}

class cb {
	public Object retThis() {
		return this;
	}
	private int a=32;
}
