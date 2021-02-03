package ru.netology.constructor;

public class Radio {
    int maxStation = 10;
    int minStation = 0;
    int currentStation;
    int maxVolume = 100;
    int minVolume = 0;
    int currentVolume;

    public Radio(int currentStation, int currentVolume) {
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
    }

    public Radio(int currentStation, int maxStation, int currentVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > minStation && currentStation <= maxStation) {
            this.currentStation = currentStation;
        }
    }

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void plusVolume() {
        if (currentVolume == maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void minusVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}
