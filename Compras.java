package fabricadesillas;

public class Compras {
    
    private String Proveedor;
    private String NoFactura;
    private String Id_Producto;
    private String NombreProducto;
    private int Cantidad;
    private String fecha;
    private Double Total;

    public Compras(String Proveedor, String NoFactura, String Id_Producto, String NombreProducto, int Cantidad, String fecha, Double Total) {
        this.Proveedor = Proveedor;
        this.NoFactura = NoFactura;
        this.Id_Producto = Id_Producto;
        this.NombreProducto = NombreProducto;
        this.Cantidad = Cantidad;
        this.fecha = fecha;
        this.Total = Total;
    }
    
    
}
