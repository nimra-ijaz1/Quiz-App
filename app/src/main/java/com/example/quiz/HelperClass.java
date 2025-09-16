package com.example.quiz;

public class HelperClass {
    private String fullname;
    private String email;
    private String phone;
    private String password;

    // Constructor to initialize fields
    public HelperClass(String fullname, String email, String phone, String password) {
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Empty constructor required for Firebase
    public HelperClass() {}

    // Getters and Setters
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
