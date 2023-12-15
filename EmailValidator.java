{import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
   public static void main(String[] args) {
      String email = "student01@gmail.com";

      if (isValidEmail(email)) {
         System.out.println("Valid Email Id");
      } else {
         System.out.println("Invalid Email Id");
      }
   }

   public static boolean isValidEmail(String email) {
      // Regular expression pattern for email validation
      String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
 
      // Create a pattern object
      Pattern pattern = Pattern.compile(regex);

      // Match the pattern against the email string
      Matcher matcher = pattern.matcher(email);

      // Return true if the email matches the pattern, false otherwise
      return matcher.matches();
   }
}


    
}
