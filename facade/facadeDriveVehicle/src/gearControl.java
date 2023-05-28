public class gearControl {

    private int gear;

    public gearControl() {
        this.gear = 0;
    }

    public void shiftUp(){
        gear+=1;
        System.out.println("Trocou para a "+gear+"° marcha");
    }

    public void shiftDown(){
        if (gear>0){
            gear-=1;
            System.out.println("Trocou para a "+gear+"° marcha");

        } else System.out.println("O veiculo já se encontra no neutro");
    }

}
