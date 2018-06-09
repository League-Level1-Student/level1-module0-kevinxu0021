import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness_TV implements ActionListener {
	JButton video1 = new JButton("Click to Watch\"The Duck Song\".");
	JButton video2 = new JButton("Click to Watch\"World's Cuttest Frog\".");
	JButton video3 = new JButton("Click to Watch\"Fluffy Unicorns\".");

	public static void main(String[] args) {
		Cuteness_TV CTV = new Cuteness_TV();
		CTV.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(video1);
		panel.add(video2);
		panel.add(video3);
		frame.pack();
		video1.addActionListener(this);
		video2.addActionListener(this);
		video3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (video1.equals(e.getSource())) {
			showDucks();
		} else if (video2.equals(e.getSource())) {
			showFrog();
		} else if (video3.equals(e.getSource())) {
			showFluffyUnicorns();
		}
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
