package NetworkProject;

public class Rede{
    private Router[] routers = new Router[10];
    private Switch[] switches = new Switch[10];
    private PC[] pcs = new PC[10];

    private int countRouter = 0;
    private int countSwitch = 0;
    private int countPc = 0;

    public void addRouter(Router r){
        if (countRouter < routers.length){
            routers[countRouter] = r;
            countRouter++;
        } else{
            System.out.println("Quantidade máxima de routers atingida.");
        }

    }
    public void addSwitch(Switch s){
        if (countSwitch < switches.length){
            switches[countSwitch] = s;
            countSwitch++;
        } else{
            System.out.println("Quantidade máxima de switches atingida-");
        }

    }
    public void addPC(PC p){
        if ( countPc < pcs.length){
            pcs[countPc] = p;
            countPc++;
        } else{
            System.out.println("Quantidade máxima de Pcs atingida.");
        }

    }

    public void mostrarRede(){
        System.out.println("ROUTERS:");
        for(int i = 0; i< countRouter ; i++){
            routers[i].info();
        }
        System.out.println("SWITCHES:");
        for(int i = 0; i < countSwitch; i++){
            switches[i].info();
        }
        System.out.println("PCs:");
        for(int i = 0; i < countPc; i++){
            pcs[i].info();
        }
    }
}
