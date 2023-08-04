public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;
    
    public CalculatorController (CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation (String operation, Double num1, Double num2) {
        switch (operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            case "-":
                model.subtact(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция! ");
                break;
        }
        view.displayResult(model.getResult());
    }
}
