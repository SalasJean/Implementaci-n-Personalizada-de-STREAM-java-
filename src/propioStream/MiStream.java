package propioStream;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public interface  MiStream<T> {
	//aqui como un proyecto didactico vamos a crear nuestro propio stream si? ojito
	//recuerda recibir un objeto generico que se llenada con los datos ingresados del usuario si?
	
	//usaremos metodos de stream para no hacer esto super largo si?
	MiStream<T> filter(Predicate<T> predicate);
	//ahora transformamos cada elemento en una funcion
	<R> MiStream<R> map(Function<T, R> mapper);
	
	//ahora convertimos todo esto en una lista recuerda si?
	List<T> collect();
}
