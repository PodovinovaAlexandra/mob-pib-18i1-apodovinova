public class Calculator {
    static double calc(double x, double y, char operation) {
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
            default:
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        try {
            double x = Double.parseDouble(args[0]);
            char operation = args[1].charAt(0);
            double y = Double.parseDouble(args[2]);
            if (operation == '/' && y == 0) {
                System.out.println("Division by zero");
                return;
            }
            System.out.println(calc(x, y, operation));
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number format");
        }
    }
}

