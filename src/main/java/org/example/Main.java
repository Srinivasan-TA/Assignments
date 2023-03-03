package org.example;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner Se = new Scanner(System.in);
        Logger l = Logger.getLogger("Main");

        int Choice;
        do {
            l.info("\n 1. Bank \n 2.BasicPoint \n 3.Contact \n 4.TicTac \n 5.Shape \n 6.Calculator \n 7.FileReader \n 8.Card \n 9.DataBase \n 10.Update GPA \n 11.DescendingGPA \n 12.Hashmap \n 13.Hashset \n 14.TreeSet \nenter your Choice:");
            Choice = Se.nextInt();
            switch (Choice) {
                case 1 -> {
                    BankMain objBank = new BankMain();
                    objBank.bankmain();
                }
                case 2 -> {
                    Basicpointmain objBasicpoint = new Basicpointmain();
                    objBasicpoint.Basicpoint();
                }
                case 3 -> {
                    ContactList objContactList = new ContactList();
                    objContactList.ContactListmain();
                }
                case 4 -> {
                    Tictac objTictac = new Tictac();
                    objTictac.Tictacmain();
                }
                case 5 -> {
                    ShapeMain objShape = new ShapeMain();
                    objShape.Shapemain();

                }
                case 6 -> {
                    CalculatorMain objCalculator = new CalculatorMain();
                    objCalculator.CalculatorMain();

                }case 7 -> {
                    FileMain objFileMain = new FileMain();
                    objFileMain.File();
                }case 8 -> {
                    CardMain objCardMain = new CardMain();
                    objCardMain.myclone();

                }case 9 -> {
                    DC objDC = new DC();
                    objDC.DataBaseMain();
                }case 10 -> {
                    GpaMain objGpa = new GpaMain();
                    objGpa.GpaMain();
                }case 11 -> {
                    StudentGpaMain objStudentGpa = new StudentGpaMain();
                    objStudentGpa.StudentGpaMain();
                }
                case 12 -> {
                    Hashmap objHashmap = new Hashmap();
                    objHashmap.Hashmapmain();
                }case 13 -> {
                    Hashset objHashset = new Hashset();
                    objHashset.Hashsetmain();
                }case 14 ->{
                    Treeset objTreeset = new Treeset();
                    objTreeset.Treesetmain();
                }
                default -> l.info("Wrong choice");
            }
        } while (Choice < 15);
    }
}
