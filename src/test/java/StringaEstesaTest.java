import static org.junit.jupiter.api.Assertions.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StringaEstesaTest {

    /**
     * fa il test sul metodo isEmpty quando la  stringa è vuota
     */
    @Test
    void isEmptyNull() {
        StringaEstesa str = new StringaEstesa();
        Assertions.assertTrue(str.isEmpty());
        Assertions.assertEquals(str.isEmpty(), StringUtils.isEmpty(str.getValue()));
    }

    /**
     * fa il test fa il test sul metodo isEmpty quando la  stringa ha un valore
     */
    @Test
    void isEmptyWithValue() {
        StringaEstesa str = new StringaEstesa("nsnsn");
        Assertions.assertFalse(str.isEmpty());
        Assertions.assertEquals(str.isEmpty(), StringUtils.isEmpty(str.getValue()));
    }

    /**
     * fa il test sul metodo isEmpty quando la  stringa ha un valore numerico
     */
    @Test
    void isEmptyNumbers() {
        StringaEstesa str = new StringaEstesa("1");
        Assertions.assertFalse(str.isEmpty());
        Assertions.assertEquals(str.isEmpty(), StringUtils.isEmpty(str.getValue()));
    }

    /**
     * fa il test sul metoodo isBlank quando la stringa è vuota
     */
    @Test
    void isBlankStringEmpty() {
        StringaEstesa str = new StringaEstesa("");
        Assertions.assertTrue(str.isBlank());
        Assertions.assertEquals( str.isBlank(), StringUtils.isBlank(str.getValue()) );
    }

    /**
     * fa il test sul metoodo isBlank quando la stringa ha almeno uno spazio
     */
    @Test
    void isBlankOnlySpaces() {
        StringaEstesa str = new StringaEstesa(" ");
        Assertions.assertTrue(str.isBlank());
        Assertions.assertEquals( str.isBlank(), StringUtils.isBlank(str.getValue()) );
    }

    /**
     * fa il test sul metoodo isBlank quando la stringa ha un valore
     */
    @Test
    void isBlankWithValue() {
        StringaEstesa str = new StringaEstesa(" 2s");
        Assertions.assertFalse(str.isBlank());
        Assertions.assertEquals( str.isBlank(), StringUtils.isBlank(str.getValue()) );
    }

    /**
     * fa il test sul metodo isNumeric quando la stringa contiene solo numeri
     */
    @Test
    void isNUmericOnlyNumbers() {
            StringaEstesa str = new StringaEstesa("939393");
            Assertions.assertTrue(str.isNUmeric());
            Assertions.assertEquals(str.isNUmeric(), StringUtils.isNumeric(str.getValue()) );
    }

    /**
     * fa il test sul metodo isNumeric quando la stringa contiene numeri e lettere
     */
    @Test
    void isNUmericWithLetters() {
        StringaEstesa str = new StringaEstesa("hshs");
        Assertions.assertFalse(str.isNUmeric());
        Assertions.assertEquals(str.isNUmeric(), StringUtils.isNumeric(str.getValue()) );
    }

    /**
     * fa il test sul metodo isNumeric quando la stringa contiene numeri spazi
     */
    @Test
    void isNUmericWithSpaces() {
        StringaEstesa str = new StringaEstesa("1 2 ");
        Assertions.assertFalse(str.isNUmeric());
        Assertions.assertEquals(str.isNUmeric(), StringUtils.isNumeric(str.getValue()) );
    }

    /**
     * fa il test sul metodo isNumeric quando la stringa è vuota
     */
    @Test
    void isNumericNull() {
        StringaEstesa str = new StringaEstesa("");
        Assertions.assertFalse(str.isNUmeric());
        Assertions.assertEquals(str.isNUmeric(), StringUtils.isNumeric(str.getValue()) );
    }
}