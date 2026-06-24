package NetworkProject;

public class Main {
    public static void main(String[] args) {


        Rede rede = new Rede();

        Router r1 = new Router("R1", "192.168.1.1", 4);
        Router r2 = new Router("R2", "192.168.2.1", 2);
        Switch sw1 = new Switch("SW1", "192.168.1.2", 8);
        PC pc1 = new PC("PC1", "192.168.1.10", "192.168.1.1");
        PC pc2 = new PC("PC2", "192.168.1.11", "192.168.1.1");

        rede.addRouter(r1);
        rede.addRouter(r2);
        rede.addSwitch(sw1);
        rede.addPC(pc1);
        rede.addPC(pc2);

        rede.mostrarRede();
        
    }
}