package controller;

import Model.Media;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidateRushSupportListMediaTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception{
        placeRushOrderController = new PlaceRushOrderController();
    }

    @Test
    void Test1 () {
        Media m1 = new Media("m1",true);
        Media m2 = new Media("m2",false);

        List<Media> mediaList = new ArrayList<>();
        mediaList.add(m1);
        mediaList.add(m2);
        boolean isValid = placeRushOrderController.validateRushSupportListMedia(mediaList);
        assertEquals(isValid,true);
    }

    @Test
    void Test2 () {
        Media m1 = new Media("m1",false);
        Media m2 = new Media("m2",false);

        List<Media> mediaList = new ArrayList<>();
        mediaList.add(m1);
        mediaList.add(m2);
        boolean isValid = placeRushOrderController.validateRushSupportListMedia(mediaList);
        assertEquals(isValid,false);
    }

}