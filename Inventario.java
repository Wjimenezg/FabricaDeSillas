package fabricadesillas;

public class Inventario {
    
    private String Id_Producto;
    private String NombreProducto;
    private int cantidad;
    private String FechaIngreso;

    public Inventario(String Id_Producto, String NombreProducto, int cantidad) {
        this.Id_Producto = Id_Producto;
        this.NombreProducto = NombreProducto;
        this.cantidad = cantidad;
    }

    public String getId_Producto() {
        return Id_Producto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

  
    
}
