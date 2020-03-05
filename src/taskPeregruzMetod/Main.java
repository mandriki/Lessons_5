package taskPeregruzMetod;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Peregruz peregruz = new Peregruz();
        peregruz.intRealPeregruz();
        peregruz.intRealPeregruz(5);
        peregruz.intRealPeregruz(85, 0.55);
        peregruz.intRealPeregruz(0.9, 1);
        System.out.println("Произведение чисел " +peregruz.intRealPeregruz(1.9,6)); /** дубл и инта*/
        System.out.println("Суммна чисел " + peregruz.intRealPeregruz(1.9,6.3)); /** два дубла*/
        System.out.println("Произведение чисел " +peregruz.intRealPeregruz(0,0)); /** два инта*/
        peregruz.intRealPeregruz("11", "33"); /**BigDecimal арифметика*/
    }
}
