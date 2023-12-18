import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] numberList = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9, 10, 10};
    System.out.println(Arrays.toString(removeDuplicate(numberList)));
  }

  public static int[] removeDuplicate(int[] numberList){
    int[] newNumberList = new int[numberList.length - 1];
    boolean found = true;
    for(int i = 0, index = 0; i < numberList.length; i++){
      for (int j : newNumberList) {
        if (j == numberList[i]) {
          found = true;
          break;
        } else {
          found = false;
        }
      }
      if (!found) {
        newNumberList[index] = numberList[i];
        index++;
      }
    }

    return newNumberList;
  }
}