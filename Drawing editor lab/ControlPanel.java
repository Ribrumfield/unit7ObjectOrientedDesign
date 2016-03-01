import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ControlPanel extends JPanel
{
    private JButton circlebutton;
    private JButton squarebutton;
    private JButton colorbutton;
    private DrawingPanel canvas;

    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;

        circlebutton = new JButton("Add Circle");
        squarebutton = new JButton("Add Square");
        colorbutton = new JButton ("Pick Color");

        this.add(colorbutton);
        this.add(circlebutton);
        this.add(squarebutton);

        ClickListener listener = new ClickListener();
        this.colorbutton.addActionListener( listener );
        this.circlebutton.addActionListener( listener );
        this.squarebutton.addActionListener( listener);       
    }

    public class ClickListener implements ActionListener
    {
        private int count;
        public ClickListener()
        {
            this.count = 0;
        }

        public void actionPerformed( ActionEvent event )
        {
            if (event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
            }
        }
    }
}