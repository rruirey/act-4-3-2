package modelo;

import java.sql.Connection;

public interface ConexionGenerica {
  Connection getConexion();

  void cerrarConexion();
}
