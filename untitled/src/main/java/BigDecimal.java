import java.math.RoundingMode;

public class BigDecimal {

    // Método que redondea un java.math.BigDecimal a la centésima más cercana
    public static double roundToHundredth(java.math.BigDecimal number) {
        java.math.BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    // Método que invierte el signo y redondea a la décima más cercana
    public static java.math.BigDecimal reverseSignAndRoundToTenth(java.math.BigDecimal number) {
        java.math.BigDecimal reversed = number.negate();
        return reversed.setScale(1, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        java.math.BigDecimal number1 = new java.math.BigDecimal("4.2545");
        System.out.println("Rounded to hundredth: " + roundToHundredth(number1)); // 4.25

        java.math.BigDecimal number2 = new java.math.BigDecimal("1.2345");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(number2)); // -1.2

        java.math.BigDecimal number3 = new java.math.BigDecimal("-45.67");
        System.out.println("Reversed and rounded to tenth: " + reverseSignAndRoundToTenth(number3)); // 45.7
    }
}
