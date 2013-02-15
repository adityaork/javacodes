public class fnze{
	public fnze() { }
	public static void main(String[] abc) {
		//System.runFinalizersOnExit(true);
		temp t = new temp("aditya");
		//new temp();
		temp t2=t;
		fnze f = new fnze();
		//new temp("hello");
		System.out.println("last call");
		//System.gc();
	}
	private temp t= new temp("pra");
}
class temp {
	public temp(String s) {
		name =s;
	}
	private int a=122;
	private int b = 233;
	private String name ="default name";
	public void finalize() {
                System.out.println("I am lastest call");
        }

}
