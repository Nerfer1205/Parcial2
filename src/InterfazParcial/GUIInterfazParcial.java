
package InterfazParcial;

import static java.awt.Color.GREEN;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIInterfazParcial extends JFrame implements ActionListener {

    ArrayList<String> Paises;
    String pais;
    private Persistencia a = new Persistencia();
    ArrayList<String> Resultados= new ArrayList<>();
    
    public GUIInterfazParcial(){
    
        setSize(580,150);
        setTitle("Calculadora Binaria");
        setLayout(null);
        setLocationRelativeTo(null);
        PanelBotones();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void PanelBotones(){
    
        JPanel Interfaz = new JPanel();
        
        Interfaz.setLayout(null);
        Interfaz.setSize(580,150);
        Interfaz.setBounds(0, 0, 600, 200);
        
        
        Paises = new ArrayList();
        Paises.add("China");
        Paises.add("Italia");
        Paises.add("España");
        Paises.add("Francia");
        Paises.add("EE.UU");
        Paises.add("Otro");
        
        int posx=15;
        int posy=10;
        for(int i=0;i<Paises.size();i++){
            
            JButton GeneralBotones = new JButton(Paises.get(i));
            GeneralBotones.addActionListener(this);
            GeneralBotones.setBounds(posx, posy, 85, 25);
            posx=posx+90;
            
            Interfaz.add(GeneralBotones);    
        }
        
        JButton Recomendaciones = new JButton("Ver recomendaciones");
        Recomendaciones.addActionListener(this);
        Recomendaciones.setBounds(75, 50, 175, 25);
        Interfaz.add(Recomendaciones);
        
        JButton Resultados = new JButton("Ver Resultados");
        Resultados.addActionListener(this);
        Resultados.setBounds(300, 50, 175, 25);
        Interfaz.add(Resultados);
        
        this.getContentPane().add(Interfaz);  
    }
            
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Ver recomendaciones")){
            GUIRecomendaciones Reco = new GUIRecomendaciones();
            Reco.setVisible(true);
            this.setVisible(false);
            
        }
        
        if (e.getActionCommand().equals("China")){
            try {
                pais = "China";
                Resultados.add(pais);
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (e.getActionCommand().equals("España")){
            pais = "España";
            Resultados.add(pais);
            try {
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getActionCommand().equals("Italia")){
            try {
                pais = "Italia";
                Resultados.add(pais);
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (e.getActionCommand().equals("EE.UU")){
            try {
                pais = "EE.UU";
                Resultados.add(pais);
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (e.getActionCommand().equals("Francia")){
            try {
                pais = "Francia";
                Resultados.add(pais);
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        if (e.getActionCommand().equals("Otro")){
            try {
                pais = "Otro";
                Resultados.add(pais);
                a.escribirArchivo(Resultados);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GUIInterfazParcial.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
         if (e.getActionCommand().equals("Ver Resultados")){
             GUIResultados Nueva = new GUIResultados();
             Nueva.setVisible(true);
             for (int i = 0; i < Resultados.size(); i++) {
                if("EE.UU".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.EEUU.getText());
                    cont++;
                    Nueva.EEUU.setText(Integer.toString(cont));                   
                }
                if("China".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.china.getText());
                    cont++;
                    Nueva.china.setText(Integer.toString(cont));                   
                }
                if("Italia".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.italia.getText());
                    cont++;
                    Nueva.italia.setText(Integer.toString(cont));                   
                }
                if("Francia".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.francia.getText());
                    cont++;
                    Nueva.francia.setText(Integer.toString(cont));                   
                }
                if("España".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.Espania.getText());
                    cont++;
                    Nueva.Espania.setText(Integer.toString(cont));                   
                }
                if("Otro".equals(Resultados.get(i))){
                    int cont=Integer.parseInt(Nueva.OTROS.getText());
                    cont++;
                    Nueva.OTROS.setText(Integer.toString(cont));                   
                }
             }
        }
    }
    
}
