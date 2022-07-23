public class PrecioTotal {

    private Double totalComputadores = 0.0;
    private Double totalComputadoresPortatiles = 0.0;
    private Double totalComputadoresMesa = 0.0;
    private Computadores[] listaComputadores;

    public PrecioTotal(Computadores[] listaComputadores) {
        this.listaComputadores = listaComputadores;
    }

    public void mostrarTotales(){
        for (Computadores computador : listaComputadores) {

            var i =computador.calcularPrecio();
            totalComputadores+=i;
            

            if(computador instanceof ComputadoresPortatiles){
                totalComputadoresPortatiles+=i;
            } else if (computador instanceof ComputadoresMesa){
                totalComputadoresMesa+=i;
            }
        }

        System.out.println("La suma del precio de los computadores es de " + totalComputadores);
        System.out.println("La suma del precio de los computadores de mesa es de " +  
        totalComputadoresMesa);
        System.out.print("La suma del precio de los computadores portátiles es de " +
        totalComputadoresPortatiles);
    }

    
}
