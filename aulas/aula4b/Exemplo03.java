package aulas.aula4b;

public class Exemplo03 
{

    public static void main(String[] args)
    {

        Caneta c1 = new Caneta("BIC", "Amarelo", 0.4f);

        c1.status();

        Caneta c2 = new Caneta("Compactor", "Roxo", 0.8f);
        System.out.println("\n");
        c2.status();
        
        /*c1.setModelo("BIC");
        c1.setPonta(0.5f);
        System.out.println("\nTenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta() + "\n");
        */
    }
    
}
