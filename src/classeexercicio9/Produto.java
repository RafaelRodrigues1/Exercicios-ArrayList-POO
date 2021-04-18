package classeexercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Produto {
    
    private String nome;
    private Integer quantidade;

    public Produto(String nome, Integer quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }        
    
    @Override
    public String toString(){
        return "Produto:\t" + this.nome +
                "\nQuantidade:\t" + this.quantidade + "\n";
    }
}
