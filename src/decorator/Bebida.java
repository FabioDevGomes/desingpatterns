package decorator;


public abstract class Bebida {

  private String descricao = "alguma descri��o";

  public String getDescricao() {
    return descricao;
  }
  
  public abstract double valor();

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  
}
