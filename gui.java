import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Image;
public class gui {
	public static void main(String[] args) {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension ssize = kit.getScreenSize();
		GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice gdev = genv.getDefaultScreenDevice();
		//System.out.println(gdev.getAvailableAcceleratedMemory());
		int sres = kit.getScreenResolution();
		System.out.println(sres);
		Sframe frame = new Sframe(800,600);
		Image img = kit.getImage("/home/aditya/Pictures/photopass.jpg");
		frame.setIconImage(img);
		frame.setLocation(ssize.width/4,ssize.height/4);
		java.awt.Container pane = frame.getContentPane();
		Spanel panel = new Spanel();
		panel.setPreferredSize(new Dimension(400,300));
		//panel.setLocation(100,100);
		//panel.setBounds(50,50,400,300);
		panel.setBackground(Color.green);
		
		pane.add(panel);
		
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}
}
class Sframe extends javax.swing.JFrame {
	public Sframe(int w,int h) {
		width = w;
		height = h;
		setPreferredSize(new Dimension(width,height));
		setTitle("Aditya");
		setLocation(400,400);
		setResizable(true);
		//setBounds(400,400,400,300);
	}
	transient int width,height;
}

class Spanel extends javax.swing.JPanel {
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		g.drawString("I love every girl",50,100);
	}
}