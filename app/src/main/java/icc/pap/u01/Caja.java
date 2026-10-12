package icc.pap.u01;

import java.util.function.Function;

// Clase genérica
public class Caja<T> {
    //Dato Genérico
    private final T valor;


    public Caja(T valor) {
        this.valor = valor;
    }

    // Metodo genérico
    // Getter
    public T obtener() {
        return valor;
    }

    // Metodo genérico
    public <R> R mapear(Function<T, R> operacion) {
        R resultado = operacion.apply(valor);
        return resultado;
    }
}
