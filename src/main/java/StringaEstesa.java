/**
 * classe che estende i metodi isEmpty, isBlanck e isNumeric manualmente
 */
public class StringaEstesa {

    private String value;

    /**
     * costruttore vuoto
     */
    public StringaEstesa() {
    }


    /**
     * costruttore con parametro
     * @param s
     */
    public StringaEstesa(String s) {
        this.value = s;
    }

    /**
     * metoodo che ritorna true se il valore è nullo o se la stringa è vuota
     * @return
     */
    public boolean isEmpty() {
        return value == null || value.length() == 0 ;


    }

    /**
     * metodo che ritorna true se la stringa è vuota, se il valore è null o se ha solo spazi
     * @return
     */

    public boolean isBlank() {
        return value.matches("^(\s)$") || value == "" || value == null;
/**
 * metodo che ritorna true se ci sono solo valori numerici
 */
    }
    public boolean isNUmeric() {
        return value.matches("\\d+");

    }


    /**
     * metodo get che ritorna valore
     * @return
     */

    public String getValue() {
        return value;
    }
}





