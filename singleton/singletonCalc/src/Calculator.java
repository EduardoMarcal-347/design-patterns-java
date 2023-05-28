public class Calculator {

    private static Calculator instance;

    public static Calculator getInstance() {
        if (instance == null) instance = new Calculator();
        return instance;
    }

}
