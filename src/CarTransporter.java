import java.awt.*;

public class CarTransporter extends Truck{

    private boolean isRampDown;

    public CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean isPlatformUp) {
        super(nrDoors, enginePower, color, modelName, isPlatformUp);
        this.isRampDown = false;
    }

    @Override
    public double speedFactor() {
        return 0;
    }

    //Biltransportens ramp har endast två lägen, uppe eller nere.

    //Rampen kan endast vara nere om biltransporten står stilla.

    //Bilar kan endast lastas om rampen är nere, och de befinner
    //sig rimligt nära biltransporten (gör ett eget antagande,
    //de exakta detaljerna är inte viktiga).

    //Bilar kan endast lossas om rampen är nere. De bör då hamna rimligt nära biltransporten.

    //Bilar kan endast lossas i omvänd ordning från hur de lastades,
    //dvs den sista bilen som lastades måste vara först att lossas (first-in-last-out).

    //Biltransporten ska inte kunna lasta på en annan biltransport.

    //Under det att en bil är lastad på biltransporten ska dess position i
    //världen alltid vara densamma som biltransportens position.

}
