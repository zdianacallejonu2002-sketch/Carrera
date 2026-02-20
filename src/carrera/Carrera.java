package carrera;

public class Carrera {
    private Coche coche1;
    private Coche coche2;
    private Coche ganador;
    private double kmTotales;
    private int nVueltas;

    public Carrera(Coche coche1, Coche coche2, double kmTotales, int nVueltas) {
        super();
        this.coche1 = coche1;
        this.coche2 = coche2;
        this.ganador = null;
        this.kmTotales = kmTotales;
        this.nVueltas = nVueltas;
    }

    public void iniciar() {
        this.coche1.mostrarDatos();
        this.coche2.mostrarDatos();

        for(int i = 0; i < nVueltas; i++) {
            this.coche1.acelerar(Math.random() * 200);
            this.coche2.acelerar(Math.random() * 200);

            System.out.println(coche1.getKm());
            System.out.println(coche2.getKm());
        }

        if(this.coche1.getKm() >= this.kmTotales) {
            this.ganador = coche1;
        }
        if (this.coche2.getKm() >= this.kmTotales) {
            this.ganador = coche2;
        }

        if (ganador != null) {
            this.mostrarGanador();
            return;
        }

        while(this.coche1.getKm() < this.kmTotales && this.coche2.getKm() < this.kmTotales) {
            this.coche1.acelerar(Math.random() * 200);
            this.coche2.acelerar(Math.random() * 200);

            System.out.println("coche1 - " + coche1.getKm());
            System.out.println("coche2 - " + coche2.getKm());
        }

        if(this.coche1.getKm() >= this.kmTotales) {
            this.ganador = coche1;
        }
        if (this.coche2.getKm() >= this.kmTotales) {
            this.ganador = coche2;
        }

        this.mostrarGanador();
    }

    private void mostrarGanador() {
        System.out.println("El ganador ha sido el coche con matrÃ­cula " + this.ganador.getMatricula());
    }

    public Coche getCoche1() {
        return coche1;
    }

    public void setCoche1(Coche coche1) {
        this.coche1 = coche1;
    }

    public Coche getCoche2() {
        return coche2;
    }

    public void setCoche2(Coche coche2) {
        this.coche2 = coche2;
    }

    public Coche getGanador() {
        return ganador;
    }

    public void setGanador(Coche ganador) {
        this.ganador = ganador;
    }

    public double getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(double kmTotales) {
        this.kmTotales = kmTotales;
    }

    public int getnVueltas() {
        return nVueltas;
    }

    public void setnVueltas(int nVueltas) {
        this.nVueltas = nVueltas;
    }
}