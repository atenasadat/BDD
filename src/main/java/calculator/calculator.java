package calculator;

public class calculator {
    public String add(int a, String b) {
        switch (b) {
            case "sqr":
                if (a >= 0) {
                    return String.valueOf(Math.sqrt(a));
                }
                break;

            case "rvs":
                if (a != 0) {
                    return String.valueOf(1 / a);
                }
                break;
        }
        return "invalid input";
    }
}