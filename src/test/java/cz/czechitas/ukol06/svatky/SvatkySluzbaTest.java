package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() {
        //TODO implementovat test metody vyhledatSvatkyKeDni
        try {
            SvatkySluzba svatkySluzba = new SvatkySluzba();
            MonthDay datumAntonie = MonthDay.of(6,12);
            List<String> testList = List.of("Antonie");
            assertEquals(testList, svatkySluzba.vyhledatSvatkyKeDni(datumAntonie));

            MonthDay datumViceJmen = MonthDay.of(6,11);
            List<String> testListViceJmen = List.of("Bruno", "Amabel", "Mabel");
            assertEquals(testListViceJmen, svatkySluzba.vyhledatSvatkyKeDni(datumViceJmen));

            MonthDay datumBez = MonthDay.of(5,8);
            List<String> testListBez = List.of();
            assertEquals(testListBez, svatkySluzba.vyhledatSvatkyKeDni(datumBez));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
