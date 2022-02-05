package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldShowNumberOfStations() {
        Radio radio = new Radio();
        assertEquals(10, radio.getAllRadioStations(), "Всего станции");
    }

    @Test
    void shouldSetNumberOfRadioStationInLimit() {
        Radio radio = new Radio(10);
        radio.setAllRadioStations(1);
        assertEquals(1, radio.getAllRadioStations(), "Количество радиостанции в граничных значениях");
    }

    @Test
    void shouldSetNumberOfRadioStationsMax() {
        Radio radio = new Radio(10);
        radio.setAllRadioStations(10);
        assertEquals(10, radio.getAllRadioStations(), "Количество радиостанции в максимальном значении");
    }

    @Test
    void shouldSetStationsOverLimit() {
        Radio radio = new Radio(20);
        radio.setStations(15);
        assertEquals(15, radio.getCurrentRadioStation(),
                "Номер радиостанции,с заданными 20-ю станциями");
    }

    @Test
    void shouldShowNegativeStationMax() {
        Radio radio = new Radio(10);
        radio.setStations(11);
        assertEquals(5, radio.getCurrentRadioStation(),
                "Негативное max значение");
    }

    @Test
    void shouldSetStationBorderStation() {
        Radio radio = new Radio();
        radio.setStations(9);
        assertEquals(9, radio.getCurrentRadioStation(),
                "Граничное значение станций по умолчанию");
    }

    @Test
    void shouldSetStationNumberStationFirst() {
        Radio radio = new Radio(1);
        radio.setCurrentRadioStation(0);
        radio.setStations(0);
        assertEquals(0, radio.getCurrentRadioStation(),
                "Номер радиостанции. Кол-во станций - одна.");
    }


    @Test
    void shouldSetNegativeNumberOfStations() {
        Radio radio = new Radio();
        radio.setStations(-1);
        assertEquals(5, radio.getCurrentRadioStation(), "Номер радиостанции. Отрицательное  значение");
    }


    @Test
    void shouldChangeStationIfCurrentIsMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.selectingTheWrongRadioStationNumber();
        assertEquals(0, radio.getMinRadioStation(), "Текущая макс + 1 следующая = 0");
    }

    @Test
    void shouldChangeTheNextStation() {
        Radio rad = new Radio();
        rad.selectingTheWrongRadioStationNumber();
        assertEquals(6, rad.getCurrentRadioStation(), "Следующий канал");
    }

    @Test
    void shouldChangeTheStationIfCurrentIsNull() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changeTheStationByPrevButton();
        assertEquals(9, radio.getMaxRadioStation(), "Текущая радиостанция - 0,  + предыдущая " + "на пульте, то текущей должна стать максимальная");
    }

    @Test
    void shouldChangeTheStationByPrevButton() {
        Radio rad = new Radio();
        rad.changeTheStationByPrevButton();
        assertEquals(4, rad.getCurrentRadioStation(), "Предыдущий канал");
    }


    @Test
    void shouldIncreaseTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(44);
        rad.increaseVolume();
        assertEquals(45, rad.getCurrentRadioVolume(), "Увеличить громкость +1");
    }

    @Test
    void shouldIncreaseTheMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(108);
        rad.increaseVolume();
        assertEquals(100, rad.getMaxRadioVolume(), "Негативное максимальное граничное значение");
    }

    @Test
    void shouldReduceTheVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(-1);
        rad.decreaseVolume();
        assertEquals(0, rad.getMinRadioVolume(), "Негативное граничное значение");
    }


    @Test
    void shouldReduceTheMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(99);
        rad.decreaseVolume();
        assertEquals(98, rad.getCurrentRadioVolume(), "Уменьшение громкости -1");
    }

    @Test
    void shouldSetCurrentRadioStationNegativeMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStationNumber(-10);
        assertEquals(0, rad.getMinRadioStation(), "Негативное минимальное граничное значение");
    }
}
