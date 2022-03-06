public class Tank {

    private int x, y;
    private int fuel;
    int dir;
    private static int tankNumber;
    private static String modelTank = "T - 34";
    private int n;

    public Tank(int x, int y, int fuel) {
        this.x = 0;
        this.y = 0;
        this.fuel = fuel;
        n = ++tankNumber;
    }


    public void goForward(int i) {
        if (i > fuel) i = fuel;
        else if (fuel == 0) i = 0;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;


    }

    public void printPosition() {
        System.out.println("The Tank " + modelTank + " - " + n + " is at " + x +", " + y + " now.");
        System.out.println("The Tank " + modelTank + " - " + n + " is at " + x +", " + y + " now.");
        System.out.println("The Tank " + modelTank + " - " + n + " is at " + x +", " + y + " now.");

    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}
