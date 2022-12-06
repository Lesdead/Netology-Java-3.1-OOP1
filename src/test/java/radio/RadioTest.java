package radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void defaultNumStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    Radio radio = new Radio(7);

    @Test
    public void stationNumOverLimit() {
        radio.setCurrentStation(55);
        //radio.nextStation();
        //radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationNumUnderLimit() {
        radio.setCurrentStation(-6);
        //radio.nextStation();
        //radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationPlusOne() {
        radio.setCurrentStation(2);
        radio.nextStation();
        //radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMaxPlusOne() {
        radio.setCurrentStation(6);
        radio.nextStation();
        //radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMinusOne() {
        radio.setCurrentStation(5);
        //radio.nextStation();
        radio.prevStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMinMinusOne() {
        radio.setCurrentStation(0);
        //radio.nextStation();
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    ///////////////////////////
    @Test
    public void volumeOverLimit() {
        radio.setCurrentVolume(123);
        //radio.plusVolume();
        //radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUnderLimit() {
        radio.setCurrentVolume(-5);
        //radio.plusVolume();
        //radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePlusOne() {
        radio.setCurrentVolume(67);
        radio.plusVolume();
        //radio.minusVolume();
        int expected = 68;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMaxPlusOne() {
        radio.setCurrentVolume(100);
        radio.plusVolume();
        //radio.minusVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusOne() {
        radio.setCurrentVolume(76);
        //radio.plusVolume();
        radio.minusVolume();
        int expected = 75;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinMinusOne() {
        radio.setCurrentVolume(0);
        //radio.plusVolume();
        radio.minusVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}