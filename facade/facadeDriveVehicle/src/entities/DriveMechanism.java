package entities;

public class DriveMechanism {

    GearControl gear = new GearControl();
    HeadlightControl lights = new HeadlightControl();
    ThrottleControl acceleration = new ThrottleControl();

    public DriveMechanism(GearControl gear, HeadlightControl lights, ThrottleControl acceleration) {
        this.gear = gear;
        this.lights = lights;
        this.acceleration = acceleration;
    }

    public void speedUp(){
        acceleration.speedUp();
    }

    public void brake(){
        acceleration.brake();
    }
    
    public void shiftUp(){
        gear.shiftUp();
    }

    public void shiftDown(){
        gear.shiftDown();
    }

    public void turnLightsOn(){
        lights.turnLightsOn();
    }

    public void turnLightsOff(){
        lights.turnLightsOff();
    }

}
