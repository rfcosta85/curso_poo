package aulas.aula6b;

public class Exemplo06 
{

    public static void main(String[] args)
    {

        ControleRemoto remoteControl = new ControleRemoto();

        System.out.println("");
        remoteControl.ligar();
        remoteControl.maisVolume(); 
        remoteControl.play();       
        remoteControl.abrirMenu();
        remoteControl.fecharMenu();
        System.out.println("\n");

    }
    
}
