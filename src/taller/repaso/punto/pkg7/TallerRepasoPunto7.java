/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.repaso.punto.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class TallerRepasoPunto7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=(Integer.parseInt(JOptionPane.showInputDialog(null,"serie de fibonacci hasta:")));
        int b=0,c=1,f=0;
        String e ="";
        do{
           
            f=b+c;
            b=c;
            c=f;
            if(f<=a){
            
            e += f+"\n";
            
            }
        }
            
        while(f<=a);    
      
        JOptionPane.showMessageDialog(null,"0"+"\n"+"1"+"\n"+ e);
    }
    
}
