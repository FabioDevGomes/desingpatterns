package command;


/*Receptor*/
public class Luz {
  
  private String localLuz;
  
  public Luz(String locaLuz) {
    this.setLocalLuz(locaLuz);
  }
  
  public void apagar(){
    System.out.println("Apagando luz");
  }

  public void ligar(){
    System.out.println("Ligando luz");
  }

  public String getLocalLuz() {
    return localLuz;
  }

  public void setLocalLuz(String localLuz) {
    this.localLuz = localLuz;
  }

}
