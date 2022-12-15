package org.example3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    @Test
    void testIsFruit(){
           Fruit f = new Fruit();
           assertEquals(f.isFruit(), "trueddddddd");
      }
    @Test
    void testIsFruit2(){
        Fruit f = new Fruit();
        assertEquals(f.isFruit(), "truwwwwwwwww");
    }
}