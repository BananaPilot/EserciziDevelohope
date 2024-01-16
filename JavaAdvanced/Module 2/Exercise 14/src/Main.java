import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("MO", "Modena");
    System.out.println(map);

    Map<String, String> map1 = Map.of("BO", "Bologna", "PA", "Parma");
    System.out.println(map1);

    Map<String, String> map2 = Map.ofEntries(
            new AbstractMap.SimpleEntry<>("RE", "Reggio"),
            new AbstractMap.SimpleEntry<>("FE", "Ferrara")
    );
    System.out.println(map2);
  }
}