import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by FckLove on 3/16/2016.
 */
public class LightMatrixPanel extends JPanel {
    private final int WIDTH=460,HEIGHT=510;
    private Matrix mt;
    //private JButton bt_clear,bt_changecolor;
    public LightMatrixPanel()
    {
        setLayout(new MigLayout());
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        setBackground(Color.LIGHT_GRAY);
        JLabel lb_tit=new JLabel("LIGHT MATRIX");
        JPanel TitlePanel=new JPanel();
        TitlePanel.add(lb_tit);
        TitlePanel.setBackground(Color.YELLOW);
        TitlePanel.setPreferredSize(new Dimension(WIDTH,30));
        add(TitlePanel, "align center,span,wrap 5");

        /*bt_clear=new JButton("Clear");
        bt_clear.addActionListener(new ButtonListener());
        add(bt_clear,"align right");

        bt_changecolor=new JButton("Change Color");
        bt_changecolor.addActionListener(new ButtonListener());
        add(bt_changecolor, "align left,wrap 10");*/

        mt=new Matrix(7);
        mt.setFocusable(true);
        add(mt,"span,wrap 10");
    }
    /*
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==bt_clear)
            {
                mt.clear();
            }
            if(e.getSource()==bt_changecolor)
            {
                mt.changeColor(chooseColor());
            }
            repaint();
            mt.setFocusable(true);
        }
    }
    *///
    /*private Color chooseColor()
    {
        String[] listcolor ={"Red","Blue","Yellow","White"};
        String color=(String) JOptionPane.showInputDialog(null,"Choose a color","Choose",JOptionPane.PLAIN_MESSAGE,null,listcolor,"Red");
        if(color.equals("Red"))
        {
            return Color.RED;
        }else{
            if(color.equals("Blue"))
            {
                return Color.BLUE;
            }else{
                if(color.equals("Yellow"))
                {
                    return Color.YELLOW;
                }else return Color.WHITE;
            }
        }
    }*/

}
