/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Daniel Arias
 */
public class img {
    private ImageIcon icon;
    private Dimension dimension;
    private Image img;
    
    public img(){
    }
    
    public ImageIcon img(String url,JLabel label){
        icon = new ImageIcon(url);
        dimension = label.getSize();
        
        img = icon.getImage();
        img = img.getScaledInstance(dimension.width,dimension.height,java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        return icon;
    }
    
    public ImageIcon img(String url,JLabel label,int width,int height){
        icon = new ImageIcon(url);
        dimension = label.getSize();
        
        img = icon.getImage();
        if(width > 0 && height > 0){
            img = img.getScaledInstance(width,height,java.awt.Image.SCALE_SMOOTH);
        } else{
            if(width > 0 && height == 0){
                img = img.getScaledInstance(width,dimension.height,java.awt.Image.SCALE_SMOOTH);
            }else{
                if(width == 0 && height > 0){
                    img = img.getScaledInstance(dimension.width,height,java.awt.Image.SCALE_SMOOTH);
                }
            }
        }
        icon = new ImageIcon(img);
        return icon;
    }
}
