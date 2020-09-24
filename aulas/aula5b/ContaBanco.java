package aulas.aula5b;
import java.util.Scanner;

public class ContaBanco 
{
    
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos Especiais

    Scanner ler = new Scanner(System.in);

    public void Construtor()
    {

        saldo = 0;
        status = false;

    }

    public void setNumeroConta(int conta)
    {

        numeroConta = conta;

    }

    public int getNumeroConta()
    {

        return numeroConta;

    } 
    
    public void setTipo(String tipoDaConta)
    {

        tipo = tipoDaConta;

    }

    public String getTipo()
    {

        return tipo;

    }

    public void setDono(String cliente)
    {

        dono = cliente;

    }

    public String getDono()
    {

        return dono;

    }

    public void setSaldo(float reais)
    {

        saldo = reais;

    }

    public float getSaldo()
    {

        return saldo;

    }

    public void setStatus(boolean situacaoDaConta)
    {

        status = situacaoDaConta;

    }

    public boolean getStatus()
    {

        return status;

    }

    public void abrirConta(String tipoDaConta)
    {

        setTipo(tipoDaConta);
        setStatus(true);

        if(tipoDaConta == "CC")
        {

            setSaldo(50);

        }else if(tipoDaConta == "CP")
        {

            setSaldo(150);

        }

    }

    public void fecharConta()
    {
       if(saldo > 0)
       {

            System.out.println("Por favor saque o saldo de sua conta\n");

       }else if(saldo < 0)
       {

            System.out.println("Você possui débitos em sua conta, favor entrar em contato com o SAC\n");

       }else
       {

            setStatus(false);
            System.out.println("Conta Encerrada com sucesso!\n");

       }
    }

    public void depositar(float reais)
    {

        if(getStatus())
        {

            setSaldo(getSaldo() + reais);

        }else
        {
            System.out.println("Impossível depositar!\n");
        }

    }

    public void sacar(float reais)
    {

        if(getStatus())
        {

            if(getSaldo() > reais)
            {
                
                setSaldo(getSaldo() - reais);

            }else
            {

                System.out.println("Saldo Insuficiente! Você tentou sacar R$" + reais + " e seu saldo é de R$" + getSaldo());

            }
        }else
        {

            System.out.println("Impossível sacar\n");

        }

    }

    public void pagarMensalidade()
    {

        float mensalidade;

        if(getTipo() == "CC")
        {

            mensalidade = 12;

            if(getStatus())
            {

                if(getSaldo() > mensalidade)
                {

                    setSaldo(getSaldo() - mensalidade);
                }else
                {
                   
                    System.out.println("Saldo Insuficiente!\n");

                }

            }else
            {

                System.out.println("Conta inexistente!\n");

            }

        }else if(getTipo() == "CP")
        {

            mensalidade = 20;

            if(getStatus())
            {

                if(getSaldo() > mensalidade)
                {

                    setSaldo(getSaldo() - mensalidade);

                }else
                {
                   
                    System.out.println("Saldo Insuficiente!\n");

                }

            }else
            {

                System.out.println("Conta inexistente!\n");

            }

        }        

    }

}
