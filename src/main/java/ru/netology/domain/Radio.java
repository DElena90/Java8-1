package ru.netology.domain;

public class Radio {
    int maxStation = 9;
    int minStation = 0;
    int currentStation;
    int maxVolume = 10;
    int minVolume = 0;
    int currentVolume;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int plusVolume() {
        if (currentVolume == maxVolume) {
            return maxVolume;
        }
        currentVolume = currentVolume + 1;

    }

}
