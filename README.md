# Currency Converter

Este proyecto es un conversor de monedas que utiliza la API de ExchangeRate para obtener las tasas de conversión entre diferentes divisas. Permite a los usuarios convertir valores entre varias monedas a través de un menú interactivo.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases principales:

1. **Consulta**: Se encarga de realizar la solicitud HTTP a la API de ExchangeRate para obtener la tasa de conversión entre dos monedas.
2. **Operaciones**: Gestiona el menú interactivo que permite seleccionar la moneda base, el destino y realiza la conversión.
3. **CambioDivisa**: Modelo que mapea la respuesta JSON de la API de ExchangeRate a un objeto Java.
4. **Main**: Contiene el punto de entrada del programa, donde se ejecuta el ciclo principal para manejar las operaciones de conversión.

## Requisitos

1. **Java**: Versión 11 o superior.
2. **Gson**: Librería para deserializar las respuestas JSON de la API. Se puede incluir en el proyecto mediante Maven o descargando el `.jar`.
3. **Acceso a Internet**: Es necesario para conectarse a la API de ExchangeRate.

## Instalación

1. Clona este repositorio:

   ```bash
   git clone https://github.com/tu_usuario/tu_repositorio.git

2. Importa el proyecto en tu IDE preferido.

3. Asegúrate de agregar la dependencia de Gson a tu proyecto:

## Uso
Cuando inicies la aplicación, verás un menú con las siguientes opciones:

1) Convertir de Dólar a Peso Argentino.
2) Convertir de Peso Argentino a Dólar.
3) Convertir de Dólar a Real Brasileño.
4) Convertir de Real Brasileño a Dólar.
5) Convertir de Dólar a Peso Colombiano.
6) Convertir de Peso Colombiano a Dólar.
7) Salir.
Selecciona la opción deseada, ingresa el valor que quieres convertir y el programa te devolverá la cantidad equivalente en la moneda destino.

## API de ExchangeRate
El proyecto utiliza la API de ExchangeRate para obtener las tasas de cambio. Debes tener en cuenta que para hacer funcionar este proyecto necesitarás una clave API válida. En el archivo Consulta.java, la clave API está actualmente configurada como 4b75d43fde199c9a0eaab8ad, pero asegúrate de reemplazarla por una válida si fuera necesario.
