import java.awt.*;
import java.awt.event.*;
public class ButtonExample {
	public static void main (String args[])
	{
		Frame f = new Frame("Button Example");
		Button b = new Button("Cl;ick Here");
		b.setBounds(50,100,80,30);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
}