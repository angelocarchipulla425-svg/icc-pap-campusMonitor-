package icc.pap.u01;

public class TiposDemo {
    

    public static void main(String[] args) {
        Caja<String> lugar = new Caja<>("lab6");
        Caja<Integer> limite = new Caja<>(3);
        Caja<Sensor> dispositivo = new Caja<>(new Sensor("s01", lugar.obtener()));

        System.out.println(lugar.obtener());
        System.out.println(limite.obtener());
        System.out.println(dispositivo);
        System.out.println(dispositivo.obtener());
        System.out.println(dispositivo.obtener().id() + " - " + dispositivo.obtener().ubicacion());
    }



}
