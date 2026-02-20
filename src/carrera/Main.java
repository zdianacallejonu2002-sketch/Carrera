package carrera;

public class Main {

    public static void main(String[] args) {
        Coche coche1 = new Coche("marca1", "modelo1", 105, 200, "matricula1", 60);
        Coche coche2 = new Coche("marca2", "modelo2", 105, 200, "matricula2", 60);

        Carrera carrera = new Carrera(coche1, coche2, 527, 1);
        carrera.iniciar();
    }

}