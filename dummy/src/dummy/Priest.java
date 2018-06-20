package dummy;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Priest extends Job{
    JLabel lblUnit;

    public Priest() {
        this.lblUnit = new JLabel();
        ImageIcon im = new ImageIcon("image/walk/priestwalkdown1.png");
        Image image = im.getImage(); 
        Image newimg = image.getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        im = new ImageIcon(newimg); 
        this.lblUnit = new JLabel(im);
        this.lblUnit.setBounds(500,500,55,55);
    }
    
}
