package co.edu.sena;

public class App {

    public static void main(String[] args) {
        Avion avionDeCarga = new AvionCarga();
        avionDeCarga.apagar();
        avionDeCarga.prender();
        accionesAvion(avionDeCarga);
        System.out.println(avionDeCarga.getClass().getCanonicalName());

        System.out.println("--------------------------");

        Avion avionDeGuerra = new AvionGuerra();
        avionDeGuerra.prender();
        avionDeGuerra.apagar();
        accionesAvion(avionDeGuerra);
        System.out.println(avionDeGuerra.getClass().getCanonicalName());

        System.out.println("--------------------------");


    }

    public static void accionesAvion(Avion avion) {
        if (avion instanceof AvionCarga) {
            ((AvionCarga) avion).bajarCarga();
            ((AvionCarga) avion).subirCarga();
        }
        if (avion instanceof AvionGuerra) {
            ((AvionGuerra) avion).dispararAmetralladora();
            ((AvionGuerra) avion).dispararMisil();
        }
    }
}
