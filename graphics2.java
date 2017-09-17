//import java.io.*;
import java.awt.*;
import java.awt.event.*;
class Graphics2 extends Frame
{
	Graphics2()
	{
		this.addWindowListener(new WindowAdapter()
{
	
	public void windowClosing(WindowEvent e){System.exit(0); }
});
}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.drawRect(40,40,200,200);
		g.drawOval(110,95,5,5);
		g.drawOval(145,95,5,5);
		g.drawLine(130,95,130,115);
		g.drawArc(113,115,35,20,0,-180);
	}
	public static void main(String[] args) {
		Graphics2 g2=new  Graphics2();
		g2.setTitle("criminal");
		//this..setLayout(null);
		//this.setBackgound(Color.red);
		g2.setSize(720,720);
		g2.setVisible(true);

		//f.addWindowListener(new Myclass());
		
}
	
}
 
