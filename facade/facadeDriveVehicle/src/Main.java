import entities.DriveMechanism;

public class Main {
    public static void main(String[] args) {
        DriveMechanism carro = new DriveMechanism();

        //simulando um carro
        carro.turnLightsOn();
        carro.shiftUp();
        carro.speedUp();
        carro.speedUp();
        carro.shiftUp();
        carro.speedUp();
        carro.speedUp();
        carro.brake();
        carro.brake();
        carro.shiftDown();

    }
}