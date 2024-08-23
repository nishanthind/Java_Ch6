/* Program in Java for random password generation which contains specified number of 
lowercase, uppercase letters,Numeric digits and special characters.*/
import java.util.Random;
public class PasswordGenerator {
    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMERIC_CHARS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()_+-=[]{}|;:,.<>/?";
    public static String generatePassword(int length, int lenlo, int lenup, int lenum, int lensp ) {
        Random random = new Random();
        StringBuffer password = new StringBuffer();
        if (length!=lenlo+lenup+lenum+lensp){
          lenlo = lenlo + Math.abs(length-(lenlo+lenup+lenum+lensp));
        }
        // Add random lowercase characters
        for (int i = 0; i < lenlo; i++) {
            int index = random.nextInt(LOWERCASE_CHARS.length());
            password.append(LOWERCASE_CHARS.charAt(index));
        }
        // Add random uppercase characters
        for (int i = 0; i < lenup; i++) {
            int index = random.nextInt(UPPERCASE_CHARS.length());
            password.append(UPPERCASE_CHARS.charAt(index));
        }
        // Add random numeric characters
        for (int i = 0; i < lenum; i++) {
            int index = random.nextInt(NUMERIC_CHARS.length());
            password.append(NUMERIC_CHARS.charAt(index));
        }
        // Add random special characters (if requested)
        for (int i = 0; i < lensp; i++) {
            int index = random.nextInt(SPECIAL_CHARS.length());
            password.append(SPECIAL_CHARS.charAt(index));
        }
        if (length!=lenlo+lenup+lenum+lensp){
          lenlo = lenlo + Math.abs(length-(lenlo+lenup+lenum+lensp));
        }
        // Shuffle the password characters
        for (int i = 0; i < length; i++) {
            int index1 = random.nextInt(length);
            int index2 = random.nextInt(length);
            char temp = password.charAt(index1);
            password.setCharAt(index1, password.charAt(index2));
            password.setCharAt(index2, temp);
        }
        return password.toString();
    }
    public static void main(String[] args) {
        String password = generatePassword(12,6,1,2,1);
        System.out.println(password);
    }
}
