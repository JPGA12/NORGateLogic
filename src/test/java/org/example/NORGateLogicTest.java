package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.example.NORGateLogic;

class NORGateLogicTest {

    @org.junit.jupiter.api.Test
    void norXOR() {
        // Pruebas para la función norXOR

        // Caso de prueba 1: A = 0, B = 0
        int result1 = NORGateLogic.norXOR(0, 0);
        assertEquals(0, result1);

        // Caso de prueba 2: A = 0, B = 1
        int result2 = NORGateLogic.norXOR(0, 1);
        assertEquals(1, result2);

        // Caso de prueba 3: A = 1, B = 0
        int result3 = NORGateLogic.norXOR(1, 0);
        assertEquals(1, result3);

        // Caso de prueba 4: A = 1, B = 1
        int result4 = NORGateLogic.norXOR(1, 1);
        assertEquals(0, result4);
    }

    @org.junit.jupiter.api.Test
    void norXNOR() {
        // Pruebas para la función norXNOR

        // Caso de prueba 1: A = 0, B = 0
        int result1 = NORGateLogic.norXNOR(0, 0);
        assertEquals(1, result1);

        // Caso de prueba 2: A = 0, B = 1
        int result2 = NORGateLogic.norXNOR(0, 1);
        assertEquals(0, result2);

        // Caso de prueba 3: A = 1, B = 0
        int result3 = NORGateLogic.norXNOR(1, 0);
        assertEquals(0, result3);

        // Caso de prueba 4: A = 1, B = 1
        int result4 = NORGateLogic.norXNOR(1, 1);
        assertEquals(1, result4);
    }
}