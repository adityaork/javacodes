public class vaarg {
	public static void main(String[] ma) {
		int[] a = new int[5];
		a[0]=1;
		a[1]=2;a[2]=3;a[3]=4;a[4]=5;
		max("aditya",a);
		}
	public static int max(String s,int... il) {
		System.out.println(s);
		for(int i:il) {
			System.out.println(i);
		}
		System.out.println(il[1]+" "+il[4]);
		return 0;
		}
}
