
package com.mycompany.operacoes;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author LEWIS
 */
public class Operacoes {
    public static void main(String[] args){
        int n1, n2;
        float rq1, rq2;
        long mult;
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo numero"));
        
        mult = n1*n2;
        rq1 = (float) Math.sqrt(n1);
        rq2 = (float) Math.sqrt(n2);
        
        JOptionPane.showMessageDialog(null, "Primeiro numero: " + n1 + "\nSegundo numero: " + n2 + "\nMultiplicação: " + mult
        + "\nRaiz de n1: " + df.format(rq1) + "\nRaiz de n2: " + df.format(rq2), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
