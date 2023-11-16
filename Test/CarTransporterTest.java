import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class CarTransporterTest {

    private CarTransporter carTransporter = new CarTransporter();
    private Saab95 carToLoad = new Saab95();

    @Test
    public void testLowerRampWhenNotMoving(){
        carTransporter.lowerRamp();
        assertFalse(carTransporter.getIsLiftUp());
    }

    @Test
    public void lowerRampWhenMoving(){
        carTransporter.setCurrentSpeed(20);
        carTransporter.lowerRamp();
        assertTrue(carTransporter.getIsLiftUp());
    }

    @Test
    public void loadCarOnCarTransporter(){

        carTransporter.lowerRamp();
        assertFalse(carTransporter.getIsLiftUp());
        assertFalse(carTransporter.isMoving());

        carTransporter.loadCar(carToLoad);
        assertTrue(carTransporter.getLoadedCars().contains(carToLoad));
        //isCarTheRightSize
    }

    @Test
    public void unloadCarOnCarTransporter(){

    }


    //isCarClose
    //loadCar
    //unloadCar
}
