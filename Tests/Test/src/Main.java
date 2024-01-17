public class Main {
  public static void main(String[] args){
    String[] arr = new String[1];
    arr[0] = "Ciao";
    arr = add(arr, "Hello");
    for (String s: arr){
      System.out.println(s);
    }
    arr = add(arr, "Hello");
    for (String s: arr){
      System.out.println(s);
    }
    arr = add(arr, "Hello");
    for (String s: arr){
      System.out.println(s);
    }
    arr = add(arr, "Hello");
    for (String s: arr){
      System.out.println(s);
    }
  }

  public static String[] add(String[] arr, String element) {
    String[] newArr = new String[arr.length + 1];
    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    newArr[arr.length] = element;
    return newArr;
  }
}
