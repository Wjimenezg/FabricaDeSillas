package fabricadesillas;

public class Proveedor {
    int Identificador;
    String nombre;
    String Tipo_producto;
    int Id_Producto;
    String NoFactura;

    public Proveedor(int Identificador, String nombre, String Tipo_producto, int Id_Producto, String Factura) {
        this.Identificador = Identificador;
        this.nombre = nombre;
        this.Tipo_producto = Tipo_producto;
        this.Id_Producto = Id_Producto;
        this.NoFactura = Factura;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo_producto() {
        return Tipo_producto;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public String getFactura() {
        return NoFactura;
    }
    
    
}
