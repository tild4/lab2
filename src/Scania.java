import java.awt.*;

public class Scania extends Truck{

    private double angleLift;

    public Scania(){
        super(2, 500, Color.blue, "Scania", false);
        this.angleLift = angleLift;
    }

    public double getAngleLift(){
        return this.angleLift;
    }

    public void setAnglePlatform(double angle) {
        if (!isMoving() && angle > 0 && angle <= 70) {
            this.angleLift = angle;
            setIsLiftUp(true);

        }else if (angle == 0 && getCurrentSpeed() == 0){
            setIsLiftUp(false);

        }else
            this.angleLift = 0;

    }

    @Override
    public double speedFactor(){ //måste implementera denna
        return getEnginePower() * 0.01;
    } //TODO

    //Vinkeln på flaket kan inte vara lägre än 0 eller högre än 70.
    //Det är bara om lastbilen står stilla som flaket får ha en
    //annan vinkel än 0. Flaket ska inte kunna höjas om lastbilen är i rörelse;
    //och lastbilen ska inte kunna köra om flaket är uppfällt.

}
