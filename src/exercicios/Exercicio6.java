package exercicios;

/**
 *Escreva  um  programa  que  permita  ao  usuário  cadastrar, 
 * no máximo,  6  números  inteiros  DIFERENTES  em  uma  lista  
 * (cada  número  em  uma  posição).  O programa não poderá permitir 
 * que números já cadastrados sejam inseridos na lista.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        
        for(int i=0; i<6; i++){
            System.out.printf("Digite o %d° número: ", (i+1));
            int a = in.nextInt();
            if(!listaNumeros.contains(a)){
                listaNumeros.add(a);
            }else{
                System.out.println("Opção inválida");
                i--;
            }
        }
        System.out.println(listaNumeros.toString());
    }
}
