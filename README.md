Programa de Conversión de Monedas

Este programa es una herramienta para convertir cantidades de una moneda a otra utilizando la API de Exchange Rate. El programa puede ser utilizado para obtener el tipo de cambio actual entre dos monedas y convertir cantidades de una moneda a otra.

Funcionalidades

    Obtener el tipo de cambio actual entre dos monedas
    Convertir cantidades de una moneda a otra
    Utilizar la API de Exchange Rate para obtener los tipos de cambio actuales

Requisitos

    Java 11 o posterior
    La librería JSON (org.json) debe estar instalada en el proyecto

Instrucciones de uso

    Ejecuta el programa y proporciona la cantidad de moneda que deseas convertir
    Selecciona la moneda de origen y la moneda de destino
    El programa mostrará el tipo de cambio actual y la cantidad convertida

Ejemplo de uso

    Ejecuta el programa y proporciona la cantidad de 100 euros
    Selecciona la moneda de origen como euros (EUR) y la moneda de destino como dólares estadounidenses (USD)
    El programa mostrará el tipo de cambio actual y la cantidad convertida en dólares estadounidenses

Código

El código del programa se encuentra en el archivo Main.java. El código utiliza la librería JSON para parsear la respuesta de la API de Exchange Rate y obtener el tipo de cambio actual.

API de Exchange Rate

La API de Exchange Rate se utiliza para obtener los tipos de cambio actuales entre monedas. La API proporciona una respuesta en formato JSON que se puede parsear para obtener el tipo de cambio actual.

