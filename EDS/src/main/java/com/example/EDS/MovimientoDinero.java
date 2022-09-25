package com.example.EDS;

public class MovimientoDinero {
    private Integer valorMovimiento;
    private String nombreMovimiento;
    private String codigoMovimiento;
    private String tipoMovimiento;

    //Constructor

    public MovimientoDinero() {
    }

    public MovimientoDinero(Integer valorMovimiento, String nombreMovimiento, String codigoMovimiento, String tipoMovimiento) {
        this.valorMovimiento = valorMovimiento;
        this.nombreMovimiento = nombreMovimiento;
        this.codigoMovimiento = codigoMovimiento;
        this.tipoMovimiento = tipoMovimiento;
    }

    //Getters and Setters

    public Integer getValorMovimiento() {
        return valorMovimiento;
    }

    public void setValorMovimiento(Integer valorMovimiento) {
        this.valorMovimiento = valorMovimiento;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }

    public String getCodigoMovimiento() {
        return codigoMovimiento;
    }

    public void setCodigoMovimiento(String codigoMovimiento) {
        this.codigoMovimiento = codigoMovimiento;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
}
