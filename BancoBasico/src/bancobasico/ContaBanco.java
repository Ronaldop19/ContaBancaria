package bancobasico;
     //atributos
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
        //metodos
    public void estadoAtual(){
        System.out.println("_____________________________");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        if (this.getStatus() == false) {
            System.out.println("Status da conta: fechada");            
        } else {
            System.out.println("Status da conta: aberta");
        }
        System.out.println("-----------------------------");
        
    }
    
    public void abrirConta(String t){    
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)){  
                this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, ainda há dinheiro");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada, há débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de" + this.getDono());
        } else {
            System.out.println("Conta inexistente");
        }
        
    }
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso!");
        } else {
                System.out.println("Saldo insuficiente para saque!");
            }          
        } else {
             System.out.println("Conta fechada, impossível sacar.");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }  else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }
                //METODOS ESPECIAIS
    
       //método construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
       // getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
  }
