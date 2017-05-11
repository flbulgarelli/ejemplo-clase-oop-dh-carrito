import java.util.Collection;


public class ProductoCombo implements Producto {

  private Collection<Producto> partes;
  
  public ProductoCombo(Collection<Producto> partes) {
    this.partes = partes;
  }
  
  public double getPrecio() {
    return precioDeLasPartes() * 0.5;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  private double precioDeLasPartes() {
    return partes.stream().mapToDouble(Producto::getPrecio).sum();
  }

}
