

import java.util.ArrayList;
import java.util.Collection;

public class Carrito {

  private Collection<Producto> productos = new ArrayList<>();

  public double getPrecio() {
    return productos.stream().mapToDouble(Producto::getPrecio).sum();
  }

  public void agregarProducto(Producto unProducto) {
    productos.add(unProducto);
  }

}
