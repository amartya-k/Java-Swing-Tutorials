import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mainp implements ActionListener{
	JFrame jf;
	JButton btn;
	Mainp(){
		jf=new JFrame("Start Screen");
		jf.setSize(new Dimension(300,300));
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn=new JButton("Start");
		btn.addActionListener(this);
		jf.add(btn);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Start")){
			jf.setVisible(false);
			Main2 ob=new Main2();
			ob.jf.setVisible(true);
			jf.dispose();
		}
	}

	public static void main(String args[]){
		new Mainp();
	}

}

class Main2 implements ActionListener{
	JFrame jf;
	JButton btn;
	Main2(){
		jf=new JFrame("End Screen");
		jf.setSize(new Dimension(300,300));
		jf.setLayout(new FlowLayout());
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn=new JButton("Back");
		btn.addActionListener(this);
		jf.add(btn);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getActionCommand().equals("Back")){
			jf.setVisible(false);
			Mainp ob=new Mainp();
			ob.jf.setVisible(true);
			jf.dispose();
		}
	}
}












