package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class NORGateLogic {
    // Función para la compuerta NOR
    private static int norGate(int a, int b) {
        return ~(a | b) & 1;
    }

    // Función para XOR usando compuertas NOR
    public static int norXOR(int a, int b) {
        int temp1 = norGate(a, b);
        int temp2 = norGate(norGate(a, a), norGate(b, b));
        return norGate(temp1, temp2);
    }

    // Función para XNOR usando compuertas NOR
    public static int norXNOR(int a, int b) {
        int temp1 = norGate(a, norGate(a, b));
        int temp2 = norGate(b, norGate(b, a));
        return norGate(temp1, temp2);
    }
}