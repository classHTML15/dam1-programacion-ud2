import java.util.Scanner;
import utilidades.ProcesadorTexto;
import utilidades.Usuario;

public class DatosUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        int edad = sc.nextInt();
        sc.nextLine();
        String correo = sc.nextLine();
        sc.nextLine();

        // Email valido o no
        boolean emailValido = ProcesadorTexto.esEmailValido(correo);
        // No se si esto era lo que pedia con la edad
        boolean edadValida = edad > 0 || edad < 120;
        // Identificamos la condicion del nombre 
        boolean nombreCaracteres = nombre.length() > 2 || nombre.length() < 20;
        if (emailValido && edadValida && nombreCaracteres) {

            Usuario usuario = new Usuario(nombre, edad, correo);
            usuario.mostrarInformacion();

        } else {

            System.out.println("El usuario no puede ser creado porque el email introducido no es valido");

        }

        // Normalizar nombre
        String name = "samuel";
        System.out.println("El nombre es: " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());
        System.out.println("Nombre sin espacios: " + name.trim());
        sc.close();
    }
}
