import java.util.Arrays;

public class Main {
  
  public static void main(String[] args) {
    Producto hamburguesa = new ProductoSuelto(56);
    Producto papasFritas = new ProductoSuelto(35);
    Producto gaseosa = new ProductoSuelto(38);


    Carrito elCarritoDeFer = new Carrito();
    elCarritoDeFer.agregarProducto(hamburguesa);
    elCarritoDeFer.agregarProducto(gaseosa);
    elCarritoDeFer.getPrecio();


    Carrito elCarritoDeAgus = new Carrito();
    elCarritoDeAgus.agregarProducto(papasFritas);
    elCarritoDeAgus.agregarProducto(papasFritas);
    elCarritoDeAgus.getPrecio();


    ProductoCombo comboMediodia = new ProductoCombo(
        Arrays.asList(hamburguesa, gaseosa, papasFritas));


    
    
    Producto comboReLoco = new ProductoCombo(
        Arrays.asList(comboMediodia, papasFritas));
    
    Carrito elCarritoDePedro = new Carrito();
    elCarritoDePedro.agregarProducto(comboReLoco);
    elCarritoDePedro.getPrecio(); 
    
    
    
    
    
    
    System.out.println(elCarritoDePedro.getPrecio());
  }

}
