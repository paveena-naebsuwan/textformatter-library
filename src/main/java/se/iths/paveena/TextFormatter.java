package se.iths.paveena;

public class TextFormatter {

    // Gör texten till versaler
    public String toUpperCase(String text) {
        return text.toUpperCase();
    }

    // Gör texten till gemener
    public String toLowerCase(String text) {
        return text.toLowerCase();
    }

    // Tar bort onödiga mellanslag i början och slutet
    public String trim(String text) {
        return text.trim();
    }

    // Tar bort alla extra mellanslag även inuti strängen
    public String normalizeSpaces(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }
}
