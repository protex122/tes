package dummy;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Unit {
    JLabel lblUnit;
    
    Job j;

    public Unit() {
        this.lblUnit = new JLabel();
        ImageIcon im = new ImageIcon("image/walk/archerwalkdown1.png");
        Image image = im.getImage(); 
        Image newimg = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        im = new ImageIcon(newimg); 
        this.lblUnit = new JLabel(im);
        this.lblUnit.setBounds(500,500,55,55);
        
    }
    
    public void setJob(int ket){
        if(ket == 1){
            j = new Archer();
            JOptionPane.showMessageDialog(null, j.getClass().getSimpleName());
        }
        else if(ket == 2){
            j = new Priest();
            JOptionPane.showMessageDialog(null, j.getClass().getSimpleName());
        }
    }
    
}
