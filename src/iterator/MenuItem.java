package iterator;


public class MenuItem {

  private String nome;
  private String descricao;
  private boolean vagetariano;
  private double valor;
  
  public MenuItem(String nome, String descricao, boolean vagetariano, double valor) {
    super();
    this.nome = nome;
    this.descricao = descricao;
    this.vagetariano = vagetariano;
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

  public boolean isVagetariano() {
    return vagetariano;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getNome() {
    return nome;
  }
  
}
