public class gui {
	public static void main(String[] args) {
		Sframe frame = new Sframe(400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}
}
class Sframe extends javax.swing.JFrame {
	public Sframe(int w,int h) {
		width = w;
		height = h;
		setSize(width,height);
	}
	transient int width,height;
}