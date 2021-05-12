/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio9;

import java.util.Scanner;

/**
 *
 * @author Computador
 */
public class Desafio9 {

    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
        double cac,cup,tot,cap;
        System.out.println("Quantos cupcake você vendeu?");
       cup=ler.nextDouble();
       
        System.out.println("quantos cacetinhos você vendeu?");
        cac = ler.nextDouble();
        tot=cac*1.50+cup*4.50;
       
        cap= tot * 0.20 ;
        
        System.out.println("Total vendido"+tot);
        System.out.println("Total capital de giro"+cap);
        
        
        
    }
    
}
