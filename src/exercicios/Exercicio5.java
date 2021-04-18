package exercicios;

/**
 *[FRASES  EM  ORDEM]  Escreva  um  programa que  receba  cinco  frases 
 * do  usuário  e  as  armazene em uma  lista.  Ao  final,  o  programa  
 * deverá  mostrar   em  maiúsculas  uma  nova  frase  formada  do  início 
 * das cinco frases digitadas.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<String> frases = new ArrayList<>();
          
        for(int i=0; i<5; i++){
            frases.add(in.nextLine());
        }
        for(String i: frases){
            int a = i.indexOf(" ");
            System.out.print(i.substring(0, a).toUpperCase() + " ");
        }   
        System.out.println("");
    }
}
