package NetworkProject;

public class PC{
    private String name;
    private String ip;
    private String gateway;

    //construtor
    public PC (String name, String ip, String gateway ){
        this.name = name;
        this.ip = ip;
        this.gateway = gateway;
    }

    //getter é boa pratica para aceder a uma caracteristica do objeto facilmente
    public String getName(){
        return name;
    }
    public String getIp(){
        return ip;
    }
    public String getGateway(){
        return gateway;
    }



    void info(){
        System.out.println("Name: " + this.name);
        System.out.println("IP: " + this.ip);
        System.out.println("Gateway: " +this.gateway);
    }
}