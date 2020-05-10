package ex02_MediaTestes;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author LEWIS
 */
public class MediaTestes {
    public static void main(String[] args){
        float t1, t2, t3, md;
        DecimalFormat df = new DecimalFormat(".00");
        
        t1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do teste 1"));
        t2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do teste 2"));
        t3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota do teste 3"));
        
        md = (t1+t2+t3)/3;
        
        JOptionPane.showMessageDialog(null, "Teste 1: " + t1 + "\nTeste 2: " + t2 + "\nTeste 3: " + t3 + 
                "\nMedia: " + df.format(md), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
