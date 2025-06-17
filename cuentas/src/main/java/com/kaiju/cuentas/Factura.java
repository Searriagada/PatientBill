package com.kaiju.cuentas;

public class Factura
{
    private String id;
    private String numeroFactura;
    private String prestador;
    private String fechaEmision;
    private String totalFactura;

    public Factura(String id, String numeroFactura, String prestador, String fechaEmision, String totalFactura) {
        this.id = id;
        this.numeroFactura = numeroFactura;
        this.prestador = prestador;
        this.fechaEmision = fechaEmision;
        this.totalFactura = totalFactura;
    }

    public Factura() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getPrestador() {
        return prestador;
    }

    public void setPrestador(String prestador) {
        this.prestador = prestador;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(String totalFactura) {
        this.totalFactura = totalFactura;
    }
}
