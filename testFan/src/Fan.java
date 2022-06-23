

public class Fan {
    private int speed = 0;
    private int direction = 0;

    //getters and setters
    public int getSpeed() { 
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    //methods for pulling the two fan controls
    public String pull1() {
        String fanSpeed;
        if (speed == 0) {
            speed = 1;
            fanSpeed = "Fan speed set to LOW.";
        }
        if (speed == 1){
            speed = 2;
            fanSpeed = "Fan speed set to MEDIUM.";
        }
        if (speed == 2){
            speed = 3;
            fanSpeed = "Fan speed set to HIGH.";
        }
        else {
            speed = 0;
            fanSpeed = "Fan is OFF.";
        }
        return fanSpeed;
    }

    public String pull2() {
        String fanDirection;
        if (direction == 0) {
            direction = 1;
            fanDirection = "Fan direction is reversed.";
        }
        else {
            direction = 0;
            fanDirection = "Fan direction reset to normal direction.";
        }
        return fanDirection;
    }
}
