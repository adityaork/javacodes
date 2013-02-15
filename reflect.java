import java.lang.reflect.*;
public class reflect {
	public static void main(String[] args) {
		int i,j;
		String nm = "Sonu";
		ref r= new ref(nm,1000);
		ref p = new ref(nm,2000);
		nm="Cheater";
		//r.prnt();
		//p.prnt();
		Class cl = ref.class;
		Field[] f = cl.getFields();
		Field[] fs = cl.getDeclaredFields();
		for(Field fe:f) {
			System.out.println(f.getName());
			}
		System.out.println("-----");
		for(Field fe:fs) {
                        System.out.println(f.getName());
                        }


	}
}

class ref {
	public ref() {
	sal=1000;
	Name = "Aditya";
	ref.cd++;
	}
	ref(String s,int i) {
		Name=s;
		sal=i;
		ref.cd++;
	}
	public static int count(boolean x) {
		return cd;
	}
	public final void prnt() {
	System.out.println(Name);
	}
	private String getname() {
		return Name;
	}
	public String Name;
	static int cd =1;
	private int sal;
}
