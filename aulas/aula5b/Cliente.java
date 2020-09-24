package aulas.aula5b;

public class Cliente 
{

    public static void main(String[] args) 
    {
        
        ContaBanco cliente1 = new ContaBanco();

        cliente1.abrirConta("CC");        
        cliente1.depositar(150);
        System.out.println("\nSaldo da conta corrente é de: " + cliente1.getSaldo() + "\n");
        cliente1.sacar(40);
        System.out.println("\nSaldo da conta corrente é de: " + cliente1.getSaldo() + "\n");
        cliente1.pagarMensalidade();
        System.out.println("\nSaldo da conta corrente é de: " + cliente1.getSaldo() + "\n");
        //cliente1.fecharConta();

    }

}
