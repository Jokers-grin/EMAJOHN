package mainPackage;

import othersPackage.Operator;

import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        Operator op = null;
        try {
            op = new Operator(); //put the Account
        } catch (IOException e) {
            e.printStackTrace();
        }
        op.menu();
    }
}
