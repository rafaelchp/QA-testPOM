#language: es

Característica: Seleccion de Producto

  Antecedentes:
    Dado  que el usuario se encuentre en el sitio web
    Cuando El usuario ingrese los datos de login

    Dado  que el usuario se encuentre en la pagina de inicio
    Cuando El usuario de clic en el boton de categorias

  Escenario: seleccion de varios productos
    Dado  que el usuario se encuentre en la categoria seleccionada
    Cuando El usuario de clic en el producto escogido
    Entonces el usuario visualizara los detalles del producto
