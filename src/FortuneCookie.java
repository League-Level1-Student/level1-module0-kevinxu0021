import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		System.out.println("Button clicked");
		frame.setVisible(true);
		JButton button = new JButton("PRESS TO GET A FORTUNE");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Believe in yourself.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "A trip is a good way to explore");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Play with your friends, you will feel bettter");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "If you want to take something, go take it.");
		} else if (rand == 4) {
			JOptionPane.showInternalMessageDialog(null, "Coding will make your life happier. ");
		}
		JOptionPane.showMessageDialog(null, "Woohoo!");
	}
}
