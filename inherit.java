public class inherit
{
	public static void main(String[] args) {
		emp e;
		man m = new man(1000);
		e=m;
		//e.setbonus(500);
		System.out.println(e.getsal());
		man[] ms =  new man[10];
		emp[] es = ms;
		es[0]= new emp(5000);
	}
}
class emp
{
	
	emp(int s) {
		sal=s;
	}
	public int getsal() {
		return sal;
	}
	private int sal;
}

class man extends emp
{
	man(int s) {
		super(s);
	}
	public int getsal() {
		return  bonus+super.getsal();
	}
	public void setbonus(int b) {
		bonus=b;
	}
	private int bonus=0;
}
