public class Main {
  public static void main(String[] args) {
    System.out.println(getOperationName('+'));
  }

  public static String getOperationName(char operator){
    String operatorName = "";
    switch (operator) {
      case '+':
        operatorName = "Sum";
        break;
      case '-':
        operatorName = "Subtraction";
        break;
      case '*':
        operatorName = "Multiplication";
        break;
      case '/':
        operatorName = "Division";
        break;
      default:
        operatorName = "Operator not reconised plase inser a valid operator";
        break;
    }
    return operatorName;
  }

}