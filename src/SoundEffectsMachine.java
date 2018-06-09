
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton("Sound1");
	JButton button2 = new JButton("Sound2");
	JButton button3 = new JButton("Sound3");

	public static void main(String[] args) {
		SoundEffectsMachine SEM = new SoundEffectsMachine();
		SEM.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1.equals(e.getSource())) {
			playSound("Sound1.wav");
		} else if (button2.equals(e.getSource())) {
			playSound("Sound2.wav");
		} else if (button3.equals(e.getSource())) {
			playSound("Sound3.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
