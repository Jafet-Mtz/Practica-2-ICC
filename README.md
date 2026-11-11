Esta práctica consiste en el desarrollo de un programa en Java orientado a la manipulación de fechas y la simulación de rendimientos financieros.
El proyecto se divide en dos clases principales diseñadas bajo los principios básicos de la programación orientada a objetos, implementando 
instrucciones condicionales, validaciones lógicas y documentación con formato Javadoc.

Clase ⁠Fecha⁠ (⁠Fecha.java⁠)
Encargada de modelar y manipular fechas del calendario, ofreciendo constructores sobrecargados para inicializar sin parámetros, con tres enteros (día, mes, año) o con dos enteros y una cadena para el mes. 
Incluye métodos para asignar y obtener campos individuales, calcular la diferencia exacta en días entre dos fechas, y realizar aritmética de fechas sumando o restando días (con soporte para incrementos positivos y negativos). 
Asimismo, permite determinar si dos fechas son iguales, traducir nombres de meses a su valor numérico y viceversa, calcular los días transcurridos en el año en curso, y representar la fecha bajo el formato estándar ⁠dd/mes/aaaa⁠.  
Clase ⁠TiempoDeInversion⁠ (⁠TiempoDeInversion.java⁠)
Contiene el método ⁠main⁠ para ejecutar una simulación interactiva en la terminal. 
Gestiona la interacción con el usuario solicitando su nombre y el monto inicial de inversión, captura y valida las fechas de inicio y fin, calcula automáticamente los días totales de duración utilizando la clase ⁠Fecha⁠, estimando y mostrando en pantalla el rendimiento financiero calculado a una tasa fija del 12%. 
Cuenta además con un ciclo de control para repetir la simulación según la decisión del usuario
