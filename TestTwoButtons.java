import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
class TwoButtons extends JFrame implements ActionListener{
	// constructor
	JButton left,right;
	JLabel l;
	TwoButtons(String title){
		super (title);
		setLayout (new FlowLayout());
		setBounds (50,50, 100, 200);
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		l = new JLabel ("");
		add(l);
		left = new JButton("Left");
		add(left);
		right = new JButton("Right");
		add(right);
		// Who is going to listen when you click the button? 
		left.addActionListener( this );
		right.addActionListener( this );
	}
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource()==left) {
			getContentPane().setBackground( Color.white ); 
			right.setText("r");
		}
		else {
			getContentPane().setBackground( Color.blue ); 
			left.setText("l");
		}
	}
}
public class TestTwoButtons {
public static void main(String[] args) {
	TwoButtons tb = new TwoButtons("PickMe");
	tb.setVisible(true);
}
}