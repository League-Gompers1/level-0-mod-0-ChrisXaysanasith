import org.jointheleague.graphical.robot.Robot;

public class Chris {
public static void main(String[] args) {

	Robot CX = new Robot("mini");
CX.penDown();
	CX.move(100);
	CX.move(-100);
	CX.turn(90);
	CX.move(100);
	CX.setSpeed(500);
CX.penUp();
CX.move(20);
CX.penDown();
}
}
