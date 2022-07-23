
import java.io.File;
import java.io.FileReader;



public class App {
    public static void eje1(){
        String path= "clase10.java\\src\\prueba.txt";
        var archivo = new File(path);
        int letra;
        if (archivo.exists()) {

            try (var fr= new FileReader(archivo)){
                
                do{
                    letra=fr.read();
                    if(letra!=32) System.out.print((char)letra);

                } while( letra != -1);
                
            } catch (Exception e) {
                System.err.println(e);
            }

        } else {
            System.out.println("¡El fichero no existe!");
        }
    }
    public static void main(String[] args) throws Exception {
        
        eje1();

  
        

    }
}
