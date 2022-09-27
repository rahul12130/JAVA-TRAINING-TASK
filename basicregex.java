import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class basicregex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("rahul.chavan0@gmail.com");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
