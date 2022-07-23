public class Computadores {

    private final Double PRECIO_BASE;
    private final Integer PESO_BASE;
    private final Character CONSUMO_W_BASE;
    private Integer peso;
    private Character consumoW;
    private Double precioBase;

    
    public Computadores(Double precioBase, Integer peso, Character consumoW) {
        this.PRECIO_BASE=precioBase;
        this.PESO_BASE=peso;
        this.CONSUMO_W_BASE=consumoW;
        
        
        this.peso = peso;
        this.consumoW = consumoW;
        this.precioBase = precioBase;
    }
    public Computadores(Double precioBase, Integer peso){
        this(precioBase,peso,'F');
    }
    public Computadores (){
        this(100.0,5,'F');
    }
    public Double getPrecioBase() {
        return PRECIO_BASE;
    }
    public Integer getPesoBase() {
        return PESO_BASE;
    }
    public Character getConsumoWBase() {
        return CONSUMO_W_BASE;
    }
    public Integer getPeso() {
        return peso;
    }
    public Character getConsumoW() {
        return consumoW;
    }
    public Double getPrecio() {
        return precioBase;
    }

    
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }
    
    public Double calcularPrecio() {

        Double nuevoPrecio = precioBase;
        switch (consumoW) {
            case 'A':
                nuevoPrecio += 100;
                break;
            case 'B':
                nuevoPrecio += 80;
                break;
            case 'C':
                nuevoPrecio += 60;
                break;
            case 'D':
                nuevoPrecio += 50;
                break;
            case 'E':
                nuevoPrecio += 30;
                break;
            case 'F':
                nuevoPrecio += 10;
                break;
        }
        if (this.peso >= 0 && this.peso < 19) {
            nuevoPrecio += 10;
        } else if (this.peso >= 20 && this.peso < 49) {
            nuevoPrecio += 50;
        } else if (this.peso >= 50 && this.peso < 79) {
            nuevoPrecio += 80;
        } else if (this.peso >= 80) {
            nuevoPrecio += 100;
        }

        this.precioBase = nuevoPrecio;
        return this.precioBase;
    }

}
