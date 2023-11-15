import java.awt.*;

public abstract class Truck extends Vehicle{

    private boolean isPlatformUp;

    public Truck(int nrDoors, double enginePower, Color color, String modelName, double loadingPlatform) { //Konstruktor
        super(nrDoors, enginePower, color, modelName);
        this.isPlatformUp = false;
    }

        @Override
        public void setCurrentSpeed(double currentSpeed){
            if (!this.isPlatformUp){
                super.setCurrentSpeed(currentSpeed);
            }
        }

        @Override
        public void gas(double amount) {
            if (!isPlatformUp && amount >= 0 && amount <= 1) {
                super.gas(amount);
            }
        }

        @Override
        public void brake(double amount) {
            if (!isPlatformUp && amount >= 0 && amount <= 1) {
                super.brake(amount);
            }
        }

        public boolean isMoving() {
            return getCurrentSpeed() > 0;
        }


    public boolean getIsPlatformUp() {
        return isPlatformUp;
    }

    public void setIsPlatformUp(boolean isPlatformUp) {
        this.isPlatformUp = isPlatformUp;
        //if (!isMoving()){
        //    this.isPlatformUp = isPlatformUp;
        //}
    }
}
