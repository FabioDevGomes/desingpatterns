package observer;


public interface Sujeito {

  public void registrarObservador(Observer observer);
  public void removerObservador(Observer observer);
  public void notificarObservadores();
}
