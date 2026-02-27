**Objetivo**
Este proyecto nace de mi interés por comprender cómo funcionan los **streams** en Java bajo el capó. Aunque Java 8 ya proporciona una implementación robusta, decidí crear mi propia versión para explorar conceptos como:
- **Encadenamiento de operaciones** (`filter`, `map`, `collect`).
- **Inmutabilidad** y procesamiento de colecciones.
- **Diseño de APIs** funcionales.

---
**Características**
- **Interfaz `MiStream<T>`:** Define las operaciones básicas (`filter`, `map`, `collect`).
- **Clase `SimpleStream<T>`:** Implementación concreta que procesa listas de forma secuencial.
- **Método estático `of`:** Para crear streams fácilmente, similar a `Stream.of()` de Java.

---
**Ejemplo de Uso**
```java
List<String> nombres = Arrays.asList("Juan", "Ana", "Luis", "Carlos");
MiStream<String> stream = SimpleStream.of(nombres);

List<String> resultado = stream
    .filter(n -> n.startsWith("A"))
    .map(String::toUpperCase)
    .collect();

System.out.println(resultado); // Salida: [ANA]
