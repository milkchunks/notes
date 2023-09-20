import java.lang.StringBuilder;
import java.util.Arrays;

public class Sectioning {
    public static int getVerbEnding(String verb) {
        String endingType = "";
        String ending = verb.charAt(verb.length() - 2) + String.valueOf(verb.charAt(verb.length() - 1));
        switch (ending) {
            case "ar":
                return 0;
            case "er":
                return 1;
            case "ir":
                return 2;
            default:
                return 3;
        }
    }
    public static String getVerbStem(String verb) {
        StringBuilder sb = new StringBuilder(verb);
        sb.deleteCharAt(verb.length() - 1);
        sb.deleteCharAt(verb.length() - 2);
        verb = sb.toString();
        //ACTUALLY RUN THIS IN MAIN, but if verb is a stem changer and ir, then return reg and irreg stem
        //TODO create trulyIrreg String[] in References, then check HERE if the verb is truly irreg (like decir > dij)
        if (Arrays.asList(References.irregs).contains(verb) && Arrays.asList(References.irVerbs).contains(verb)) {
        }
        return verb;
    }
}
