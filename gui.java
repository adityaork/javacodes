import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
		String[] fontnames = genv.getAvailableFontFamilyNames();
		for(String fn:fontnames)
			System.out.println(fn);
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
		panel.setBackground(new Color(100,200,100));
		
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
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(Color.cyan);
		g.drawString("I love every girl",50,100);
		java.awt.geom.Rectangle2D rect= new java.awt.geom.Rectangle2D.Double(70.0,70.0,100.0,130.0);
		g2.setPaint(Color.yellow);
		g2.fill(rect);
		System.out.println("Bold ="+java.awt.Font.BOLD +"Italic = "+java.awt.Font.ITALIC+" "+java.awt.Font.PLAIN);
		java.awt.Font fnt =  new java.awt.Font("Serif",3,22);
		g2.setFont(fnt);
		g2.setPaint(Color.RED);
		java.awt.font.FontRenderContext context = g2.getFontRenderContext();
		String msg = "I love every Girl";
		
		g2.drawString(msg,150, 200);
		java.awt.geom.Rectangle2D frect = fnt.getStringBounds(msg,context);
		java.awt.font.LineMetrics metrics = fnt.getLineMetrics(msg,context);
		g2.setPaint(Color.BLACK);
		g2.draw(new java.awt.geom.Rectangle2D.Double(150,200+frect.getY(),frect.getWidth(),frect.getHeight()));
	}
}