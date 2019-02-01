package lab3;

import java.util.*;

public class Proyecto {

    private String nombre;
    private Empresa empresa;
    private String precio;
    private String estado;
    private String descripcion;
    private Date fecha_inicio;
    private Date fecha_entrega;

    public Proyecto() {
    }

    public Proyecto(String nombre, Empresa empresa, String precio, String estado, String descripcion, Date fecha_inicio, Date fecha_entrega) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_entrega = fecha_entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", empresa=" + empresa + ", precio=" + precio + ", estado=" + estado + ", descripcion=" + descripcion + ", fecha_inicio=" + fecha_inicio + ", fecha_entrega=" + fecha_entrega + '}';
    }

}
