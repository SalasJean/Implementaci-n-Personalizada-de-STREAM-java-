package propioStream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;//recuerda que el predicate es un filtro logico simepre devuelve un boolean si?

public class SimpleStream<T> implements MiStream<T> {
	//ahora pasamos a la implemetacion de nuestros tream recuerda si? osea de nuestro contrato
	//recuerda que estamos usando wildcards ya que no sabemos aun el dato de entrada 
	//recuerda que los genericos son mas seguros y evitan errores de compilacion
	private final List<T> elements;

	/**
	 * @param elements
	 */
	public SimpleStream(List<T> elements) {
		super();
		this.elements = elements;
	}
	 @Override
	    public MiStream<T> filter(Predicate<T> predicate) {
	        List<T> filtered = new ArrayList<>();
	        for (T element : elements) {
	            if (predicate.test(element)) {
	                filtered.add(element);
	            }
	        }
	        return new SimpleStream<>(filtered);
	    }

	    @Override
	    public <R> MiStream<R> map(Function<T, R> mapper) {
	        List<R> mapped = new ArrayList<>();
	        for (T element : elements) {
	            mapped.add(mapper.apply(element));
	        }
	        return new SimpleStream<>(mapped);
	    }

	    @Override
	    public List<T> collect() {
	        return new ArrayList<>(elements);
	    }
	    
	    public static <T> SimpleStream<T> of(List<T> elements) {
	        return new SimpleStream<>(elements);
	    }
	
	

}
