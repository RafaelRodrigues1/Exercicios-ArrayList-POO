package exercicios;

/**
 *[REMOVENDO  DADOS]  Escreva  um  programa  que  contenha  uma  
 * lista  com  5  nomes  pré-cadastrados.  
 * O  programa  deverá  dar  ao  usuário  a  opção  de  excluir  
 * um  único  nome  da  lista ,  com valores entre 1 e 5.
 * @author RafaelRodrigues1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Michelangelo");
        listaNomes.add("Rafael");
        listaNomes.add("Donatelo");
        listaNomes.add("Leonardo");
        listaNomes.add("Splinter");
        
        System.out.println("Qual dos nomes abaixo, você deseja excluir?\n");
       
        for(String i: listaNomes){
            System.out.println((listaNomes.indexOf(i)+1) + ". " + i);
        }
        int num=0;
        do{
            num = in.nextInt();
            switch(num){
                case 1 -> listaNomes.remove(num-1);
                case 2 -> listaNomes.remove(num-1);
                case 3 -> listaNomes.remove(num-1);
                case 4 -> listaNomes.remove(num-1);
                case 5 -> listaNomes.remove(num-1);
                default -> System.out.println("Opção inválida\nTente novamente");
            }
        }while(num<1 || num>5);
        
        for(String i: listaNomes){
            System.out.println((listaNomes.indexOf(i)+1) + ". " + i);            
        }
    }
}
