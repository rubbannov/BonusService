package ru.netology.bonus;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    public void serviceTest(long expected, boolean isRegistered, long amount) {
            BonusService service = new BonusService();

            long actual = service.calculate(amount, isRegistered);

            assertEquals(expected, actual);
    }

}
