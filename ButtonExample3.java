import java.awt.*;
import java.awt.event.*;
public class ButtonExample3 {
	public static void main (String args[]){

	Frame f = new Frame("Button Example");
	TextField tf = new TextField();
	tf.setBounds(50,50,150,20);
	Button b = new Button("Click Me");
	b.setBounds(50,100,60,30);
	b.addActionListener(new ActionListener(){
		public void actionPerformed (ActionEvent e){
			tf.setText("Hello Java");
		}
	});
	f.add(b);
	f.add(tf);
	f.setSize(400,400);
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