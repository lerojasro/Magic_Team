package com.example.EDS;

public class Empleado {
    private String nombreEmpleado;
    private Integer codigoEmpleado;
    private String cargo;
    private Integer telefono;
    private String correo;
    private String empresa;

    //Constructor

    public Empleado() {
    }

    public Empleado(String nombreEmpleado, Integer codigoEmpleado, String cargo, Integer telefono, String correo, String empresa) {
        this.nombreEmpleado = nombreEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.cargo = cargo;
        this.telefono = telefono;
        this.correo = correo;
        this.empresa = empresa;
    }

    //Getters and Setters

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public Integer getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Integer codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
