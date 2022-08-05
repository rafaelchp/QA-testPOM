#language: es

Característica: Agregar al carrito

  Antecedentes:
    Dado  que el usuario se encuentre en el sitio web
    Cuando El usuario ingrese los datos de login

    Dado  que el usuario se encuentre en la pagina de inicio
    Cuando El usuario de clic en el boton de categorias

    Dado  que el usuario se encuentre en la categoria seleccionada
    Cuando El usuario de clic en el producto escogido

  Escenario: Agregar productos al carrito
    Dado  que el usuario se encuentre en el producto seleccionado
    Cuando El usuario escoja la cantidad de productos
    Y haga clic en el boton agregar al carrito
    Entonces visualizara un mensaje de carrito de compras