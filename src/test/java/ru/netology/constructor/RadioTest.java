package ru.netology.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.constructor.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    public void testNextStationWhenMaxCurrentStation(){
        Radio radioman = new Radio(10,10);
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
        assertEquals(10, radioman.getCurrentStation());
    }

    @Test
    public void testPrevStationWhenNotMinCurrentStation(){
        Radio radioman = new Radio(6,10);
        radioman.prevStation();
        assertEquals(5, radioman.getCurrentStation());
    }

    @Test
    public void testPlusVolumeWhenMaxCurrentVolume() {
        Radio radioman = new Radio(9, 100);
        radioman.plusVolume();
        assertEquals(100, radioman.getCurrentVolume());
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

    @Test
    public void testNextStationWithCustomMaxStation() {
        Radio radioman = new Radio(100, 100, 99);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void testPrevStationWithCustomMaxStation() {
        Radio radioman = new Radio(0, 100, 99);
        radioman.prevStation();
        assertEquals(100, radioman.getCurrentStation());
    }

    @Test
    public void testSetCurrentStation() {
        Radio radioman = new Radio(1, 5, 99);
        radioman.setCurrentStation(3);
        assertEquals(3, radioman.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationGranderThenMaxStation() {
        Radio radioman = new Radio(11, 20, 99);
        radioman.setCurrentStation(25);
        assertEquals(11, radioman.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationLessThenMinStation() {
        Radio radioman = new Radio(11, 20, 99);
        radioman.setCurrentStation(-25);
        assertEquals(11, radioman.getCurrentStation());
    }
}
