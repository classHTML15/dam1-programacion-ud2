import utilidades.Cancion;
import utilidades.Pelicula;

public class InstanciaReferenciaYComparacion {
    
    public static void main(String[] args) {

        // ================================
        // EJERCICIO 1: Crear objetos con new
        // ================================
        // 1. Crea un objeto Cancion (c1) usando el constructor por defecto.
        // 2. Crea otro objeto Cancion (c2) usando el constructor parametrizado,
        //    por ejemplo: "Clocks", "Coldplay".
        // 3. Muestra por consola ambas canciones con System.out.println().
        // 4. Observa qué valores se imprimen en cada caso.

        // Tu código aquí ↓
        Cancion c1 = new Cancion("Devorame otra vez", "Franky Ruiz");
        Cancion c2 = new Cancion("Clocks", "Coldplay");
        System.out.println(c1);
        System.out.println(c2);


        // ================================
        // EJERCICIO 2: Comparación con ==
        // ================================
        // 1. Crea dos objetos Cancion (c3 y c4) distintos, con los mismos valores.
        // 2. Imprime el resultado de (c3 == c4).

        // Tu código aquí ↓

        Cancion c3 = new Cancion("Waka Waka" , "Shakira");
        Cancion c4 = new Cancion("Waka Waka" , "Shakira");
        System.out.println(c3 == c4);


        // ================================
        // EJERCICIO 3: Comparación con equals()
        // ================================
        // 1. Usando los mismos objetos c3 y c4 del ejercicio anterior,
        //    imprime el resultado de (c3.equals(c4)).

        // Tu código aquí ↓

        c3 = new Cancion("Waka Waka" , "Shakira");
        c4 = new Cancion("Waka Waka" , "Shakira");
        System.out.println(c3.equals(c4));

        // ================================
        // EJERCICIO 4: Comparación en Pelicula
        // ================================
        // 1. Crea dos objetos Pelicula (p1 y p2) con el mismo título y año.
        // 2. Imprime ambas películas por consola.
        // 3. Imprime (p1 == p2).
        // 4. Imprime (p1.equals(p2)).

        // Tu código aquí ↓
        
        Pelicula p1 = new Pelicula("Transformers 3", 2011);
        Pelicula p2 = new Pelicula("Transformers 3", 2011);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        // ================================
        // EJERCICIO 5: Referencias
        // ================================
        // 1. Crea un objeto Cancion (c5) con el constructor parametrizado.
        // 2. Declara otra variable Cancion (c6) y haz que apunte al mismo objeto que c5.
        // 3. Imprime (c5 == c6).
        // 4. Cambia el título de la canción desde c6.
        // 5. Imprime c5 de nuevo.

        // Tu código aquí ↓
        
        Cancion c5 = new Cancion("Tortura", "Shakira y Alejandro Sanz");
        Cancion c6 = c5;
        System.out.println(c5 == c6);
        c6.setTitutlo("Tortura (Remix)");
        System.out.println(c5);

        // ================================
        // EJERCICIO 6: null
        // ================================
        // 1. Declara una variable Pelicula (p3) y asígnale null.
        // 2. Imprime p3 por consola.
        // 3. Ahora intenta acceder a un método de p3 (ejemplo p3.getTitulo()).
        //    Comenta la línea después de probar, porque lanzará un error.

        // Tu código aquí ↓

        Pelicula p3 = (null);
        System.out.println(p3);
        //System.out.println(p3.getTitulo());
    }
}

// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿Qué diferencia hay entre el constructor por defecto y el parametrizado?
// Respuesta: ...
// - La diferencia es que, el contructor por defecto crea objetos predefinidos, mientras que el parametrizo crea un objeto personalizable.

// Ejercicio 2: ¿Por qué da false al comparar con == dos objetos con los mismos datos?
// Respuesta: ...
// - Porque esta comparando referencias del mismo objeto y eso no significa que den igual

// Ejercicio 3: ¿Qué diferencia hay entre == y equals()? ¿Por qué ahora sí devuelve true?
// Respuesta: ...
// - La diferencia es que una compara referencias de un objeto y la otra compara el contenido de un objeto. Es por eso que al comparar con equals(), da que son iguales.

// Ejercicio 4: ¿Por qué en Pelicula equals no funciona como en Cancion?
// Respuesta: ...
// - Porque no sobreescribes el equals(), teniendo el == en la misma funcion. Se tiene que sobreescribir para cambiar el valor y que fuera true.

// Ejercicio 5: ¿Qué ocurre cuando modificas el objeto a través de c6? ¿Qué demuestra?
// Respuesta: ...
// - Que con el set.Titutlo se puede cambiar el titulo inicial de una variable o del nombre de una variable.

// Ejercicio 6: ¿Qué error aparece al acceder a un método de p3 siendo null?
// ¿Qué significa realmente que una variable valga null?
// Respuesta: ...
// - Aparece "Exception in thread "main" java.lang.NullPointerException: Cannot invoke "utilidades.Pelicula.getTitulo()" because "p3" is null", que basicamente es que la variable no tenga un nombre o valor asignado, el valor al imprimirlo por pantalla sera la respuesta que avabo de poner