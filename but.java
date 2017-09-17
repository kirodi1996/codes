import java.awt.*;
import java.awt.event.*;
class but extends Frame
{
	but()
	{
		Button b=new Button("ok");
		add(b);
		b.addActionListener(new Myclass());
	}
	public static void main(String args[])
	{
		But obj=new But();
		obj.setSize(400,300);
		obj.setVisible(true);
	}
}
class Myclass implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
		System.exit(0);
	}
}