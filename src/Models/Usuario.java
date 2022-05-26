package Models;

import java.util.Date;

/**
 * <h2>Usuario</h2>
 * {@code Usuario} es una clase abstracta <br>
 * <p>
 * Es una superclase correspondiente a la familia de usuarios del sistema. <br>
 * No es posible crear instancias de esta clase. *
 * <p>
 * @author AguirreFab
 * @version 1.0
 *
 */

public abstract class Usuario {
    protected String cuil;
    protected String nombre;
    protected String apellido;
    protected String domicilio;
    protected String telefono;
    protected String email;
    protected Date fechaAlta;
    protected Integer sucursalId;

    public Usuario(String cuil, String nombre, String apellido, String domicilio, String telefono, String email, Date fechaAlta, Integer sucursalId) {
        this.cuil = cuil;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.fechaAlta = fechaAlta;
        this.sucursalId = sucursalId;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }
}
