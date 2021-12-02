package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidateAddress {

    private PlaceOrderController placeOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeOrderController = new PlaceOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "So 6 ngo 2 Lang Ha,true",
            "01Vi   ,true",
            "Vi |,false",
    })
    void test(String address, boolean expected){
        boolean isValid = placeOrderController.validateAddress(address);
        assertEquals(expected,isValid);
    }
}