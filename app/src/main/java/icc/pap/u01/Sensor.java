package icc.pap.u01;
// Se usa el public record para colocar únicamente los atributos que serán
// inmutables que no se cambiaran y no sea necesario de lo contrario
// usar una public class
public record Sensor(
    String id,
    String ubicacion) {

} 
