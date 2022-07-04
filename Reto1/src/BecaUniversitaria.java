public class BecaUniversitaria {

    private double pMonto, pInteres;
    private int pTiempo;

    public BecaUniversitaria(){
        this.pMonto=this.pInteres=this.pTiempo=0;
    }
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres){
        this.pMonto=pMonto;
        this.pInteres=pInteres;
        this.pTiempo=pTiempo;
    }

    public String compararInversion (int pTiempo, double pMonto, double pInteres){

        if(this.pMonto==0){
            this.pMonto=pMonto;
            this.pInteres=pInteres;
            this.pTiempo=pTiempo;
            var diferencia=calcularInteresCompuesto()-calcularInteresSimple();
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        }
        var diferencia=calcularInteresCompuesto()-calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public String compararInversion (){
        
        if(this.pMonto==0){
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
        var diferencia=calcularInteresCompuesto()-calcularInteresSimple();
        return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
    }

    public double calcularInteresSimple(){
        return Math.round(this.pMonto*this.pInteres*this.pTiempo/100); 
    }

    public double calcularInteresCompuesto(){
        return Math.round(this.pMonto*(Math.pow(1+this.pInteres/100,pTiempo)-1));
    }

    public static void main(String[] args) {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion());
    }


}
