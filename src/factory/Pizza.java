package factory;

public abstract class Pizza {
  
  IngredienteFacory ingredienteFacory;
  
  @SuppressWarnings("unused")
  private Pizza(){
  }
  
  public Pizza(IngredienteFacory ingredienteFacory){
    this.ingredienteFacory = ingredienteFacory;
  }
  
  private String queijo;
  private String massa;
  private String nome;
  
  public  static String SABOR_CALABRESA = "CALABRESA"; 
  public  static String SABOR_MILHO = "MILHO"; 
  
  public abstract void preparar();
  public abstract void cortar();
  public abstract void embalar();

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getQueijo() {
    return queijo;
  }

  public void setQueijo(String queijo) {
    this.queijo = queijo;
  }

  public String getMassa() {
    return massa;
  }

  public void setMassa(String massa) {
    this.massa = massa;
  }

}
