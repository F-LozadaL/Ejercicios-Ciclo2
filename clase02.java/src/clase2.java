import java.util.Scanner;

public class clase2 {
        // Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();
        // sc.close();
    public static String eje1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa)>>");
        String fecha = sc.nextLine();
        String msg;
        try {

            String[] num = fecha.split("/");
            int num_d = Integer.parseInt(num[0]);
            int num_m = Integer.parseInt(num[1]);
            int num_a = Integer.parseInt(num[2]);

            int sum1 = num_a + num_m + num_d;
            int sum2 = 0;
            while (sum1 != 0) {
                sum2 += sum1 % 10;
                sum1 /= 10;
            }

            msg = "Su numero de la suerte es " + sum2;
        } catch (NumberFormatException ex) {
            msg = "Error: " + ex.getMessage();
        }
        sc.close();
        return msg;
    }

    public static String eje2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad:");
        int cantidad = sc.nextInt();
        System.out.println("Precio Individual:");
        int precio = sc.nextInt();
        System.out.println("IVA (n --> n%):");
        double iva = sc.nextDouble();
        System.out.println();

        sc.close();
        return "El precio de la venta es de  " + (cantidad * precio * (iva / 100));
    }

    public static String eje3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero>>");
        String str_num = sc.nextLine();
        int num_o = str_num.length();

        System.out.print("Ingrese el numero de digitos a extraer");
        int num_d = sc.nextInt();

        if (num_d > num_o) {
            sc.close();
            return "Error: la cantidad de digitos a extraer es mayor ";
        }

        num_o = Integer.parseInt(str_num);
        int resultado = (int) (num_o / Math.pow(10, num_d));

        sc.close();
        return "El numero resultandte es " + resultado;
    }

    public static String eje4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una velocidad (km/h)>>");
        Double velocidad = sc.nextDouble();

        velocidad = 1000 * velocidad / 3600;

        sc.close();
        return "La velocidad en m/s es de " + velocidad;
    }

    public static String eje5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cateto 1>>");
        Double cat1 = sc.nextDouble();
        System.out.print("Ingrese cateto 2>>");
        Double cat2 = sc.nextDouble();

        Double hipo = Math.pow(cat1 * cat1 + cat2 * cat2, 1 / 2);
        sc.close();
        return "La hipotennusa es de " + hipo;
    }

    public static String eje6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            sc.close();
            return "El numero es multiplo de 10";
        } else {
            sc.close();
            return "El numero no es multiplo de 10";
        }
    }

    public static String eje7() {

        Scanner sc = new Scanner(System.in);
        String chara;
        while (true) {
            System.out.print("Ingrese un caracter>> ");
            chara = sc.nextLine();
            if (chara.length() == 1) {
                break;
            }
            System.out.println("Error: se ingreso mas de un caracter.");
        }

        if ((int) chara.charAt(0) > 64 && (int) chara.charAt(0) < 91) {
            sc.close();
            return "El caracter ES una letra mayuscula";
        }

        sc.close();
        return "El caracter NO ES una letra mayuscula";
    }

    public static String eje8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero>> ");
        Double num = sc.nextDouble();
        Double div;

        while (true) {
            System.out.print("Ingrese el segundo numero>> ");
            div = sc.nextDouble();
            if (div != 0) {
                break;
            }
            System.out.println("Error: no se puede dividir por 0");
        }
        sc.close();
        return "El resultado de la division es de " + num / div;
    }

    public static String eje9() {

        Scanner sc = new Scanner(System.in);
        String msg = "Dos o mas numeros tienen el mayor valor";

        System.out.print("Ingrese el primer numerp>> ");
        int numa = sc.nextInt();
        System.out.print("Ingrese el segundo numerp>> ");
        int numb = sc.nextInt();
        System.out.print("Ingrese el tercer numerp>> ");
        int numc = sc.nextInt();

        if (numa > numb && numa > numc) {
            msg = "El  mayor numero es " + numa;
        } else if (numb > numa && numb > numc) {
            msg = "El  mayor numero es " + numb;
        } else if (numc > numa && numc > numb) {
            msg = "El  mayor numero es " + numc;
        }

        sc.close();
        return msg;
    }

    public static String eje10() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingre hora>> ");
        int hora = sc.nextInt();
        System.out.print("Ingre minutos>> ");
        int min = sc.nextInt();
        System.out.print("Ingre segundos>> ");
        int seg = sc.nextInt();

        boolean valido=false;

        if (hora > -1 && hora < 23) {
            if (min > -1 && min < 60) {
                if (seg > -1 && hora < 60) {
                    sc.close();
                    return "Es una hora valida";
                }
            }
        }
        sc.close();
        return "No es una hora valida";
    }

    public static String eje11(){


        return null;
    }

    public static void eje12(){

        int cont=0;

        while(++cont<=100){
            if(cont%3!=0)   System.out.print(cont+" ");
        }
        System.out.println();
        cont=0;
        do{
            if(cont%3!=0)   System.out.print(cont+" ");
        }while(++cont<=100);
        System.out.println();
        for(int i=1; i<=100; i++) {
            if(i%3!=0)   System.out.print(i+" ");
        }
    }

    public static String eje13(){
        Scanner sc = new Scanner(System.in);
        String msg="";

        System.out.println("Escoja una opcion: ");
        System.out.println("    1- COP to USD ");
        System.out.println("    2- USD to COP ");
        System.out.print(">> ");
        int opc=sc.nextInt();
        
        Double mon;
        if(opc==1){
            System.out.print("Ingrese la cantidad en COP>> ");
            mon=sc.nextDouble();
            if(mon<0)mon*=-1;
            mon/=4200;
            msg="Son "+mon+" USD";
        }else if(opc==2){
            System.out.print("Ingrese la cantidad en USD>> ");
            mon=sc.nextDouble();
            if(mon<0)mon*=-1;
            mon*=4200;
            msg="Son "+mon+" COP";
        }    
         
        
        sc.close();

        return msg;

    }

    public static void eje14(){

        int n=7;
        int fiba=1;
        int fibb=2;


        if(n>=1) System.out.print("0");
        if(n>=2) System.out.print(" 1");
        if(n>=3) System.out.print(" 1");

        for (int i = 0; i < n-3; i++) {
            
            fibb+=fiba;
            fiba=fibb-fiba;
            System.out.print(" "+fibb);

        }
        
    }

    public static int eje15(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero>> ");
        int in=sc.nextInt();

        int res=0;
        int fact=1;

        if(in==0) res=1;
        else if(in>=1) res=2;

        if(in>1){
            for(int i = 2; i <= in; i++) {
                fact*=i;
                res+=fact;
            }
        }
        
        sc.close();
        return res;
    }

    public static void eje16(){
        for (int i = 27; i >0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(i-j+64));
            }
            System.out.println();
        }
    }




    public static void main(String[] args) throws Exception {
        eje16();
    }
}
