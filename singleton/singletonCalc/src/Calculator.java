public class Calculator {

    private static Calculator instance;

    private Calculator() {
    }

    public static Calculator getInstance() {
        if (instance == null) instance = new Calculator();
        return instance;
    }

    public Double sum(Double x, Double y){
        return x + y;
    }
    public Double subtract(Double x, Double y){
        return x - y;
    }
    public Double multiply(Double x, Double y){
        return x * y;
    }
    public Double divide(Double x, Double y){
        return x / y;
    }

}
