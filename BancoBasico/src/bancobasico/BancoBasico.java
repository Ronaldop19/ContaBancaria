package bancobasico;
public class BancoBasico {  
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(4598);
        p1.setDono("Ronaldo");
        p1.abrirConta("CP");
      
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1647);
        p2.setDono("Maria");
        p2.abrirConta("CC");
        p2.sacar(20);
        p1.estadoAtual();
        p2.estadoAtual();
        
    }
    
}
