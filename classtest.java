import static java.lang.System.*;

import java.awt.Toolkit;
public class classtest {
	public static void main(String[] args) {
		String[] st = new String[3];
		st[0]="hello";
		st[1]="world";
		st[2]="aditya";
		Object a = st;
		Class cl= a.getClass();
		Class sl = st.getClass();
		out.println(cl.getName());
		out.println(sl.getName());
		out.println(cl.getComponentType());
		Toolkit.getDefaultToolkit().beep();
		
	}
}