package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    //Обычное уменьшение радиостанции
    @Test
    void decreaseNumberStationTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(4);
        radio.decreaseNumberStation();
        int expected = 3;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Уменьшение радиостанции при минимальном значении
    @Test
    void decreaseNumberStationThenMinTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.decreaseNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Уменьшение радиостанции при значении больше макс
    @Test
    void decreaseNumberStationThenMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(10);
        radio.decreaseNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Уменьшение радиостанции при значении меньше 0
    @Test
    void decreaseNumberStationThenMinNegativeTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-2);
        radio.decreaseNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Обычное увеличение радиостанции
    @Test
    void increaseNumberStationTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(4);
        radio.increaseNumberStation();
        int expected = 5;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Увеличение радиостанции при максимальном значении
    @Test
    void increaseNumberStationThenMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.increaseNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Увеличение радиостанции при максимальном значении
    @Test
    void increaseNumberStationNineTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(9);
        radio.increaseNumberStation();
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Увеличение радиостанции при максимальном значении
    @Test
    void decreaseNumberStationZeroTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(0);
        radio.decreaseNumberStation();
        int expected = 9;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Увеличение радиостанции при значении больше максимального
    @Test
    void increaseNumberStationThenMoreMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(13);
        radio.increaseNumberStation();
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    //Увеличение радиостанции при значении меньше граничного
    @Test
    void increaseNumberStationThenLessMinTest() {
        Radio radio = new Radio();
        radio.setCurrentNumberStation(-2);
        radio.increaseNumberStation();
        int expected = 1;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    // Обычное уменьшение громкости
    @Test
    void decreaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(8);
        radio.decreaseSoundVolume();
        int expected = 7;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    //  Уменьшение громкости при максимальном значении
    @Test
    void decreaseSoundVolumeThenMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.decreaseSoundVolume();
        int expected = 9;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    //  Уменьшение громкости при минимальном значении
    @Test
    void decreaseSoundVolumeThenMinTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    // Обычное увеличение громкости
    @Test
    void increaseSoundVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(8);
        radio.increaseSoundVolume();
        int expected = 9;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    // Увеличение громкости при максимальном значении
    @Test
    void increaseSoundVolumeThenMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(10);
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }

    // Увеличение громкости при минимальном значении
    @Test
    void increaseSoundVolumeThenMinTest() {
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(0);
        radio.increaseSoundVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected, actual);
    }
}

