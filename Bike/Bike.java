package TDD.Bike;

public class Bike {
    private boolean power;
    private int acceleration;
    private int gear;
    public void ignition(boolean value) {
        if(value == true){
            power = true;
        }
        else {
            power = false;
        }
    }
    public void speedGear(int value) {
        if (value > 0) {
            gear = value;
        }
    }
    public void accelerate(int speed) {
        if (gear == 1) {
            acceleration = ++speed;
        }
        else if (gear == 2) {
            acceleration = (speed + 2);
        }
        else if (gear == 3) {
            acceleration = (speed + 3);
        }
        else if (gear == 4) {
            acceleration = (speed + 4);
        }
    }
    public void deccelerate(int speed) {
        if (gear == 1) {
            acceleration = --speed;
        }
        else if (gear == 2) {
            acceleration = (speed - 2);
        }
        else if (gear == 3) {
            acceleration = (speed - 3);
        }
        else if (gear == 4) {
            acceleration = (speed - 4);
        }
    }
    public void gearShift(int number) {
        if (acceleration <= 20) {
            number = 1;
        }
        else if (acceleration <= 30) {
            number = 2;
        }
        else if (acceleration <= 40) {
            number = 3;
        }
        else if (acceleration > 40) {
            number = 4;
        }
            gear = number;
    }
    public boolean checkPower() {
        return power;
    }
    public int finalSpeed() {
        return acceleration;
    }
    public int checkGear() {
        return gear;
    }

}

