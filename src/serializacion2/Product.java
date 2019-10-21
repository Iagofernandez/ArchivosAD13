
package serializacion2;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Product implements Serializable{
    String codigo;
    String descricion;
    double precio;

    

    public Product(String codigo, String descricion, double precio) {
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
