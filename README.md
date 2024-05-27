# Conversor de Moneda
Este proyecto permite realizar conversiones entre diferentes monedas utilizando tasas de cambio obtenidas de una API externa.

# Funcionalidades
- Conversión entre monedas: Permite convertir entre Dólar (USD) y Peso Mexicano (MXN), Peso Colombiano (COP), y Real Brasileño (BRL) en ambas direcciones.
- Obtención de tasas de cambio: Se conecta a la API de ExchangeRate para obtener las tasas de cambio actualizadas.
- Formato de salida: Formatea los resultados de la conversión de manera clara y legible.

# Uso del Programa
- Inicio del programa: Al ejecutar el programa, se muestra un menú con las opciones disponibles.
- Selección de conversión: El usuario selecciona la conversión deseada del menú.
- Ingreso de valor: El usuario ingresa el valor que desea convertir.
- Resultado de la conversión: El programa muestra el resultado de la conversión.

# Menú de opciones
![image](https://github.com/RatonyXXX/ConversorMoneda/assets/157553739/a4918955-b2ae-4508-a9dd-271cab2e600e)

# Ejemplo de uso
Entrada:

![image](https://github.com/RatonyXXX/ConversorMoneda/assets/157553739/c9335572-9102-47f7-a3b9-ddb48d2f3b4a)

Salida:

![image](https://github.com/RatonyXXX/ConversorMoneda/assets/157553739/55c8aed0-653b-43d1-9a54-93652757ba4f)

# Estructura del Código
### Clase 'Principal'
Esta clase contiene el método main y gestiona el flujo principal del programa.

### Clase 'Menu'
Muestra el menú de opciones al usuario y gestiona la selección de conversiones.

### Clase 'MonedaApi'
Se conecta a la API de ExchangeRate para obtener las tasas de cambio.

### Clase 'MonedaTasa'
Gestiona la obtención y almacenamiento de las tasas de cambio utilizando la clase MonedaApi.

### Clase 'Conversion'
Realiza la conversión entre monedas utilizando la tasa de cambio correspondiente.

### Clase 'MonedaFormato'
Formatea los valores numéricos para una presentación más clara.
