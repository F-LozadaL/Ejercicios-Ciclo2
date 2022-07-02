import java.util.Scanner;

public class clase2 {
    // Scanner sc = new Scanner(System.in);
    // int num=sc.nextInt();
    // sc.close();
    public static void eje1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento (dd/mm/aaaa)>>");
        String fecha = sc.nextLine();

        try {

            String[] num = fecha.split("/");
            int num_d = Integer.parseInt(num[0]);
            int num_m = Integer.parseInt(num[1]);
            int num_a = Integer.parseInt(num[2]);
            int sum1=num_a+num_m+num_d;
            int sum2=0;
            while (sum1!=0) {
                sum2+=sum1%10;
                sum1/=10;
            }


            System.out.println("Su numero de la suerte es "+sum2);
        } catch (NumberFormatException ex) {

        }
        sc.close();
    }

    public static void main(String[] args) throws Exception {
        eje1();
        // System.out.println(11/10);
    }
}
