package icc.pap.u01;
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
}
