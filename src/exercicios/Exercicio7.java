package exercicios;

/**
 *[PAGANDO  MICO]  Escreva  um  programa  que  peça  um  número  ilimitado  
 * de  tipos  de  mico (prendas) ao  usuário.  Ao  terminar de  digitar  os  
 * micos  de sua  preferência,  o  usuário  deverá digitar SORTEAR  e  o  
 * programa  deverá  sortear  dentre  todos  os  micos  digitados  aquele  
 * que  o  usuário deverá pagar ficticiamente.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio7 {
   
    public static void main(String[] args) {
        
        Random sorteio = new Random(); 
        Scanner in = new Scanner(System.in);
        List<String> prendas = new ArrayList<>();
        String a;
        System.out.println("Digite as prendas");
        do{
            a = in.nextLine();
            prendas.add(a);            
        }while(!a.toUpperCase().equalsIgnoreCase("sortear"));
        prendas.remove(prendas.size()-1);
        System.out.println(prendas.get(sorteio.nextInt(prendas.size())));
    }
}
