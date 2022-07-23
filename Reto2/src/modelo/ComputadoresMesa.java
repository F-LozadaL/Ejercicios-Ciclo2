public class ComputadoresMesa extends Computadores {

    private static final Integer ALMACENAMIENTO_BASE = 50;
    private Integer almacenamiento;

    public ComputadoresMesa(Double precio, Integer peso, Character consumoW,
        Integer almacenamiento) {
        super(precio, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }
    public ComputadoresMesa(Double precio, Integer peso) {
        super(precio, peso);
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }    
    public ComputadoresMesa() {        
        this.almacenamiento = ALMACENAMIENTO_BASE;
    }

    @Override
    public Double calcularPrecio() {

        Double nuevoPrecio = super.calcularPrecio();

        if (almacenamiento > 100) {
            setPrecioBase(nuevoPrecio + 50);
        }
        
        return getPrecio();
    }

}
