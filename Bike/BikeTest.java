package TDD.Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void powerOnTest(){
        Bike myBike = new Bike();
        myBike.ignition(false);
        boolean value = myBike.checkPower();
        assertEquals(false, myBike.checkPower());
        myBike.ignition(true);
        assertEquals(true,myBike.checkPower());
    }
    @Test
    public void powerOffTest(){
        Bike myBike = new Bike();
        myBike.ignition(true);
        boolean value = myBike.checkPower();
        assertEquals(true, value);
        myBike.ignition(false);
        assertEquals(false, myBike.checkPower());
    }
    @Test
    public void accelerationTest() {
        Bike myBike = new Bike();
        myBike.ignition(true);
        assertEquals(true, myBike.checkPower());
        //Gear 1
        myBike.speedGear(1);
        int number = myBike.checkGear();
        assertEquals(1, myBike.checkGear());
        myBike.accelerate(15);
        int speed = myBike.finalSpeed();
        assertEquals(16, myBike.finalSpeed());
        //Gear 2
        myBike.speedGear(2);
        assertEquals(2, myBike.checkGear());
        myBike.accelerate(24);
        assertEquals(26, myBike.finalSpeed());
        //Gear 3
        myBike.speedGear(3);
        assertEquals(3, myBike.checkGear());
        myBike.accelerate(35);
        assertEquals(38, myBike.finalSpeed());
        //Gear 4
        myBike.speedGear(4);
        assertEquals(4, myBike.checkGear());
        myBike.accelerate(44);
        assertEquals(48, myBike.finalSpeed());
    }
    @Test
    public void decelerationTest(){
        Bike myBike = new Bike();
        myBike.ignition(true);
        assertEquals(true, myBike.checkPower());
        //Gear 1
        myBike.speedGear(1);
        int number = myBike.checkGear();
        assertEquals(1, myBike.checkGear());
        myBike.deccelerate(15);
        int speed = myBike.finalSpeed();
        assertEquals(14, myBike.finalSpeed());
        //Gear 2
        myBike.speedGear(2);
        assertEquals(2, myBike.checkGear());
        myBike.deccelerate(24);
        assertEquals(22, myBike.finalSpeed());
        //Gear 3
        myBike.speedGear(3);
        assertEquals(3, myBike.checkGear());
        myBike.deccelerate(35);
        assertEquals(32, myBike.finalSpeed());
        //Gear 4
        myBike.speedGear(4);
        assertEquals(4, myBike.checkGear());
        myBike.deccelerate(44);
        assertEquals(40, myBike.finalSpeed());
    }
    @Test
    public void GearSpeedTest(){
        Bike myBike = new Bike();
        myBike.ignition(true);
        assertEquals(true, myBike.checkPower());
        //Gear 1
        myBike.accelerate(15);
        myBike.gearShift(1);
        int number = myBike.checkGear();
        assertEquals(1, myBike.checkGear());
        //Gear 2
        myBike.accelerate(21);
        myBike.gearShift(2);
        assertEquals(2, myBike.checkGear());
        //Gear 3
        myBike.accelerate(30);
        myBike.gearShift(3);
        assertEquals(3, myBike.checkGear());
        //Gear 4
        myBike.accelerate(50);
        myBike.gearShift(2);
        assertEquals(4, myBike.checkGear());
    }
}