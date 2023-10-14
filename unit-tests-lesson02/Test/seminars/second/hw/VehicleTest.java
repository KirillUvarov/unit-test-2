package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {
    Car car;
    Motorcycle moto;

    @BeforeEach
    void setUp(){
        car = new Car("Dodge", "Ram", 2010);
        moto = new Motorcycle("KAWASAKI", "NINJA", 2023);
        System.out.println(car.toString());
        System.out.println(moto.toString());

    }


    @Test // - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    public void testCarIsInstanceOfVehicle() {
        //Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    @Test // - Проверить, что объект Car создается с 4-мя колесами.
    public void testCarIsNumWheels(){
        assertEquals(car.getNumWheels(), 4);
    }

    @Test // -Проверить, что объект Motorcycle создается с 2-мя колесами.
    public void testMotoIsNumWheels(){
        assertEquals(moto.getNumWheels(), 2);
    }

    @Test // - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

    public void testCarSpeedIsNumWheels(){
        assertEquals(moto.getNumWheels(), 2);
    }

    /*

- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

В этом проекте, вы будете работать с проектом ""Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""Vehicle"" и два его подкласса ""Car"" и ""Motorcycle"".
**/





}