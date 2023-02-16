public class Radio {

    public int currentStation;               // установка для радиостанций

    public int getCurrentStation() {
        return currentStation;
    }

    public int currentVolume;               // установка для громкости

    public int getCurrentVolume() {
        return currentVolume;
    }

    // методы переключений радиостанции //

    public void setCurrentStation(int newCurrentStation) {   //установка любой радостанции в пределах 0-9
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation(int newCurrentStation) {    //переключение на след. радиостанцию (в т.ч переключение с 9 на 0)

        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        if (newCurrentStation == 9) {
            currentStation = 0;
        }
    }

    public void decreaseStation(int newCurrentStation) {    //переключение на пред. радиостанцию ( в т.ч переклчюение с 0 на 9)

        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        if (newCurrentStation == 0) {
            currentStation = 9;
        }
    }


    // методы изменения громкости //

    public void setCurrentVolume(int newCurrentVolume) {   //установка любой громкости в пределах 0-10
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume(int newCurrentVolume) {    // увеличение громкости на +1 (в. т.ч увеличение с 10)

        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
        if (newCurrentVolume == 10) {
            currentVolume = 10;
        }
    }

    public void decreaseVolume(int newCurrentVolume) {    // уменьшение громкости на -1 (в т.ч. уменьшение с 0)

        if (newCurrentVolume > 0) {
            currentVolume = newCurrentVolume - 1;
        }
        if (newCurrentVolume == 0) {
            currentStation = 0;
        }
    }
}




