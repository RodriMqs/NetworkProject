package NetworkProject;

public class Config {

    private String hostname;
    private String ip;

    public Config(String hostname, String ip) {
        this.hostname = hostname;
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public String getIp() {
        return ip;
    }

    public void info() {
        System.out.println("Hostname: " + hostname);
        System.out.println("IP: " + ip);
    }
}
