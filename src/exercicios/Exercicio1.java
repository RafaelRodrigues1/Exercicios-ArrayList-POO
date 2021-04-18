package exercicios;

/**
 * [INTRODUÇÃO  A  ARRAYLISTS]Escreva  um  programa  que  adote  um
 * ArrayList  como  est rutura padrão  de  armazenamento  de  dados.  
 * O  programa  deverá  cadastrar  (sem  interação  do  usuário), 
 * 10  valores  de  qualquer  tipo  dentro  da  lista  (String,  int,  char,  double,  etc).
 * Ao  final,  o  programa deverá mostrar os valores cadastrados.
 * @author RafaelRodrigues1
 */
import java.util.ArrayList;
import java.util.List;


public class Exercicio1 {

    public static void main(String[] args) {

        List<Object> cadastro = new ArrayList<>();
        cadastro.add(0);
        cadastro.add("String");
        cadastro.add('c');
        cadastro.add('h');
        cadastro.add('a');
        cadastro.add('r');
        cadastro.add(4.539);
        cadastro.add(true);
        cadastro.add(false);
        cadastro.add("fim");
        System.out.println(cadastro.toString());
    }
    
}
