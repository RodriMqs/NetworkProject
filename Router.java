package NetworkProject;

public class Router extends Config{

    private int numeroDePortas;

    public Router(String hostname, String ip, int numeroDePortas) {

        super(hostname, ip);
        this.numeroDePortas = numeroDePortas;
    }

    public void info() {

        super.info();
        System.out.println("Portas: " + numeroDePortas);
    }
}
