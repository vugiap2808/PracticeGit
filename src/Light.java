import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by FckLove on 3/16/2016.
 */
public class Light extends JPanel{
    private boolean status;
    final int SIZE =60;
    private Color color=Color.red;
    public Light(boolean status)
    {
        setPreferredSize(new Dimension(SIZE,SIZE));
        setBackground(Color.black);
        this.status=status;
    }
    ///
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);

        page.setColor(color);
        if(status)
        {
            page.fillOval(0,0,SIZE,SIZE);
        }
    }
    ///
    public boolean getStatus()
    {
        return status;
    }
    ///
    public void changeStatus()
    {
        if(status)
        {
            status=false;
        }else status=true;
    }
    //////
    public void setStatus(boolean status)
    {
        this.status=status;
    }
    ///
    public void setColor(Color color)
    {
        this.color=color;
    }

}
