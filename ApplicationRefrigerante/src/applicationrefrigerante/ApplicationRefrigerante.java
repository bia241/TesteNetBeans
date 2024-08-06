
package applicationrefrigerante;

import java.util.Scanner;

/**
 *
 * @author beatriz.lreis
 */
public class ApplicationRefrigerante {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Olá, seja bem-vinde á página promocional do Refril!");
        
        System.out.println("Digite a quantidade desejada de refrigerantes:");
        int quant = ler.nextInt();
        
        double valor, total;
        
        valor = 4.99;
        
        if(quant >= 8){
            valor = 4.19;
        }
        
        total = quant * valor;
        
        System.out.printf("Valor total: %.2f %n", total);
        
        ler.close();
    }
    
}
