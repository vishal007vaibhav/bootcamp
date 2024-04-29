package com.example.demo.operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void areaForPositiveDimensions(){
        Rectangle rectangle = new Rectangle(2,4);

        int result = rectangle.area();

        assertEquals(8,result);
    }

    @Test
    void areaForNegativeDimensions(){

        assertThrows(IllegalArgumentException.class,() -> {
            new Rectangle(-4,-1).area();
        });

    }

}