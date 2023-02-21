package ru.netology;

public class Radio {
    private int stationNumber;

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        stationNumber = newStation;

    }

    public void nextStation() {                            // переход на следующую станцию
        if (stationNumber < 9) {
            stationNumber = stationNumber + 1;
        } else {
            stationNumber = 0;
        }
    }

    public void prevStation() {                         // переход на предыдущую станцию
        if (stationNumber > 0) {
            stationNumber = stationNumber - 1;
        } else {
            stationNumber = 9;
        }
    }

    private int currentVolume;

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        currentVolume = newVolume;

    }

    public void increaseVolume() {                          // Увеличение громкости на +1
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {                        // Уменьшение громкости на -1
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
