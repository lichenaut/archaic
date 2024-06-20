package p9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class girstGUI implements ActionListener {
	JButton button;

	public static void main(String[] args) {
			girstGUI gui = new girstGUI();
			gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("Click me!!!");
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		button.setText("Clicked!");
	}
}
