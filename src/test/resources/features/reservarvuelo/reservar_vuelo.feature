#language: es
  #Autor: Stiven Hernandez

Característica: Aerolinea Despegar - reservar vuelo
  Yo como usuario de Despegar
  Quiero ingresar al sitio web y reservar un vuelo
  Para viajar a mi sitio de destino

  @ReservarVueloMedellinBogota
  Esquema del escenario: reserva de vuelo y validar pagina de metodos de pago
    Dado que el usuario se encuentra en la pagina de inicio de Despegar
    Cuando el realiza el proceso para reservar un vuelo
      | origen   | destino   | validacion   |
      | <origen> | <destino> | <validacion> |
    Entonces el visualizara la pagina de metodos de pagos
    Ejemplos:
      | origen                         | destino                        | validacion       |
      | MMedellín, Antioquia, Colombia | BBogotá, Bogotá D.C., Colombia | Detalle del pago |