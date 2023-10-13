import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static void main(String[] args) {
        // Crear un diccionario utilizando una Hash Table (HashMap)
        Map<String, String> diccionario = new HashMap<>();

        // Agregar palabras y sus significados al diccionario
        diccionario.put("Casa", "Lugar de residencia.");
        diccionario.put("Perro", "Animal doméstico.");
        diccionario.put("Libro", "Objeto con páginas escritas.");
        diccionario.put("Computadora", "Dispositivo para procesar información.");
        diccionario.put("Jardín", "Área con plantas y flores.");

        // Imprimir los elementos del diccionario
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            String palabra = entrada.getKey();
            String significado = entrada.getValue();
            System.out.println("Palabra: " + palabra + " - Significado: " + significado);
        }
    }
}