PRACTICA 2 ICC

Objetivo
El objetivo de esta practica es que el alumno ejercite la teoria acerca del uso y aplicacion
de las instrucciones condicionales dentro de un programa, asi como de la creacion y uso de
objetos de clases existentes.

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

Compilación de las clases
Debes compilar ambos archivos fuente (⁠Fecha.java⁠ y ⁠TiempoDeInversion.java⁠) utilizando el compilador de Java (⁠javac⁠), indicando la ruta del directorio de salida para mantener la estructura de paquetes

Una vez compilado correctamente el código, ejecuta el método principal (⁠main⁠) contenido en la clase ⁠TiempoDeInversion⁠ llamando al paquete y a la clase correspondiente

UN ejemplo seria esta inversion, y asi compilaria al momento de usar mi codigo 

Ingrese el nombre del inversionista: Jafet 
Monto a invertir ($): 15000
Ingrese la fecha de inicio (día, mes, año):
10 02 2028 
Ingrese la fecha de fin (día, mes, año):
12 12 2030

--- RESUMEN DE LA SIMULACIÓN ---
Inversionista: Jafet 
Fecha de Inicio: 10/February/2028
Fecha de Fin:    12/December/2030
Días de inversión: 1035
Rendimiento (12%): $5104.109589041095
Monto total:       $20104.109589041094
--------------------------------
¿Desea hacer otra simulación? (si/no): no

¡Gracias por utilizar el sistema de inversión!
