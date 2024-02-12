import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
  public static void main(String[] args) {
    Generici<?> integergenerici = new Generici<>(new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
    System.out.println(integergenerici);
  }
}
