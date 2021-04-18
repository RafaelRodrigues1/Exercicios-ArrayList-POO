package exercicios;

/**
 *[MENU DE OPÇÕES PARA FRASES] Escreva um programa que ofereça o seguinte menu ao usuário:  
 * MENU DE OPÇÕES – CADASTRO DE FRASES: 
 * (Frases cadastradas até o momento: 0 )   1) Cadastrar nova frase 
 * 2) Excluir Frase Cadastrada 3) Modificar Frase Cadastrada 
 * 4) Visualizar Frase 5) SAIR
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import metodosexercicio10.Metodos;


public class Exercicio10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<String> listaFrases = new ArrayList<>();
        int menu;
        int numFrases = 0;
        do{
            System.out.println("--------------MENU CADASTRO DE FRASES--------------\n"
                    + "frases cadastradas até o momento: " + numFrases +
                    "\n\n1) Cadastrar nova frase\t\t2) Excluir frase\n"
                            + "3) Modificar frase \t\t4) Visualizar todas as frases\n"
                            + "5) SAIR\n");
            menu = in.nextInt();
            in.nextLine();
            switch(menu){
                case 1 -> {
                    listaFrases.add(Metodos.menuAdd());
                    numFrases++;
                }
                case 2 -> {                    
                    Metodos.mostraFrases(listaFrases);
                    listaFrases.remove(Metodos.menuRemove()-1);
                    numFrases--;
                }
                case 3 -> {
                    Metodos.mostraFrases(listaFrases);
                    int i = Metodos.menuModifica();
                    listaFrases.remove(i-1);
                    System.out.println("Digite a alteração na frase " + (i));
                    listaFrases.add(i-1, in.nextLine());
                }
                case 4 -> {
                    Metodos.mostraFrases(listaFrases);                    
                }
                case 5 -> {
                    System.out.println("Saindo do programa");
                }
                default -> System.out.println("Digite uma opção válida!"); 
            }
            
        }while(menu!=5);
        
        
        
    }
}
