import java.util.Scanner;

public class GestorTarea {

    public static void main(String[] args) {
        
        // ================================
        // EJERCICIO 1: Bienvenida
        // ================================
        // Crea un método llamado que muestre un mensaje de bienvenida al programa.
        // No necesita devolver nada, solo imprimir por consola.

        // Tu código aquí ↓
        
        llamado("Javier");

        // ================================
        // EJERCICIO 2: Duración total
        // ================================
        // Crea un método que reciba la duración (en minutos) de dos tareas
        // y devuelva el total de minutos.
        // Llama al método con 45 y 30 y muestra el resultado en consola.

        // Tu código aquí ↓
        

        int total = duraciontotal(45, 30);
        System.out.println("Duracion total: " + total + " minutos");

        // ================================
        // EJERCICIO 3: Conversión de tiempo
        // ================================
        // Crea un método que reciba una cantidad de minutos
        // y muestre en pantalla cuántas horas y minutos son.
        // Ejemplo: 150 minutos → "Son 2 horas y 30 minutos".
        // No tiene que devolver nada.

        // Tu código aquí ↓
        
        conversiontiempo(200);

        // ================================
        // EJERCICIO 4: Recordatorios
        // ================================
        // Crea un método que reciba el nombre de una tarea y una prioridad (1–3)
        // y muestre un mensaje como:
        // "📌 [Prioridad 2] Revisar correo".
        // Solo muestra el mensaje, no devuelve nada.

        // Tu código aquí ↓
        
        recordatorio("Limpiar la casa", "1");

        // ================================
        // EJERCICIO 5: Estado de tareas
        // ================================
        // Crea un método que reciba un valor booleano que indique si la tarea está completada.
        // Debe devolver un texto: "✅ Completada" o "⏳ Pendiente".
        // Muestra el resultado de llamar al método con ambos casos.

        // Tu código aquí ↓
        
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Completaste la tarea? (si/no)");
        boolean estado = sc.nextBoolean();
        System.out.println(estadotarea(estado));
        sc.close();

        // ================================
        // EJERCICIO 6: Productividad
        // ================================
        // Crea un método que reciba el número total de tareas y las completadas
        // y devuelva el porcentaje de avance (por ejemplo, 70.0 si 7/10).
        // Muestra el resultado en consola.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 7: Sobrecarga
        // ================================
        // Crea dos métodos con el mismo nombre:
        // - uno sin parámetros, que muestre un mensaje genérico (ejemplo: "Hola crack";
        // - otro con parámetros (nombre de usuario, número de tareas completadas) "Hola {usuario} completaste {numero} de tareas"
        //   que muestre un resumen personalizado.
        // Llama a ambos desde main.

        // Tu código aquí ↓
        

        // ================================
        // EJERCICIO 8: Bonus - Planificación
        // ================================
        // Crea un método que reciba el nombre de una tarea y su duración en minutos,
        // y devuelva un texto con la planificación:
        // "La tarea [nombre] durará aproximadamente X horas y Y minutos."
        // Muestra el texto en pantalla.

        // Tu código aquí ↓
    }

     // Aquí debéis crear los métodos fuera del main ↓↓↓
    public static void llamado(String nombre) {
        
        System.out.println("Hola " + nombre);

    }


    public static int duraciontotal(int minutos, int minutos2) {
        
        return minutos + minutos2;

    }


    public static void conversiontiempo(int mostrarHorasyMinutos) {
        
        int horas = mostrarHorasyMinutos / 60;
        int minutos = mostrarHorasyMinutos % 60;
        System.out.println("Son: " + horas + " horas y " + minutos + " minutos ");

    }


    public static void recordatorio(String nombretarea, String prioridad) {
        
        System.out.println("Prioridad: " + prioridad + "; Nombre tarea: " + nombretarea);

    }


    public static String estadotarea(boolean estado) {
        

        if (estado) {

            return "Completada con exito";

        } else {

            return "Pendiente de hacer";

        }

    }
}
