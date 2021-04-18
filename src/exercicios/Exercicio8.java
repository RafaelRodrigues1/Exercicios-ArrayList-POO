package exercicios;

/**
 *Crie  um   programa  que  seja  capaz  de  cadastrar  5  contatos.
 *Para  tal,  é necessário criar um ArrayList tipado para a classe Contato.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import classeexercicio8.Contato;

public class Exercicio8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Contato> listaContatos = new ArrayList<>();
        
        for(int i=0; i<5; i++){
            System.out.printf("Insira o dados do %d° contato\n", (i+1));
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Telefone: ");
            String telefone = in.nextLine();
            System.out.print("Celular: ");
            String celular=in.nextLine();
            System.out.print("E-mail: ");
            String email=in.nextLine();
            listaContatos.add(new Contato(nome, telefone, celular, email));
        }
        for(Contato i: listaContatos){
            System.out.println(i.toString());
        }
        
    }
}
