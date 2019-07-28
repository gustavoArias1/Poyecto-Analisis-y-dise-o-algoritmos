package Procesos;
import java.awt.Graphics;
import javax.swing.*;
public class Mundo extends javax.swing.JPanel {
    private ImageIcon inicio = new ImageIcon(getClass().getResource("../Imagenes/Inicio.jpg")); 
    public Mundo() {
        initComponents();  
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);        
        g.drawImage(inicio.getImage(), 0, 0, this.getSize().width, this.getSize().height, this);
        repaint();
    }
    
    public void NuevaImagen(String nombre)
    {
        inicio = new ImageIcon(getClass().getResource("../Imagenes/" + nombre));
        this.setSize(1100, 750);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
