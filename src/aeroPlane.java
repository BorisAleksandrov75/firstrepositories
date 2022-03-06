public class aeroPlane {

    int x,y,z;
    int fuel;
    int dir;


    public aeroPlane(int x, int y, int z, int fuel) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.fuel = fuel;
    }

    public void flyStraight (int i) {
        if (i > fuel) i = fuel;
        else if (fuel == 0) i = 0;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        fuel -= i;
        System.out.println("Вы пролетели прямо и сейчас находитесь на координатах: x = " + x + ", y = " + y + ", z = " + z + " Топлива осталось = " + fuel );

    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void flyUp (int i, int j) {
        if (i > fuel) i = fuel;
        else if (fuel == 0) i = 0;
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
        z += j;
        fuel -= i;
        System.out.println("Вы набрали высоту и сейчас находитесь на координатах: x = " + x + ", y = " + y + ", z = " + z + " Топлива осталось = " + fuel );
    }

    public void flyDown (int i, int j) {
        flyUp(i, -j);
        System.out.println("Вы снизились и сейчас находитесь на координатах: x = " + x + ", y = " + y + ", z = " + z + " Топлива осталось = " + fuel );
        if (z == 0) {
            System.out.println("Вы приземлились!");
        }
    }

    public void cameraFoto (int i) {

    }

    public void fillFuel () {
        if (z != 0) {
            System.out.println("Невозможно заправиться в воздухе");
        }

        fuel += 1000;
    }




}
