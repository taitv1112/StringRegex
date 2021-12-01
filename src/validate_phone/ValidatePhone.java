package validate_phone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pattern pt = Pattern.compile("^\\(84\\)-\\(0[0-9]{9}\\)$");
        System.out.println("Enter phone: ");
        String phone = sc.nextLine();
        Matcher matcher = pt.matcher(phone);
        System.out.println(matcher.matches());
    }
}
