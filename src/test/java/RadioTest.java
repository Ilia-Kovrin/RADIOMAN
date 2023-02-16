import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    // Тесты для радиостанции //

    @Test
    public void shouldSetStation() {                          //установка любой станции в пределах 0-9
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStationAboveMax() {                //установка станции >9
        Radio radio = new Radio();
        radio.setCurrentStation(20);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMin() {                //установка станции <0
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStation() {                  //переключение на след. радиостанцию
        Radio radio = new Radio();
        radio.increaseStation(5);

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseStationNineToZero() {                  //переключение  с 9 на 0
        Radio radio = new Radio();
        radio.increaseStation(9);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {                //переключение на пред. радиостанцию (в т.ч переход с 0 на 9)
        Radio radio = new Radio();
        radio.decreaseStation(5);

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStationZeroToNine() {                //переключение с 0 на 9
        Radio radio = new Radio();
        radio.decreaseStation(0);

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    // Тесты для громкости //
    @Test
    public void shouldSetVolume() {                          //установка любой громкости в пределах 0-10
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        int expected = 5;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {                //установка громкости >10
        Radio radio = new Radio();
        radio.setCurrentVolume(20);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {                //установка громкости <0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {                  //увеличение громкости на 1
        Radio radio = new Radio();
        radio.increaseVolume(5);

        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeFromTen() {                  //увеличение громкости  с 10
        Radio radio = new Radio();
        radio.increaseVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {                  //уменьшение громкости на 1
        Radio radio = new Radio();
        radio.decreaseVolume(5);

        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromZero() {                  //уменьшение громкости c 0
        Radio radio = new Radio();
        radio.decreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
