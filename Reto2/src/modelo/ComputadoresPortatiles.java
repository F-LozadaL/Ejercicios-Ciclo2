public class ComputadoresPortatiles extends Computadores{

    private static final Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private Boolean camaraITG;

    public ComputadoresPortatiles(Double precio, Integer peso, Character consumoW, Integer pulgadas, Boolean camaraITG) {
        super(precio, peso, consumoW);
        this.pulgadas = pulgadas;
        this.camaraITG = camaraITG;
    }
    public ComputadoresPortatiles(Double precio, Integer peso){
        super(precio, peso);
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    public ComputadoresPortatiles(){
        super();
        this.pulgadas = PULGADAS_BASE;
        this.camaraITG = false;
    }
    @Override
    public Double calcularPrecio() {
        Double nuevoPrecio=super.calcularPrecio();
        if(pulgadas>40){    
            nuevoPrecio+=getPrecioBase()*0.3;
        }
        if(camaraITG){
            nuevoPrecio+=50;
        }
        return nuevoPrecio;
    }
    
}
