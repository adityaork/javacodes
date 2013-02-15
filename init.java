public class init
{
   static {
		test[] s = new test[2];
		s[0] = new test();
		s[1] = new test();
		if(s[0] == null) {System.out.println("Pass");}
		System.out.println(s[0].getid()+"  "+s[1].getid());
		}
}

class test
{
	static int id=0;
	
	test()
	{
		System.out.println("Constructor");
	}
	private int assign() {
		int t;
		t=++test.id;
		return t;
	}
	public int getid() {
		return eid;
		}
	private int eid=assign();
}			
