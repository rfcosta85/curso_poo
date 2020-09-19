package aulas.aula2b;

public class Caneta 
{

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status()
    {

        System.out.print("\n\nModelo: " + this.modelo);        

        System.out.print("\n\nUma caneta " + this.cor); //É auto referência. Quem chamou o método, será substituído pelo this.

        System.out.print("\n\nPonta: " + this.ponta);

        System.out.print("\n\nCarga: " + this.carga);

        System.out.print("\n\nEstá tampada? " + this.tampada + "\n\n");

    }

    void rabiscar()
    {

        if(this.tampada == true)
        {

            System.out.println("ERRO! Não posso rabiscar\n\n");

        }else
        {

            System.out.println("Estou Rabiscando\n\n");

        }

    }

    void tampar()
    {

        this.tampada = true; //O this é o nome do objeto que chamou. Aqui temos o c1 no exemplo01. Assim ao chamar o método no exercício, o this seria substituído por c1.tampada; Assim o this é uma referência ao próprio objeto que o chamou.

    }

    void destampar()
    {

        this.tampada = false;

    }
    
}
