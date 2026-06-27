package NetworkProject;

public class Switch extends Config{

    private int numeroDePortas;

    public Switch(String hostname, String ip, int numeroDePortas) {

        super(hostname, ip);
        this.numeroDePortas = numeroDePortas;
    }

    public void info() {

        super.info();
        System.out.println("Portas: " + numeroDePortas);
    }
}
