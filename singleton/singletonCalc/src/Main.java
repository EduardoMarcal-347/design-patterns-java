public class Main {
    public static void main(String[] args) {
        System.out.printf("Divisão: %.2f\n",Calculator.getInstance().divide(9D,3D));;
        System.out.printf("Multiplicação: %.2f\n",Calculator.getInstance().multiply(9D,3D));;
        System.out.printf("Soma: %.2f\n",Calculator.getInstance().sum(9D,3D));;
        System.out.printf("Subtração: %.2f\n",Calculator.getInstance().subtract(9D,3D));;
    }
}