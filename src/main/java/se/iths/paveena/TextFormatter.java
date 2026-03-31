package se.iths.paveena;

import java.util.Locale;

public class TextFormatter {

    //Metoden konverterar den första bokstaven i en sträng till versal och returnerar den nya strängen.
    public String capitalize(String toUpperCase) {
        //Ta emot första bokstaven i strängen
        char firstLetter = toUpperCase.charAt(0);
        //Konvertera den första bokstaven till versal
        char capitalFirstLetter = Character.toUpperCase(firstLetter);
        //Returnerar den nya sträng
        return toUpperCase.replace(toUpperCase.charAt(0),capitalFirstLetter);
    }
    //Metoden konverterar alla bokstäver i en sträng till gemener och returnerar den nya strängen.
    public String gemener(String text) {
        //Om texten är null, returnera ett felmeddelande
        if (text == null) {
            return ("Du måste ange en text");
        }
        //Returnerar den nya sträng med alla bokstäver i gemener
        return text.toLowerCase(Locale.ROOT);
    }

    public String blank(String text) {
        //Ta bort mellanslag i början och slutet
        String trimmed = text.trim();
        //Kontrollerar att texten inte är null, annars returnera null
        if (text == null) {
            return null;
        }
        return trimmed;
    }
}
