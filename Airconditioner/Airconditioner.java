package TDD.Airconditioner;

public class Airconditioner {
    private boolean power;
    private int temperature;
    public void setPower(boolean value) {
        if (value == true) {
            power = true;
        }
        else {
            power = false;
        }
    }
    public void setTemperature(int degree) {
        temperature = degree;
    }
    public void increaseTemperature(int degree) {
        if (degree < 30) {
            temperature += 1;
        }
    }
    public void decreaseTemperature(int degree) {
        if (degree > 16) {
            temperature -= 1;
        }
    }
    public boolean checkPower() {
        return power;
    }
    public int checkTemperature() {
        return temperature;
    }
}
