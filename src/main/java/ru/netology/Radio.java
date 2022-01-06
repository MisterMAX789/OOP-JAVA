package ru.netology;

public class Radio {
    // номер текущей (прослушиваемой) радиостанции от 0 до 9
    private int currentNumberStation;
    private int minNumberStation = 0;
    private int maxNumberStation = 9;

    //Работа с станциями
    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation <= 9 && newCurrentNumberStation >= 0) {
            currentNumberStation = newCurrentNumberStation;
        } else
            currentNumberStation = getCurrentNumberStation();
    }

    // уменьшение радиостаници
    public int decreaseNumberStation() {
        if (currentNumberStation > 0) {
            currentNumberStation--;
        } else
            currentNumberStation = decreaseNumberStationZero();
        return currentNumberStation;
    }

    //уменьшение при условии что станция = 0
    public int decreaseNumberStationZero() {
        if (currentNumberStation == 0) {
            currentNumberStation = 9;
        }
        return currentNumberStation;
    }

    // увеличение радиостаници
    public int increaseNumberStation() {
        if (currentNumberStation < 9) {
            currentNumberStation++;
        } else
            currentNumberStation = increaseNumberStationNine();
        return currentNumberStation;
    }

    //увеличение при условии что станция = 9
    public int increaseNumberStationNine() {
        if (currentNumberStation == 9) {
            currentNumberStation = 0;
        }
        return currentNumberStation;
    }

    // Громоксть звука от 0 до 10
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;
    // Работа со звуком

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        currentSoundVolume = newCurrentSoundVolume;
    }

    // уменьшение громкости звука
    public int decreaseSoundVolume() {
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }

    // увеличение громкости звука
    public int increaseSoundVolume() {
        if (currentSoundVolume < 10) {
            currentSoundVolume++;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }
}


