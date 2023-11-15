import java.awt.*;
import java.util.ArrayList;

    public class CarTransporter extends Truck {

        private ArrayList<Car> loadedCars;

        public CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean isLiftUp) {
            super(nrDoors, enginePower, color, modelName, isLiftUp);
            this.loadedCars = new ArrayList<>();
        }

        public void lowerRamp() { //sänk rampen mot marken så att bil kan köra på
            if (!isMoving()) {
                setIsLiftUp(false);
            } else {
                setIsLiftUp(true); // om vi kör så måste rampen vara uppe
            }
        }

        private boolean isCarClose() { // är bilen i närheten
            // vi vill hitta något car x eller y
            //if car close enough - true
            // else false
        }


        public void getXPosCar() {
            // return Car.getXPos();

        }

        //om bilen är tillräckligt nära CarTransporter och rampen är ner så läggs den till i listan
        public void loadCar() {
            if (!getIsLiftUp() && isCarClose()) {//lista med bilar

                //double carX = getXPos() + 1;
                // när bilen är på transportern ska den ha samma position som transportern
            }
        }

        public void unloadCar() {
            if (!getIsLiftUp() &&) {//lista med bilar
                // hamnar rimligt nära rampen när den är avlastad

            }
        }

        //public double getYPos() {
        //        return yPos;
        //    }
        //
        //    public double getXPos() {
        //        return xPos;
        //    }

        @Override
        public double speedFactor() {
            return 0;
        }

    }



        //Biltransportens ramp har endast två lägen, uppe eller nere. - true/false KLAR

        //Rampen kan endast vara nere om biltransporten står stilla. KLAR

        //Bilar kan endast lastas om rampen är nere, och de befinner
        //sig rimligt nära biltransporten (gör ett eget antagande,
        //de exakta detaljerna är inte viktiga).

        //Bilar kan endast lossas om rampen är nere. De bör då hamna rimligt nära biltransporten.

        //Bilar kan endast lossas i omvänd ordning från hur de lastades,
        //dvs den sista bilen som lastades måste vara först att lossas (first-in-last-out).

        //Biltransporten ska inte kunna lasta på en annan biltransport.

        //Under det att en bil är lastad på biltransporten ska dess position i
        //världen alltid vara densamma som biltransportens position.

