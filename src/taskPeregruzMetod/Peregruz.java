package taskPeregruzMetod;

import java.math.BigDecimal;

/**
        * Задать перегруженные методы возвращающие результат арифметических
        операций над заданными полями и полями типа BigDecimal */

    public class Peregruz {/**Определить класс */
        int intNum, augend;
        double realNum; /**целые или вещественные числа*/
        String i, j;

        public Peregruz() {
            this.intNum = 9;
            this.realNum = 9.000080;
        }
        public void intRealPeregruz() {}
        public void intRealPeregruz (int intNum) {
             System.out.println("Число целое " + intNum);
        }
        public void intRealPeregruz (int intNum, double realNum) {
               System.out.println("Число целое " + intNum + " Число вещественное " + realNum);
        }
        public void intRealPeregruz (String  intNum) {
                System.out.println("Число целое " + intNum);
        }
        public int intRealPeregruz ( double realNum, int intNum) {
            System.out.println("Число целое " + intNum + " Число вещественное " + realNum);
            return (int)(intNum*realNum);
        }
        public double intRealPeregruz ( double intNum, double realNum) {
            System.out.println("Вещественное число " + intNum + " Число вещественное " + realNum);
            return intNum+realNum;
        }
        public double intRealPeregruz ( int intNum1, int realNum1) {
            System.out.println("Число целое " + intNum + " Вещественное целое " + realNum);
            return (double) (intNum * realNum);
        }
    public void intRealPeregruz ( String i, String j) {
        BigDecimal x = new BigDecimal(i);
        BigDecimal y = new BigDecimal(j);
        BigDecimal summa = x.add(y);
        BigDecimal subtract = x.subtract(y);
        BigDecimal multiply = x.multiply(y);
        BigDecimal divide = x.divide(y,3,0);
        System.out.println("Cумма двух чисел BigDecimal i+j = "+ summa);
        System.out.println("Разница двух чисел BigDecimal i-j = "+ subtract);
        System.out.println("Произведение двух чисел BigDecimal i*j = "+ multiply);
        System.out.println("Разница двух чисел BigDecimal i/j = "+ divide);
    }

    /**Параметры:
     subtrahend- значение, которое будет вычтено из этого BigDecimal.
     Возвращает:
     this - subtrahend*/
   // public BigDecimal subtract( BigDecimal subtrahend)

    /** Параметры:
     multiplicand- значение, которое будет умножено на это BigDecimal.
     Возвращает:
     this * multiplicand*/
  //  public BigDecimal multiply( BigDecimal multiplicand)

    /**Параметры:
     divisor- значение, на которое это BigDecimal должно быть разделено.
     scale- масштаб BigDecimal отношения, которое будет возвращено.
     roundingMode - режим округления, чтобы применить.
     Возвращает:
     this / divisor*/
    //public BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
    }



