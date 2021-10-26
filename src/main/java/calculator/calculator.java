package calculator;

public class calculator {
    public String add(String a, String b) {
        int operand = Integer.parseInt(a);
        switch (b) {
            case "sqr":
                if (operand >= 0) {
                    return String.valueOf(Math.sqrt(operand));
                }
                break;

            case "rvs":
                if (operand != 0) {
                    return String.valueOf(1 / operand);
                }
                break;
        }
        return "invalid input";
    }
}