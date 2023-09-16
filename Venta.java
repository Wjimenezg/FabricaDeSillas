package fabricadesillas;

public class Venta {
    private int NoFactura;
    private int TipoPago;

    public Venta(int NoFactura, int TipoPago) {
        this.NoFactura = NoFactura;
        this.TipoPago = TipoPago;
    }

    public int getNoFactura() {
        return NoFactura;
    }

    public int getTipoPago() {
        return TipoPago;
    }

    
}
