public class Main {

  public static void main(String[] args) {
    int[][] matrix = { {1, 2, 3}, {4, 5, 6} };

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }

    int[][] newMatrix = new int[matrix[0].length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        newMatrix[j][i] = matrix[i][j];
      }
    }

    for (int i = 0; i < newMatrix.length; i++) {
      for (int j = 0; j < newMatrix[i].length; j++) {
        System.out.print(newMatrix[i][j]);
      }
      System.out.println();
    }
  }
}