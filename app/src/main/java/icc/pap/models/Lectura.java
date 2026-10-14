package icc.pap.models;

public class Lectura<T> {
    private String idSensor;
    private T Valor;
    private String unidad;

    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        Valor = valor;
        this.unidad = unidad;
    }

    public String getIdSensor() {
        return idSensor;
    }

    public T getValor() {
        return Valor;
    }

    public String getUnidad() {
        return unidad;
    }
    
    
}
