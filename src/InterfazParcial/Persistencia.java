/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazParcial;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mile1
 */
public class Persistencia {
    public void escribirArchivo(String pais) throws FileNotFoundException{
         DataOutputStream salida= new DataOutputStream(new FileOutputStream("paises.txt"));
        try {
            salida.writeChars(pais);
        } catch (IOException ex) {
        }
    }
    public ArrayList<String> leerArchivo() throws FileNotFoundException{
        ArrayList<String> obj1 = new ArrayList<>();
        try {
            ObjectInputStream entrada=new ObjectInputStream(new FileInputStream("paises.txt"));
            obj1=(ArrayList<String>)entrada.readObject();
        } catch (IOException ex) {
           
        } catch (ClassNotFoundException ex) {
        }
        return obj1;
    }

    void escribirArchivo(ArrayList<String> Resultados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
