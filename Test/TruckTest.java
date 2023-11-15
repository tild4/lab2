import org.junit.Test;
import static org.junit.Assert.*;

public class TruckTest {

    private Scania scania = new Scania();




    @Test
    public void scaniaIsPlatformUp() {
        scania.setCurrentSpeed(0);
        assertEquals(false, scania.getIsPlatformUp());
    }

    @Test
    public void scaniaGasWhenIsPlatformUp(){
        scania.setIsPlatformUp(true);
        double initialSpeed = scania.getCurrentSpeed();
        scania.gas(0.1);
        assertEquals(initialSpeed, scania.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void scaniaBrakeWhenIsPlatformUp(){
        scania.setCurrentSpeed(20);
        double initialSpeed = scania.getCurrentSpeed();
        scania.setIsPlatformUp(true);
        scania.brake(0.8);
        assertEquals(initialSpeed, scania.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void scaniaIsMoving(){


    }

    //public boolean isMoving() {
    //    return getCurrentSpeed() > 0;
  //  }
}
