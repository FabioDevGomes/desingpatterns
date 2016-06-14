package state;

public class MaqinaGomaDeMascar {

  private State estadoVendido;
  private State estadoSemGomas;
  private State estadoSemMoedas;
  private State estadoComMoedas;

  State estadoAtual = estadoSemGomas;
  private int count = 0;

  public MaqinaGomaDeMascar(int numeroDeGomas) {
    estadoVendido = new EstadoVendido(this);
    estadoSemGomas = new EstadoSemGomas(this);
    estadoSemMoedas = new EstadoSemMoeda(this);
    estadoComMoedas = new EstadoComMoeda(this);

    count = numeroDeGomas;

    if (numeroDeGomas > 0) {
      estadoAtual = estadoSemMoedas;
    }
  }

  void entregarGoma() {
    System.out.println("Um goma de mascar está saindo no compartimento!");
    if (count > 0) {
      count--;
    }
  }

  public void inserirMoeda() {
    estadoAtual.inserirMoeda();
  }

  public void acionarAlavanca() {
    estadoAtual.acionarAlavanca();
    estadoAtual.entregarGoma();
  }

  public void ejetarMoeda() {
    estadoAtual.ejetarMoeda();
  }

  public void recarregarGomas(int gomas) {
    count = count + gomas;
    estadoAtual = estadoSemMoedas;
  }

  public int getCount() {
    return count;
  }

  public State getEstadoAtual() {
    return estadoAtual;
  }

  public void setEstadoAtual(State estadoAtual) {
    this.estadoAtual = estadoAtual;
  }

  public State getEstadoVendido() {
    return estadoVendido;
  }

  public State getEstadoSemGomas() {
    return estadoSemGomas;
  }

  public State getEstadoSemMoedas() {
    return estadoSemMoedas;
  }

  public State getEstadoComMoedas() {
    return estadoComMoedas;
  }

  @Override
  public String toString() {
    System.out.println("\nA quantidade atual de gomas é: " + getCount());
    System.out.println("O estado atual da máquina é: " + getEstadoAtual());
    return super.toString();
  }

}
