import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by FckLove on 3/16/2016.
 */
public class Matrix extends JPanel {
    private int focus=0;
    private int num;
    private final int WIDTH=460,HEIGHT=510;
    private ArrayList<Light> listlight;
    public Matrix(int num)
    {
        addKeyListener(new KeyEventListener());
        setLayout(new MigLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        listlight=new ArrayList<Light>();
        this.num=num;
        for(int i=0;i<num*num;i++)
        {
            Light light=new Light(false);
            light.addMouseListener(new MouseEventListener());
            listlight.add(light);
        }
        for(int i=0;i<num*num;i++)
        {
            if((i+1)%num==0)
            {
                add(listlight.get(i),"wrap");
            }else
            {
                add(listlight.get(i));
            }
        }
        setFocusable(false);
        listlight.get(focus).setBackground(Color.GRAY);
    }
    ///
    private class KeyEventListener implements KeyListener{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode())
            {
                case KeyEvent.VK_UP:
                    if(focus>num-1)
                    {
                        listlight.get(focus).setBackground(Color.BLACK);
                        focus-=num;
                        listlight.get(focus).setBackground(Color.GRAY);
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if(focus<num*(num-1))
                    {
                        listlight.get(focus).setBackground(Color.BLACK);
                        focus+=num;
                        listlight.get(focus).setBackground(Color.GRAY);
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                   if(focus<num*num-1)
                    {
                        listlight.get(focus).setBackground(Color.BLACK);
                        focus+=1;
                        listlight.get(focus).setBackground(Color.GRAY);
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    if(focus>0)
                    {
                        listlight.get(focus).setBackground(Color.BLACK);
                        focus-=1;
                        listlight.get(focus).setBackground(Color.GRAY);
                    }
                    break;
                case KeyEvent.VK_ENTER:
                    listlight.get(focus).changeStatus();
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }
    }
    ///Mouse Action
    private class MouseEventListener implements MouseListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            listlight.get(focus).setBackground(Color.BLACK);
            for(int i=0;i<listlight.size();i++)
            {
                if(e.getSource()==listlight.get(i))
                {
                    focus=i;
                }
            }
            listlight.get(focus).setBackground(Color.GRAY);
            listlight.get(focus).changeStatus();
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }
    }
    ///Clear
    public void clear()
    {
        for(int i=0;i<listlight.size();i++)
        {
            listlight.get(i).setStatus(false);
        }
    }
    ///
    public void changeColor(Color color)
    {
        for(int i=0;i<listlight.size();i++)
        {
            listlight.get(i).setColor(color);
        }
    }

}
