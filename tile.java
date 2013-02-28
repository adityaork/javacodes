import java.awt.Toolkit;

public class tile {
	public static void main(String[] args) {
		Sframe frame = new Sframe();
		Spanel panel = new Spanel();
		
		frame.add(panel);
		frame.setLocation(100,100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
	}
}
class Sframe extends javax.swing.JFrame {
	public Sframe() {
		setSize(800,600);
	}
}
class Spanel extends javax.swing.JPanel {
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		java.awt.Toolkit kit = Toolkit.getDefaultToolkit();
		try {
			img = kit.getImage("/home/aditya/Pictures/tile.png");
			ig = javax.imageio.ImageIO.read(new java.io.File("/home/aditya/Pictures/tile.png"));
		}
		catch(Exception e) {
			System.out.println(e.getClass().getName());
		}
		g.drawImage(img,0,0,null);
		
		int i,j=0;
		int w=img.getWidth(null),wp=ig.getWidth(null);
		int h = img.getHeight(null),hp=ig.getHeight(null);
		System.out.println(wp+" "+hp+" "+w+" "+h);
		for(i=0;i<wp;i+=w)
			for(j=0;j<hp;j+=h)
				if(i+j > 0) {
					g.copyArea(0,0,w,h,i,j);
					//System.out.println("r");
				}
		System.out.println(i/w+" "+(j/h));
	}
	private java.awt.Image img,ig;
}