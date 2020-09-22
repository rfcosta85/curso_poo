package aulas.aula4b;

public class Caneta 
{
 
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p) // Este é o método construtor
    {

        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
        //this.cor = "Azul";

    }

    public String getModelo()
    {
        return this.modelo;

    }

    public void setModelo(String m)
    {

        this.modelo = m;

    }

    public float getPonta()
    {

        return this.ponta;

    }

    public void setPonta(float p)
    {

        this.ponta = p;

    }

    public void tampar()
    {

        this.tampada = true;

    }

    public void destampar()
    {

        this.tampada = false;

    }

    public void status()
    {

        System.out.println("\nSOBRE A CANETA: ");
        System.out.println("\nModelo: " + this.getModelo());
        System.out.println("\nPonta: " + this.getPonta()); 
        System.out.println("\nCor: " + this.cor);   
        System.out.println("\nTampada: " + this.tampada + "\n");    

    }
    
}
