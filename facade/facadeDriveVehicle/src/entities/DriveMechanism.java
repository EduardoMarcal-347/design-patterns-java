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
}
