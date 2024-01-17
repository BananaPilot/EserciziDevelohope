import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws Exception {
    BigDecimal a = new BigDecimal(0);
    BigDecimal b = new BigDecimal(2000000000);
    try {
      System.out.println(getResult(a, b, Operation.DIV));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public enum Operation {
    SUM,
    SUB,
    MUL,
    DIV,
    MIN,
    MAX;
  }

  public static BigDecimal getResult(BigDecimal a, BigDecimal b, Operation operation) throws Exception {
    if (checkBInt(a, b) && operation.equals(Operation.DIV)){ //suboptimal but still fine
      throw new ArithmeticException("Can't devide by zero");
    } else {
      return switch (operation) {
        case SUM -> a.add(b);
        case SUB -> a.subtract(b);
        case MUL -> a.multiply(b);
        case MAX -> a.max(b);
        case MIN -> a.min(b);
        case DIV -> a.divide(b);
        default -> throw new RuntimeException("Please insert a valid operation");
      };
    }
  }

  public static boolean checkBInt(BigDecimal a, BigDecimal b) {
    return a.equals(BigDecimal.ZERO) || b.equals(BigDecimal.ZERO); //suboptimal
  }

}
