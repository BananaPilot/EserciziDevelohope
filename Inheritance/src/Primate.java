public class Primate extends Mammal {
  private boolean hasOpposableThumb;
  private String[] habitat;
  private boolean canSpeak;
  public Primate(boolean hasOpposableThumb, boolean canSpeak, String[] habitat){
    super(true, "Omnivore");
    this.hasOpposableThumb = hasOpposableThumb;
    this.habitat = habitat;
    this.canSpeak = canSpeak;
  }

  public boolean getHasOpposableThumb() {
    return hasOpposableThumb;
  }

  public String[] getHabitat() {
    return habitat;
  }

  public boolean getCanSpeak() {
    return canSpeak;
  }

  public void setHasOpposableThumb(boolean hasOpposableThumb) {
    this.hasOpposableThumb = hasOpposableThumb;
  }

  public void setHabitat(String[] habitat) {
    this.habitat = habitat;
  }

  public void setCanSpeak(boolean canSpeak) {
    this.canSpeak = canSpeak;
  }
}
