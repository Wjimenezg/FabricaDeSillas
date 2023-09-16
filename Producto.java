package fabricadesillas;

abstract class Producto {
    
    private String id_Producto;
    private String TipoProducto;
    private String PrecioProducto;

    public Producto(String id_Producto, String TipoProducto, String PrecioProducto) {
        this.id_Producto = id_Producto;
        this.TipoProducto = TipoProducto;
        this.PrecioProducto = PrecioProducto;
    }

    public String getIdProducto() {
        return id_Producto;
    }

    public String getTipoProducto() {
        return TipoProducto;
    }

    public String getPrecioProducto() {
        return PrecioProducto;
    }
        
}
