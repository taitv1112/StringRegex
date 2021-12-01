package validate_name_class;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate_Class {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_REGEX =   "^[CAP][\\d]{4}[GHIKLM]$";

    public Validate_Class() {
        pattern = Pattern.compile(CLASS_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            Validate_Class validate_class = new Validate_Class();
            System.out.println("Nhập tên lớp:");
            String class_room = sc.nextLine();
            System.out.println(validate_class.validate(class_room));
        }

    }
}
