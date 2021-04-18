/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosexercicio10;

import java.util.List;
import java.util.Scanner;
/**
 *
 * @author RafaelRodrigues1
 */
public class Metodos {
    
    public static void mostraMenu(int numFrases){
        System.out.println("/tMENU CADASTRO DE FRASES\n"
                    + "(frases) cadastradas até o momento: " + numFrases +
                    "\n1) Cadastrar nova frase\t\t2) Excluir frase\n"
                            + "3) Modificar frase \t\t4) Visualizar frase\n"
                            + "5) SAIR");                 
    }
    
    public static String menuAdd(){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nova frase");
        return in.nextLine();
    }
    
    public static int menuRemove(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número referente a frase que deseja excluir");
        return in.nextInt();
    }
    
    public static int menuModifica(){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número referente a frase que deseja modificar");
        return in.nextInt();       
    }
    
    
    public static void mostraFrases(List<String> listaFrases){
        int c = 1;
        for(String i: listaFrases){
            System.out.println(c + ". " + i);
            c++;
        }
    }
    
}
