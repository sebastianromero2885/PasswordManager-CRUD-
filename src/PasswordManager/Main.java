/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordManager;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


/**
 *
 * @author Sebastián
 */
public class Main {
    
    public static void main(String[] args){
        
    Login login = new Login();
    
    
    
    } 
    
    
    public static void Mensaje(String mensaje,String titulo, String tipo_icono){
        Icon icono = new ImageIcon("src\\img\\advertencia.png");
        if(tipo_icono.equals("correcto")){
            icono = new ImageIcon("src\\img\\correcto.png");
        }
        else if(tipo_icono.equals("error")){
            icono = new ImageIcon("src\\img\\error.png");
        }

        UIManager UI=new UIManager();    
        UI.put("OptionPane.background",new ColorUIResource(51,51,51));
        UI.put("Panel.background",new ColorUIResource(51,51,51));
        UI.put("Button.background", new Color(102,102,255));
        UI.put("Button.foreground", Color.white);
        UI.put("Button.font", new Font("Roboto Light", 0, 14));
        UI.put("Button.focus", new ColorUIResource(new Color(102,102,255)));
            
  
        
        JLabel texto = new JLabel(mensaje);
        texto.setFont(new Font("Roboto Light", 0, 14));
        texto.setForeground(Color.white);
        JOptionPane.showMessageDialog(null, texto, titulo, JOptionPane.INFORMATION_MESSAGE, icono);
    }   

    
    
}
