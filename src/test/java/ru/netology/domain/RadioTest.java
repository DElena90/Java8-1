package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void createRadio(){
        Radio radioman = new Radio(9,10);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void createRadio2(){
        Radio radioman = new Radio(0,10);
        radioman.prevStation();
        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    public void createVolume() {
        Radio radioman = new Radio(9, 10);
        radioman.plusVolume();
        assertEquals(10, radioman.getCurrentVolume());
    }
}
