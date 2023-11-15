import java.awt.*;

public abstract class Vehicle implements Movable{

        private Position position;
        private int nrDoors; // Number of doors on the car
        private double enginePower; // Engine power of the car
        private double currentSpeed; // The current speed of the car
        private Color color; // Color of the car
        private String modelName; // The car model name

        public Vehicle(int nrDoors, double enginePower, Color color, String modelName){
            this.nrDoors = nrDoors;
            this.enginePower = enginePower;
            this.color = color;
            this.modelName = modelName;
            this.position = new Position(0, 0, "NORTH");
            stopEngine();
        }

        public int getNrDoors() {
            return nrDoors;
        }

        public String getDirection() {
            return position.getDirection();
            //return direction;
        }

        public double getYPos() {
            return position.getYPos();
            //return yPos;
        }

        public double getXPos() {
            return position.getXPos();
            //return xPos;
        }

        public double getEnginePower() {
            return enginePower;
        }

        public double getCurrentSpeed() {
            return currentSpeed;
        }

        public void setCurrentSpeed(double currentSpeed) {
            if(currentSpeed >= 0 && currentSpeed <= this.enginePower){
                this.currentSpeed = currentSpeed;
            }
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color clr) {
            color = clr;
        }

        public void startEngine() {
            currentSpeed = 0.1;
        }

        public void stopEngine() {
            currentSpeed = 0;
        }

        public abstract double speedFactor(); //metoden finns men den är inte implementerad

        public void incrementSpeed(double amount){
            setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);
        }

        public void decrementSpeed(double amount){
            setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);
        }

    public void move() {
        switch (position.getDirection()) {
            case "NORTH" -> position.setYPos(getCurrentSpeed() + position.getYPos());
            case "EAST" -> position.setXPos(getCurrentSpeed() + position.getXPos());
            case "SOUTH" -> position.setYPos(position.getYPos()- getCurrentSpeed());
            case "WEST" -> position.setXPos(position.getXPos() - getCurrentSpeed());
        }
    }

    public void turnLeft() {
        switch (position.getDirection()) {
            case "NORTH" -> position.setDirection("WEST");
            case "EAST" -> position.setDirection("NORTH");
            case "SOUTH" -> position.setDirection("EAST");
            case "WEST" -> position.setDirection("SOUTH");
        }
    }

    public void turnRight() {
        switch (position.getDirection()) {
            case "WEST" -> position.setDirection("NORTH");
            case "NORTH" -> position.setDirection("EAST");
            case "EAST" -> position.setDirection("SOUTH");
            case "SOUTH" -> position.setDirection("WEST");
        }
    }

        public void gas(double amount) {
            if (amount >= 0 && amount <= 1) {
                incrementSpeed(amount);
            }

        }

        public void brake(double amount) {
            if (amount >= 0 && amount <= 1) {
                decrementSpeed(amount);
            }
        }


    }
