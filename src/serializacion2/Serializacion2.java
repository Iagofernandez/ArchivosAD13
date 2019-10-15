
package serializacion2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serializacion2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
      String []codigo={"p1","p2","p3"};
      String []descricion={"botellas","chicles","pan"};
      double []precio={1.0,2.0,3.0};
        
    FileOutputStream escribir = new FileOutputStream("/home/oracle/Desktop/Eje12/productos.txt");
    ObjectOutputStream escribir1 = new ObjectOutputStream(escribir);
    
    for (int i=0; i < precio.length; i++){
        Productos producto = new Productos(codigo[i],descricion[i],precio[i]);
        
        escribir1.writeObject(null);
        escribir1.close();
        escribir.close();
        
    }
    }
    
}

class Productos implements Serializable{
    String codigo;
    String descricion;
    double precio;

    public Productos() {
        codigo ="";
        descricion = "";
        precio = 0;
        
        
    }

    public Productos(String codigo, String descricion, double precio) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", descricion=" + descricion + ", precio=" + precio + '}';
    }
    
    
    
    
}
