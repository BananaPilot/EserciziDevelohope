import java.util.ArrayList;

public class Generici <T> {
  private ArrayList<T> cosa;

  public Generici(ArrayList<T> cose){
    this.cosa = cose;
  }

  public ArrayList<T> getCosa() {
    return cosa;
  }

  public void setCosa(ArrayList<T> cosa) {
    this.cosa = cosa;
  }

  public T printT(ArrayList<T> cose, T elemento){
    for (T o: cose){
      if (elemento.equals(o)){
        return o;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    return "Generici{" +
            "cosa=" + cosa +
            '}';
  }
}