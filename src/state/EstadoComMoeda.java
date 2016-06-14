package state;

import java.util.Random;

public class EstadoComMoeda implements State{

  Random random = new Random(System.currentTimeMillis());
  MaqinaGomaDeMascar maquina;
  
  public EstadoComMoeda(MaqinaGomaDeMascar maquina) {
    this.maquina = maquina;
  }
  
  @Override
  public void inserirMoeda() {
    System.out.println("Voc� n�o pode inserir outra moeda, ela ser� ejetada!");
  }

  @Override
  public void acionarAlavanca() {
    System.out.println("Voc� acionou a alavanca...");
    int winner = random.nextInt(5);
    if(winner == 0 && (maquina.getCount() > 1)){
      maquina.setEstadoAtual(maquina.getEstadoWinner());
    }else{
      maquina.setEstadoAtual(maquina.getEstadoVendido());
    }
  }

  @Override
  public void ejetarMoeda() {
    System.out.println("Voc� ejetou a moeda");
    maquina.setEstadoAtual(maquina.getEstadoSemMoedas());
  }

  @Override
  public void entregarGoma() {
    System.out.println("A��o inadequada");
    // TODO Auto-generated method stub
    
  }

}
