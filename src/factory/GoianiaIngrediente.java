package factory;


public class GoianiaIngrediente extends IngredienteFacory{

  @Override
  public String createQueijo() {
    return "Queijo de Goi�nia";
  }

  @Override
  public String creatMassa() {
    return "Massa de Goi�nia";
  }

}
