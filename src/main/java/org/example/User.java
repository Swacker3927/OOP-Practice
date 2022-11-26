package org.example;

public class User {
    private String password;

    public String getPassword() {
        return password;
    }

    public void initPassword(PasswordGeneratePolicy passwordGeneratePolicy) {
        // to-be
        String password = passwordGeneratePolicy.generatePassword();
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }
}
