package NetworkProject;

public class PC extends Config{

    private String gateway;

    //construtor
    public PC (String hostname, String ip, String gateway ){
        super(hostname, ip);
        this.gateway = gateway;
    }


    public void info(){
        super.info();
        System.out.println("Gateway: " +this.gateway);
    }
}
