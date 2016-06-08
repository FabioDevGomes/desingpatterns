package factory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PizzaCalabresaGoiania extends Pizza{
  
  IngredienteFacory ingredienteFacory;
  public PizzaCalabresaGoiania(IngredienteFacory ingredienteFacory) {
    super(ingredienteFacory);

  }

  @Override
  public void preparar() {
//  Define os ingredientes 
    setQueijo(ingredienteFacory.createQueijo());
    setMassa(ingredienteFacory.createQueijo());
    
    System.out.println("Preparando " + this.getNome());
  }

  @Override
  public void cortar() {
    System.out.println("Cortando pizza de Calabresa de Goiânia...");
  }

  @Override
  public void embalar() {
    System.out.println("Embalando pizza de Calabresa de Goiânia...");
  }

}
