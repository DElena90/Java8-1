package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void createRadioWhenNext(){
        Radio radioman = new Radio(9,10);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void createRadioWhenPrev(){
        Radio radioman = new Radio(0,10);
        radioman.prevStation();
        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    public void createVolumeWhenPlus() {
        Radio radioman = new Radio(9, 10);
        radioman.plusVolume();
        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    public void createVolumeWhenMinus() {
        Radio radioman = new Radio(9, 0);
        radioman.minusVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }
}
