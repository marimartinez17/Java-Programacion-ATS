package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public Ventana(){

        // Establecer título
        setTitle("Lavadito");

        //Establecer tamaño y posicion de la ventana (al centro)
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(800, 500));

        //Establecer color de fondo
        this.getContentPane().setBackground(Color.LIGHT_GRAY);

        iniciarComponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //creacion de un panel
    private void iniciarComponentes(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        this.getContentPane().add(panel1);

        //Crear etiqueta centrada horizontalmente y anclada arriba
        JLabel etiqueta = new JLabel();
        etiqueta.setText("AUTOLAVADO LAVADITO C.A.");
        etiqueta.setBounds(20, 20, 300, 30);
        etiqueta.setHorizontalAlignment(SwingConstants.HORIZONTAL);
        etiqueta.setVerticalAlignment(SwingConstants.CENTER);
        etiqueta.setForeground(Color.WHITE);
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.BLUE);
        etiqueta.setFont(new Font("arial",Font.BOLD,20));
        panel1.add(etiqueta);
    }
    
    Button 
}
