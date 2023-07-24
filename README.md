Creado por: 

Juan Pablo Gutierrez Alarcon
           
Joan Sebastian Barrera Calixto

Marco Antonio Vargas Garcia

# Implementación de Compuertas NOR en Java

Este código representa una implementación de la lógica de compuertas NOR (puertas NOR) en Java. Además, incluye pruebas unitarias para las funciones `norXOR` y `norXNOR` de la clase `NORGateLogic`.

## Clase NORGateLogic

La primera clase `NORGateLogic` contiene tres métodos:

1. `norGate(int a, int b)`: Este método representa la compuerta NOR, que devuelve el resultado de la operación NOR entre los valores de entrada `a` y `b`. La compuerta NOR devuelve 1 si ambas entradas son 0; de lo contrario, devuelve 0.

2. `norXOR(int a, int b)`: Este método implementa la operación XOR (OR exclusivo) utilizando compuertas NOR. Primero, calcula dos variables temporales usando compuertas NOR y luego aplica otra compuerta NOR para obtener el resultado final.

3. `norXNOR(int a, int b)`: Este método implementa la operación XNOR (XOR negado) utilizando compuertas NOR. Al igual que el método anterior, calcula dos variables temporales usando compuertas NOR y luego aplica otra compuerta NOR para obtener el resultado final.

## Clase NORGateLogicTest

La segunda clase `NORGateLogicTest` es una clase de prueba que contiene dos métodos, `norXOR` y `norXNOR`, para probar las funciones implementadas en `NORGateLogic`.

Las pruebas unitarias comprueban si las funciones `norXOR` y `norXNOR` producen los resultados correctos para diferentes combinaciones de entradas.



    
