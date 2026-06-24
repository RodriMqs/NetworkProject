package NetworkProject;

public class Switch{
    private String hostname;
    private String ip;
    private int numerodeportas;

    //construtor
    public Switch (String hostname, String ip, int numerodeportas){
        this.hostname = hostname;
        this.ip = ip;
        this.numerodeportas = numerodeportas;
    }

    //getter é boa pratica para aceder a uma caracteristica do objeto facilmente
    public String getHostname(){
        return hostname;
    }
    public String getIp(){
        return ip;
    }

    public int getNumerodeportas(){
        return numerodeportas;
    }


    void info(){
        System.out.println("Hostname: " + this.hostname);
        System.out.println("IP: " + this.ip);
        System.out.println("Numero de Portas: " + this.numerodeportas);
    }
}