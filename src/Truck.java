import java.awt.*;

public abstract class Truck extends Vehicle{

    private double loadingPlatform;

    public Truck(int nrDoors, double enginePower, Color color, String modelName, double loadingPlatform) { //Konstruktor
        super(nrDoors, enginePower, color, modelName);
        this.loadingPlatform = loadingPlatform;
    }

    public double getLoadingPlatform(){
        return loadingPlatform;
    }

    public void setLoadingPlatform(double angle){
        if (angle >= 0 && angle <= 70 && getCurrentSpeed() == 0){
            this.loadingPlatform = angle;
        }else if(getCurrentSpeed() != 0){
            //
        }
    }
}
