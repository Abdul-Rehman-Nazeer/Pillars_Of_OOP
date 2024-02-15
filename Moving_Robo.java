import java.util.Scanner;


public class Moving_Robo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter initial X coordinate: ");
        int x = s.nextInt();
        System.out.print("Enter initial Y coordinate: ");
        int y = s.nextInt();
        s.nextLine();
        System.out.print("Enter initial direction (N, S, E, W): ");
        String direction = s.nextLine().toUpperCase();

        Robot r  = new Robot(x, y, direction);
        r.displayPosition();

        System.out.print("Enter the number of steps to move: ");
        int steps = s.nextInt();


        MovingRobot m = new MovingRobot(x, y, direction);
        m.moveRobot(steps);
        m.displayUpdatedPosition();
    }
}


class Robot {
    int x;
    int y;
    String direction;

    public Robot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void displayPosition() {
        System.out.println("Robot's initial position: X = " + x + ", Y = " + y + ", Direction = " + direction);
    }
}

class MovingRobot extends Robot {
    public MovingRobot(int x, int y, String direction) {
        super(x, y, direction);
    }

    public void moveRobot(int steps) {
        if (direction.equals("N")) {
            y += steps;
        } else if (direction.equals("S")) {
            y -= steps;
        } else if (direction.equals("E")) {
            x += steps;
        } else if (direction.equals("W")) {
            x -= steps;
        }
    }

    public void displayUpdatedPosition() {
        System.out.println("Robot's updated position: X = " + x + ", Y = " + y + ", Direction = " + direction);
    }
}


