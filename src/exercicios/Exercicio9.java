package exercicios;

/**
 *[LISTA DE SUPERMERCADO] Crie um programa que dê ao usuário a opção de cadastrar 
 * itens que o mesmo almeja comprar em sua ida ao supermercado. 
 * Para tal, o programa deverá possibilitar que o  usuário  vá  digitando,  
 * infinitamente,  nomes  de  produtos  na  l ista.  A  cada  ENTER,  
 * os  produtos deverão ser armazenados na primeira posição da lista.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import classeexercicio9.Produto;

public class Exercicio9 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Produto> listaProduto = new ArrayList<>();
        System.out.println(listaProduto.toString());
        
        System.out.println("Digite os itens e suas quantidades");
        String nome;
        do{
            int i=1;
            System.out.print("ITEM: ");
            nome = in.nextLine();
            System.out.print("QUANTIDADE: ");
            int quantidade = in.nextInt();
            in.nextLine();
            if(nome.equalsIgnoreCase("EXCLUIR")){
                if(!listaProduto.isEmpty()){
                    System.out.println("Item " + listaProduto.get(0).getNome() + " excluído");
                    listaProduto.remove(0);
                }else{
                    System.out.println("A lista está vazia, impossível excluir!");
                }                
            }else if(nome.equalsIgnoreCase("ZERAR")){
                System.out.println("Tem certeza que deseja excluir todos os itens?[S/N]");
                String resp = in.nextLine();
                if(resp.equalsIgnoreCase("S")){
                    System.out.println("Lista zerada!");
                    listaProduto.removeAll(listaProduto);                    
                }else{}
            }else{
                listaProduto.add(0, new Produto(nome, quantidade));
            }
        }while(!nome.equalsIgnoreCase("Fim da lista"));
        listaProduto.remove(0);
        for(Produto i: listaProduto){
            System.out.println(i);
        }        
    }
}
