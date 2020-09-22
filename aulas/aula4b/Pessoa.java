package aulas.aula4b;

public class Pessoa 
{

    private String filho;
    private String pais;
    private String avos;

    public Pessoa(String nome_filho, String nome_pais, String nome_avos)
    {

        this.filho = nome_filho;
        this.pais = nome_pais;
        this.avos = nome_avos;

    }

    public void status()
    {

        System.out.println("\nNome do filho: " + this.filho);
        System.out.println("\nNome do pai/mãe: " + this.pais);
        System.out.println("\nNome do avô: " + this.avos + "\n");

    }
    
}
