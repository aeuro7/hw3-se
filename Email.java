// 6510450399 Tibet Charoensripaiboon


import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Email implements Verification{

    public String nameEmail ;

    public Email(String nameEmail) {
        this.nameEmail = nameEmail;
    }

    public String getNameEmail() {
        return nameEmail;
    }

    public void setNameEmail(String nameEmail) {
        this.nameEmail = nameEmail;
    }

    @Override
    public void verify() {
        if (getNameEmail() == null || getNameEmail().trim().equals("")) {
            throw new IllegalArgumentException("Email should not empty");
        }
        System.out.println("Email not empty");
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if( !validEmailPattern.matcher(getNameEmail()).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }
        System.out.println("Email is correct format");
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if(notAllowDomains.contains(getNameEmail().split("@")[1])) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }
        System.out.println("Domain Email is allow");
    }
}
