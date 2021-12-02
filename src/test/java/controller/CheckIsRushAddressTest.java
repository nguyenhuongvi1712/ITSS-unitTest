package controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CheckIsRushAddressTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception{
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Hà Nội,true",
            "Hải Phòng,false"
    })
    void test(String city, boolean expected){
        boolean isValid = placeRushOrderController.checkIsRushAddress(city);
        assertEquals(expected,isValid);
    }
}