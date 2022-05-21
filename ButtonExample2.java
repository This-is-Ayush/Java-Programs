import java.awt.*;
import java.awt.event.*;
public class ButtonExample2{
	Frame fobj;
	Button button1, button2, button3;

	ButtonExample2(){
		fobj = new Frame ("Frame to Display Buttons");
		button1 = new Button();
		button2 = new Button("click here");
		button3 = new Button();
		button3.setLabel("button 3");
		fobj.add(button1);
		fobj.add(button2);
		fobj.add(button3);
		fobj.setLayout(new FlowLayout());
		fobj.setSize(300,400);
		fobj.setVisible(true);
		fobj.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String args[])
	{
		new ButtonExample2();
	}
}