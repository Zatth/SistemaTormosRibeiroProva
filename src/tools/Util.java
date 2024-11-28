/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
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

}
