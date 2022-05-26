package Models;
import java.util.Date;

/**
 * <h2>Empleado</h2>
 * {@code Empleado} es una subclase<br>
 * <p>
 * Esta clase pertenece a la familia de usuarios del sistema.<br>
 * Esta clase extiende de {@Usuario} *
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */
public class Empleado extends Usuario{
    private Integer legajo;


    public Empleado(String cuil, String nombre, String apellido, String domicilio, String telefono, String email, Date fechaAlta, Integer sucursalId, Integer legajo) {
        super(cuil, nombre, apellido, domicilio, telefono, email, fechaAlta, sucursalId);
        this.legajo = legajo;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
}
