
package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;
    private int cantidad;
}
