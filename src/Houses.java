
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot robot = new Robot();

	public static void main(String[] args) {

		robot.setX(0);
		robot.setY(550);
		robot.setSpeed(10);
		for (int i = 0; i < 9; i++) {
			drawHouses();	
		}
		

	}

	public static void drawHouses() {
		Random a = new Random();
		int rand1 = a.nextInt(3);
		int rand2 = a.nextInt(2);
		robot.penDown();
		robot.setRandomPenColor();
		if (rand1 == 0) {
			robot.move(60);
		} else if (rand1 == 1) {
			robot.move(120);
		} else if (rand1 == 2) {
			robot.move(250);
			rand2 = 0;
		}
		if (rand2 == 0) {
			flatRoof();
		} else if (rand2 == 1) {
			pointyRoof();
		}
		if (rand1 == 0) {
			robot.move(60);
		} else if (rand1 == 1) {
			robot.move(120);
		} else if (rand1 == 2) {
			robot.move(250);
		}
		robot.turn(270);
		robot.setPenColor(0, 255, 0);
		robot.move(50);
		robot.turn(270);
	}

	public static void flatRoof() {
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
	}

	public static void pointyRoof() {
		robot.turn(45);
		robot.move(25);
		robot.turn(90);
		robot.move(25);
		robot.turn(45);
	}
}
