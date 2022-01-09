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

    public int decreaseNumberStation() {
        if (currentNumberStation > minNumberStation) {
            currentNumberStation--;
        } else
            currentNumberStation = maxNumberStation;
        return currentNumberStation;
    }

    // увеличение радиостаници
    public int increaseNumberStation() {
        if (currentNumberStation < maxNumberStation) {
            currentNumberStation++;
        } else
            currentNumberStation = increaseNumberStationNine();
        return currentNumberStation;
    }

    //увеличение при условии что станция = 9
    public int increaseNumberStationNine() {
        currentNumberStation = minNumberStation;
        return currentNumberStation;
    }

    // Громоксть звука от 0 до 10
    private int currentSoundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 10;

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {
        currentSoundVolume = newCurrentSoundVolume;
    }

    // уменьшение громкости звука
    public int decreaseSoundVolume() {
        if (currentSoundVolume > minSoundVolume) {
            currentSoundVolume--;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }

    // увеличение громкости звука
    public int increaseSoundVolume() {
        if (currentSoundVolume < maxSoundVolume) {
            currentSoundVolume++;
        } else
            currentSoundVolume = getCurrentSoundVolume();
        return currentSoundVolume;
    }
}




