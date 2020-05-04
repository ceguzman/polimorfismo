package co.edu.sena;

public class AvionGuerra extends Avion {
    public void dispararAmetralladora() {
        System.out.println("tatatatatatat");
    }

    public void dispararMisil() {
        System.out.println("Boooooom!!!");
    }

    public void prender() {
        System.out.println("Me prendo con llave");
    }

    @Override
    public String toString() {
        return "AvionGuerra{}";
    }
}
