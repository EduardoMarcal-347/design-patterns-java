public class ThrottleControl {

    private Double speed;

    public ThrottleControl() {
        this.speed = 0D;
    }

    public Double getSpeed() {
        return speed;
    }

    public void speedUp(){
        speed+=10;
        System.out.printf("Velocidade Atual: %2.f Km/h", speed);
    }
    public void brake(){
        if (speed>5) speed-=5;
        else speed-=speed;
        System.out.printf("Velocidade Atual: %2.f Km/h", speed);
    }
}
