
package at.htl.robot.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @BeforeAll
    static void setup() {

    }

    @Test
    void createRobot() {
        Robot robot = new Robot();
        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(0));
        assertThat(robot.getDirection(), is(Direction.SOUTH));
    }

    @Test
    void stepSouth() {
        Robot robot = new Robot();

        robot.stepForward();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(1));
        assertThat(robot.getDirection(), is(Direction.SOUTH));
    }

    @Test
    void rotateOneTime() {
        Robot robot = new Robot();

        robot.rotateLeft();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(0));
        assertThat(robot.getDirection(), is(Direction.EAST));
    }

    @Test
    void rotateTwoTimes() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.rotateLeft();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(0));
        assertThat(robot.getDirection(), is(Direction.NORTH));
    }

    @Test
    void rotateThreeTimes() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.rotateLeft();
        robot.rotateLeft();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(0));
        assertThat(robot.getDirection(), is(Direction.WEST));
    }

    @Test
    void rotateFourTimes() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.rotateLeft();
        robot.rotateLeft();
        robot.rotateLeft();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(0));
        assertThat(robot.getDirection(), is(Direction.SOUTH));
    }
    @Test
    void stepNorth() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.rotateLeft();
        robot.stepForward();

        assertThat(robot.getX(), is(0));
        assertThat(robot.getY(), is(-1));
        assertThat(robot.getDirection(), is(Direction.NORTH));
    }

    @Test
    void stepEast() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.stepForward();

        assertThat("Falscher X-Wert", robot.getX(), is(1));
        assertThat("Falscher y-Wert", robot.getY(), is(0));
        assertThat("Falsche Richtung", robot.getDirection(), is(Direction.EAST));
    }

    @Test
    void stepWest() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.rotateLeft();
        robot.rotateLeft();
        robot.stepForward();

        assertThat("Falscher X-Wert", robot.getX(), is(-1));
        assertThat("Falscher y-Wert", robot.getY(), is(0));
        assertThat("Falsche Richtung", robot.getDirection(), is(Direction.WEST));
    }

    @Test
    void stepTwoTimesEast() {
        Robot robot = new Robot();

        robot.rotateLeft();
        robot.stepForward();
        robot.stepForward();

        assertThat("Falscher X-Wert", robot.getX(), is(2));
        assertThat("Falscher y-Wert", robot.getY(), is(0));
        assertThat("Falsche Richtung", robot.getDirection(), is(Direction.EAST));
    }

}
