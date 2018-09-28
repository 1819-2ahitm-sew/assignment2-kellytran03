import at.htl.robot.model.Robot;

public class Main {

    public static void main(String[] args) {

       Robot robot = new Robot();

       robot.rotateLeft();
       robot.stepForward();

        System.out.println("x = "+ robot.getX());
        System.out.println("y = "+ robot.getY());
        System.out.println("direction = "+ robot.getDirection());


    }

}
