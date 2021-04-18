package exercicios;

/**
 * Escreva um programa que receba  cinco  nomes  diferentes  do  usuário. 
 * Todos os nomes deverão ser armazenados  em  um  ArrayList   tipado  para  Strings.  
 * O programa deverá  mostrar  os  nomes  cadastrados  em  ordem  inversa  
 * a qual  foram  cadastrados,  ou  seja,  do último para o primeiro.
 * @author RafaelRodrigues1
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();
        
        for(int i=0; i<5; i++){
        listaNomes.add(in.nextLine());
        }
        
        for(int i=listaNomes.size()-1; i>=0; i--){
            System.out.println(listaNomes.get(i));
        }
    }
}
