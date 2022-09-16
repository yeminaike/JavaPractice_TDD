package TDD.Airconditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirconditionerTest {
    @Test
    public void powerOn(){
        Airconditioner newAC = new Airconditioner();
        newAC.setPower(false);
        boolean value = newAC.checkPower();
        assertEquals(false, newAC.checkPower());
        newAC.setPower(true);
        assertEquals(true, newAC.checkPower());
    }
    @Test
    public void powerOff(){
        Airconditioner newAC = new Airconditioner();
        newAC.setPower(true);
        assertEquals(true, newAC.checkPower());
        newAC.setPower(false);
        assertEquals(false, newAC.checkPower());
    }
    @Test
    public void increaseTemperature(){
        Airconditioner newAC = new Airconditioner();
        newAC.setPower(true);
        assertEquals(true, newAC.checkPower());
        newAC.setTemperature(16);
        int degree = newAC.checkTemperature();
        assertEquals(16, newAC.checkTemperature());
        newAC.increaseTemperature(17);
        assertEquals(17, newAC.checkTemperature());
    }
    @Test
    public void decreseTemperature(){
        Airconditioner newAC = new Airconditioner();
        newAC.setPower(true);
        assertEquals(true, newAC.checkPower());
        newAC.setTemperature(28);
        assertEquals(28, newAC.checkTemperature());
        newAC.decreaseTemperature(27);
        assertEquals(27, newAC.checkTemperature());
    }
    @Test
    public void temperatureRange(){
        //Temperature cannot go below 16 degrees
        Airconditioner newAC = new Airconditioner();
        newAC.setPower(true);
        assertEquals(true, newAC.checkPower());
        newAC.setTemperature(16);
        newAC.decreaseTemperature(15);
        assertEquals(16, newAC.checkTemperature());
        //Temperature cannot go above 30 degree
        newAC.setTemperature(30);
        newAC.increaseTemperature(31);
        assertEquals(30, newAC.checkTemperature());
    }

}
