/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

import java.util.Scanner;
import operaciones.Division;
import operaciones.Resta;
import operaciones.Suma;

/**
 *
 * @author Yesica
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultadosuma, resultadoresta, resultadodiv, resultadomul;
        System.out.println("Ingrese primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingrese segundo numero");
        numero2 = sc.nextInt();
        resultadosuma = Suma.suma(numero1, numero2);
        resultadoresta = Resta.resta(numero1, numero2);
        resultadodiv=Division.division(numero1, numero2);
        System.out.println("resultado de la suma" + resultadosuma);
        System.out.println("resultado de la resta"+resultadoresta);
        System.out.println("resultado de la división"+resultadodiv);
        
    }
    
}
