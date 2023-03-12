package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StationsCountTest {
    @Test
    public void setStationFromStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(25);
        int expected = 25;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationAboveTheMaxValueWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(500);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationMinValueWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setTheMaxPossibleStationWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        int expected = 49;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationNextToTheMaxPossibleWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(50);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationToThePreviousBeforeTheMaxPossibleWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(48);
        int expected = 48;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheMinPossibleStationWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationJustBeforeTheMinValueWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setTheStationNextTheMinValueWhenUseStationsCount() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(1);
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}
