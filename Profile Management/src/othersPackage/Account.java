package othersPackage;

import java.sql.Blob;

public class Account
{
    private String firstName = null;
    private String lastName = null;
    private String address = null;
    private String pWord = null;

    private Blob picture = null;

    public Account()
    {

    }

    public Blob getPicture() {
        return picture;
    }

    public void setPicture(Blob picture) {
        this.picture = picture;
    }

    public Account(String name)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.pWord = pWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }
}
