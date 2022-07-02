import java.util.Random;
import java.util.Scanner;

public class clase1 {

    // Scanner sc = new Scanner(System.in);
    // int num=sc.nextInt();
    // sc.close();
    public static void eje1() {
        var nombre = "Francisco";

        System.out.println("Hola " + nombre);

    }

    public static void eje2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        int dig = 1;
        if (num < 0) {
            num *= 1;
        }
        while (num > 10) {
            dig++;
            num /= 10;
        }
        System.out.println(dig);

        sc.close();
    }

    public static void eje3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();

        System.out.println("Doble: " + num * 2 + " Triple: " + num * 3);

        sc.close();
    }

    public static void eje4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la tempereatura en Celcius: ");
        Double num = sc.nextDouble();

        System.out.println(">" + (32 + (9 * num / 5)) + " F");
        sc.close();

    }

    public static void eje5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = sc.nextInt();
        // boolean par= num%2==0;
        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        System.out.println();
        sc.close();
    }

    public static void eje6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.printf("La suma de %d y %d es igual a %d\n", num1, num2, num1 + num2);
        System.out.printf("La resta de %d y %d es igual a %d\n", num1, num2, num1 - num2);
        System.out.printf("La multiplicacion de %d y %d es igual a %d\n", num1, num2, num1 * num2);
        sc.close();
    }

    public static void eje7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nota 1: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        Double nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        Double nota3 = sc.nextDouble();
        Double prom = (nota1 + nota2 + nota3) / 3;
        if (prom >= 3) {
            System.out.println("El estudiante " + nombre + " ha sido Aprobado");
        } else {
            System.out.println("El estudiante " + nombre + " ha sido Reprobado");
        }
        sc.close();
    }

    public static void eje8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas:  ");
        int num = sc.nextInt();
        int sueldo = num * 30000;
        System.out.println("El sueldo es de " + sueldo);
        sc.close();
    }

    public static void eje9() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i * num);
        }
        sc.close();
    }

    public static void eje10() {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        int num = rng.nextInt(100);
        int res;
        while (true) {
            res = sc.nextInt();
            if (res == num)
                break;
            if (res > num) {
                System.out.println("El número que busca es menor");
            } else {
                System.out.println("El número que busca es mayor");
            }
        }

        sc.close();
    }

    public static void eje11() {
        Scanner sc = new Scanner(System.in);
        String genero;

        while (true) {
            System.out.println("Ingrese su sexo(H/M): ");
            genero = sc.nextLine();
            if (genero.toLowerCase() == "h" || genero.toLowerCase() == "M")
                break;
            System.out.println("Vuelva a ingresar");
        }

        System.out.println("Ingrese su altura(cm):  ");
        int altura = sc.nextInt();

        if (genero == "H")
            System.out.println("Peso ideal: " + (altura - 100));
        else
            System.out.println("Peso ideal: " + (altura - 110));

        sc.close();
    }

    public static void eje12() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("No es Primo");
                sc.close();
                return;
            }
        }
        System.out.println("Es Primo");
        sc.close();

    }

    public static void eje13() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String jugador = "";
        int oponente;

        while (jugador.toLowerCase() != "n") {

            oponente = r.nextInt(2);
            System.out.println("(P)iedra, Pape(L) o (T)ijera>>");
            jugador = sc.next();

            if (jugador.toLowerCase() == "p") {
                if (oponente == 0) {
                    System.out.println("Empate");
                } else if (oponente == 1) {
                    System.out.println("Perdio");
                } else {
                    System.out.println("Gano");
                }
            } else if (jugador.toLowerCase() == "l") {
                if (oponente == 0) {
                    System.out.println("Gano");
                } else if (oponente == 1) {
                    System.out.println("Empate");
                } else {
                    System.out.println("Perdio");
                }
            } else if (jugador.toLowerCase() == "t") {
                if (oponente == 0) {
                    System.out.println("Perdio");
                } else if (oponente == 1) {
                    System.out.println("Gano");
                } else {
                    System.out.println("Empate");
                }
            } else {
                System.out.println(">>Error: Input Incorrecto");
            }

            while (true) {
                System.out.println("Desea seguir jugando(Y/N)?");
                jugador = sc.next();
                if (jugador.toLowerCase() == "y" || jugador.toLowerCase() == "n") {
                    break;
                } else {
                    System.out.println(">>Error: Input Incorrecto");
                }
            }

        }

        sc.close();
    }

    public static void eje14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su Nombre: ");
        String nombre = sc.next();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese su salario: ");
        int salario = sc.nextInt();

        if (edad < 18) {
            System.out.println("No tiene edad para Trabajar");
        } else if (edad < 30) {
            System.out.println("No hay bonificacion");
        } else if (edad < 51) {
            System.out.println("La bonificacion de "+nombre+" es de: $" + salario * 0.05);
        } else if (edad < 61) {
            System.out.println("La bonificacion de "+nombre+" es de: $" + salario * 0.1);
        } else {
            System.out.println("La bonificacion de "+nombre+" es de: $" + salario * 0.15);
        }
        sc.close();
    }

    public static void eje15() {
        Scanner sc = new Scanner(System.in);
        int fiba = 1;
        int fibb = 1;

        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();

        if (num >= 0)
            System.out.print(0);
        if (num >= 1)
            System.out.print(" " + 1 + " " + 1);

        if (num > 1) {

            while (true) {
                fibb += fiba;
                fiba = fibb - fiba;
                if (fibb > num)
                    break;
                System.out.print(" " + fibb);

            }

        }

        sc.close();
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ejercicio (01-15)>>");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                eje1();
                break;
            case 2:
                eje2();
                break;
            case 3:
                eje3();
                break;
            case 4:
                eje4();
                break;
            case 5:
                eje5();
                break;
            case 6:
                eje6();
                break;
            case 7:
                eje7();
                break;
            case 8:
                eje8();
                break;
            case 9:
                eje9();
                break;
            case 10:
                eje10();
                break;
            case 11:
                eje11();
                break;
            case 12:
                eje12();
                break;
            case 13:
                eje13();
                break;
            case 14:
                eje14();
                break;
            case 15:
                eje15();
                break;
            
        }
        sc.close();
    }
}
