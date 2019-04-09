package othersPackage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Scanner;

public class Operator
{
    Scanner cin;

    Account profile = null;

    public Account getProfile() {
        return profile;
    }

    public void setProfile(Account profile) {
        this.profile = profile;
    }

    public Operator(Account profile) {
        this.profile = profile;
    }

    public Operator() throws IOException
    {

    }

    public void menu ()
    {
        cin = new Scanner(System.in);

        int command;

        command = cin.nextInt();

        if(command==1)
        {
            editFirstName();
        }
        else if(command==2)
        {
            editLastName();
        }
        else if(command==3)
        {
            editAddress();
        }
        else if(command==4)
        {
            editpWord();
        }
        else if(command==5)
        {
            editPicture();
        }

    }

    private void editPicture() {
        ByteArrayOutputStream baos = null;
        try {
            cin = new Scanner(System.in);
            String picPath = cin.nextLine();

            BufferedImage originalImage =
                    ImageIO.read(new File(picPath));

            baos = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", baos);
            baos.flush();
            byte[] imageInByte = baos.toByteArray();

            /*
            Blob picture = Blob.fromBytes(imageInByte);

            profile.setPicture(picture);
            */
            //save imageInByte as blob in database
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //close database connection
        }
    }

    private void editAddress() {
        cin = new Scanner(System.in);
        String address = cin.nextLine();
        profile.setAddress(address);
    }

    private void editpWord()
    {
        cin = new Scanner(System.in);
        String previouspWord = cin.nextLine();
        if(previouspWord.equals(profile.getpWord()))
        {
            String newpWord = cin.nextLine();
            profile.setpWord(newpWord);
        }
        else
        {
            System.out.println("Wrong Password");
        }
    }

    private void editLastName() {
        cin = new Scanner(System.in);
        String lastName = cin.nextLine();
        profile.setLastName(lastName);
    }

    private void editFirstName() {
        cin = new Scanner(System.in);
        String firstName = cin.nextLine();
        profile.setFirstName(firstName);
    }
}
