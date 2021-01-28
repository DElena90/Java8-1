package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testNextStationWhenMaxCurrentStation(){
        Radio radioman = new Radio(9,10);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void testNextStationWhenNotMaxCurrentStation(){
        Radio radioman = new Radio(0,10);
        radioman.nextStation();
        assertEquals(1, radioman.getCurrentStation());
    }

    @Test
    public void testPrevStationWhenMinCurrentStation(){
        Radio radioman = new Radio(0,10);
        radioman.prevStation();
        assertEquals(9, radioman.getCurrentStation());
    }

    @Test
    public void testPrevStationWhenNotMinCurrentStation(){
        Radio radioman = new Radio(6,10);
        radioman.prevStation();
        assertEquals(5, radioman.getCurrentStation());
    }

    @Test
    public void testPlusVolumeWhenMaxCurrentVolume() {
        Radio radioman = new Radio(9, 10);
        radioman.plusVolume();
        assertEquals(10, radioman.getCurrentVolume());
    }

    @Test
    public void testPlusVolumeWhenNotMaxCurrentVolume() {
        Radio radioman = new Radio(9, 2);
        radioman.plusVolume();
        assertEquals(3, radioman.getCurrentVolume());
    }

    @Test
    public void testMinusVolumeWhenMinCurrentVolume() {
        Radio radioman = new Radio(9, 0);
        radioman.minusVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void testMinusVolumeWhenNotMinCurrentVolume() {
        Radio radioman = new Radio(9, 5);
        radioman.minusVolume();
        assertEquals(4, radioman.getCurrentVolume());
    }
}
