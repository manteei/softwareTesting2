package system;

import mathfunctions.MathFunctions;

import java.text.DecimalFormat;

public class System {

    private final MathFunctions mathFunctions;

    public System(MathFunctions mathFunctions) {
        this.mathFunctions = mathFunctions;
    }

    public double system(double x) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##############");
        if (x <= 0) return Double.parseDouble(decimalFormat.format(trigonometricEq(x)).replace(",", "."));
        else return Double.parseDouble(decimalFormat.format(logarithmicEq(x)).replace(",", "."));
    }

    public double trigonometricEq(double x) {
        return  (((mathFunctions.sin(x) * mathFunctions.cos(x)) / mathFunctions.csc(x)) - ((mathFunctions.sec(x) - mathFunctions.cos(x)) - mathFunctions.tan(x)));
    }

    public double logarithmicEq(double x) {
        return Math.pow((((Math.pow(mathFunctions.log(x, 5) * mathFunctions.ln(x), 3)) * mathFunctions.log(x, 3)) + mathFunctions.log(x, 3)) , 2);
    }

}