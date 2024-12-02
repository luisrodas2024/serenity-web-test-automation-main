@RealizarAcciones
Feature: Registrar un usuario

  @RegistrarUsuario @HappyPath
  Scenario Outline: Registrar de manera existosa a un usuario con credenciales validas
    Given el usuario esta en la pagina de inicio
    And selecciona el boton de registro
    And ingresa un nombre de usuario "<username>" y contrasenia "<password>"
    When selecciona el boton registrar
    Then se realiza el registro de manera exitosa

    Examples:
      | username    | password |
      | usuarioqwer | pass123  |


  @RegistrarUsuario2 @HappyPath
  Scenario Outline: Registrar un usuario
    Given el usuario esta en la pagina de inicio
    When se registra con un nombre de usuario "<username>" y contrasenia "<password>"
    Then se realiza el registro de manera exitosa

    Examples:
      | username    | password |
      | usuarioqwerq | pass123  |
  @LogearUsuario @HappyPath
    Scenario Outline: Iniciar Sesión
    Given el usuario esta en la pagina de inicio
    When inicia sesion con un nombre de usuario "<username>" y contraseña "<password>"
    Then se realiza el inicio de sesión de manera exitosa
    Examples:
    |username   |password|
    |usuarioqwer|pass123 |

  @AgregarAlCarrito @HappyPath
    Scenario Outline:  Agregar un producto al carrito
    Given el usuario esta en la pagina de inicio
    When selecciona un producto "<producto>"
    Then el producto se agrega al carrito
    And se captura el mensaje de la alerta
    Examples:
    |producto|
    |Nokia lumia 1520|
