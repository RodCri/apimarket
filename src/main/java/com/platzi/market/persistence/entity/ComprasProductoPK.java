package com.platzi.market.persistence.entity;

import java.io.Serializable;
import jakarta.persistence.*;

// Porque la vamos a embeber en la clase comprasProducto
@Embeddable
public class ComprasProductoPK implements Serializable {
  // indicamos la forma en la cual se encuentra en la BD
  @Column(name = "id_compra")
  private Integer idCompra;

  @Column(name = "id_producto")
  private Integer idProducto;

  public Integer getIdCompra() {
    return idCompra;
  }

  public void setIdCompra(Integer idCompra) {
    this.idCompra = idCompra;
  }

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }
}
