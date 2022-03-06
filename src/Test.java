import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {
    public static void main(String[] args) {
        String stringTest = "^(19\\d\\d|205\\d)$";
        String text ="2060" ;
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("В диапозоне");
        } else {
            System.out.println("Вне диапозона");
        }
    }
}



