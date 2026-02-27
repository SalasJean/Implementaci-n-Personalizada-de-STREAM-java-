package propioStream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Juan", "Ana", "Luis", "Carlos", "María");

        // Crear un stream con nuestra implementación osea nuestra propia logica
        MiStream<String> streamPropio = SimpleStream.of(nombres);
      //aqui para no agregar complejidad estamos usando los metodos de la interfaz stream
        List<String> resultado = streamPropio
            .filter(n -> n.startsWith("J"))
            .map(String::toUpperCase)
            .collect();
        System.out.println(resultado);
    }
}
