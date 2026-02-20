package carrera;

public class Coche {
    private String marca;
    private String modelo;
    private int cv;
    private int cc;
    private String matricula;
    private double velocidad;
    private double km;

    public Coche(String marca, String modelo, int cv, int cc, String matricula, double velocidad) {
        super();
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.cc = cc;
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.km = 0;
    }

    public void acelerar(double velocidadAumentar) {
        if (velocidadAumentar < 10) {
            velocidadAumentar = 10;
        }

        double velodiadExtra = 0;

        if (this.cv < 100) {
            velodiadExtra = Math.random() * velocidadAumentar;
        } else {
            velodiadExtra = (Math.random() * velocidadAumentar) + 10;
        }

        this.km += velodiadExtra * 0.5;
        this.velocidad += velodiadExtra;
    }

    public void mostrarDatos() {
        System.out.println("Coche [marca=" + marca + ", modelo=" + modelo + ", cv=" + cv + ", cc=" + cc + ", matricula=" + matricula
                + ", velocidad=" + velocidad + ", km=" + km + "]");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}