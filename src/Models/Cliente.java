package Models;
import java.util.Date;
import java.util.List;

/**
 * <h2>Cliente</h2>
 * {@code Cliente} es una subclase<br>
 * <p>
 * Esta clase pertenece a la familia de usuarios del sistema.<br>
 * Esta clase extiende de {@Usuario} *
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public class Cliente extends Usuario{

    private Integer id;
    private List<Cuenta> cuentas;


    public Cliente(String cuil, String nombre, String apellido, String domicilio, String telefono, String email, Date fechaAlta, Integer sucursalId, Integer id, List<Cuenta> cuenta) {
        super(cuil, nombre, apellido, domicilio, telefono, email, fechaAlta, sucursalId);
        this.id = id;
        this.cuentas = cuentas;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
}

