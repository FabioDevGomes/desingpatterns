package factory;


public class GoianiaIngrediente extends IngredienteFacory{

  @Override
  public String createQueijo() {
    return "Queijo de Goiânia";
  }

  @Override
  public String creatMassa() {
    return "Massa de Goiânia";
  }

}
