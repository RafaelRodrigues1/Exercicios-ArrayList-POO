package exercicios;

/**
 *[LISTA DE INTEIROS] Escreva um programa que cadastre em uma lista numérica
 * de valores inteiros 10 números inteiros aleatórios entre 10 e 100. 
 * Ao final, o programa deverá detectar na lista qual o maior número inteiro 
 * sorteado e mostra-lo ao usuário. 
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        for(int i=0; i<10; i++){
            listaNumeros.add((int)(10+Math.random()*90));
        }
        System.out.println(listaNumeros.toString());
        int maior = Integer.MIN_VALUE;
        for(Integer i: listaNumeros){
            if(i>maior){
                maior=i;
            }
        }
        System.out.println("O maior número é: " + maior);
    }
}
