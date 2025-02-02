/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u08439411111
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(valor);
        }
    }

   public static void limpar(JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            if (comp[i] instanceof JTextField){
            ((JTextField) comp[i]).setText("");
            }
            if (comp[i] instanceof JComboBox ){
            ((JComboBox) comp[i]).setSelectedIndex(-1);
            }
             if (comp[i] instanceof JCheckBox ){
            ((JCheckBox) comp[i]).setSelected(false);
            }
        }
    }
   
   // daqui pra baixo catei do dudu
    public static int strToInt(String cad) {
         try {
            return Integer.parseInt(cad);
         } catch (NumberFormatException e) {
            mostrar("Erro: não é possível converter '" + cad + "' para inteiro.");
            return 0;
         }
     }
     
     public static String intToStr (int num) {
         return String.valueOf(num);
     }
     
     public static double strToDouble(String cad) {
         try {
            return Double.parseDouble(cad);
         } catch (NumberFormatException e) {
            mostrar("Erro: não é possível converter '" + cad + "' para double.");
            return 0.0;
         }
     }
     
     public static String doubleToStr (double num) {
         return String.valueOf(num);
     }
     
     public static Date strToDate(String cad) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            
            try {
                return sdf.parse(cad);
            } catch (ParseException e) {
                mostrar("Erro: não é possível converter '" + cad + "' para data.");
                return null;
            }
     }
     
     public static String dateToStr (Date data) {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         return sdf.format(data);
     }
     
     public static void mostrar(String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
     }
     
     public static boolean perguntar(String mensagem) {
         int resposta = JOptionPane.showConfirmDialog(null, mensagem, "Confirmação", JOptionPane.YES_NO_OPTION);
         return resposta == JOptionPane.YES_OPTION;
     }

    public static String IntToStr(int idFuncionarioIar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
