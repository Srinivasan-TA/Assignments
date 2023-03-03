package org.example;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Logger;
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner se = new Scanner(System.in);
        Logger l = Logger.getLogger("Main");

        int choice;
        do {
            l.info("\n 1. Bank \n 2.BasicPoint \n 3.Contact \n 4.TicTac \n 5.Shape \n 6.Calculator \n 7.FileReader \n 8.Card \n 9.DataBase \n 10.Update GPA \n 11.DescendingGPA \n 12.Hashmap \n 13.Hashset \n 14.TreeSet \nenter your Choice:");
            choice = se.nextInt();
            switch (choice) {
                case 1 -> {
                    BankMain objBank = new BankMain();
                    objBank.bankmain();
                }
                case 2 -> {
                    Basicpointmain objBasicpoint = new Basicpointmain();
                    objBasicpoint.basicpoint();
                }
                case 3 -> {
                    ContactList objContactList = new ContactList();
                    objContactList.contactListmain();
                }
                case 4 -> {
                    Tictac objTictac = new Tictac();
                    objTictac.tictacmain();
                }
                case 5 -> {
                    ShapeMain objShape = new ShapeMain();
                    objShape.shapemain();

                }
                case 6 -> {
                    CalculatorMain objCalculator = new CalculatorMain();
                    objCalculator.calculatormain();

                }case 7 -> {
                    FileMain objFileMain = new FileMain();
                    objFileMain.file();
                }case 8 -> {
                    CardMain objCardMain = new CardMain();
                    objCardMain.myclone();

                }case 9 -> {
                    DC objDC = new DC();
                    objDC.dataBaseMain();
                }case 10 -> {
                    GpaMain objGpa = new GpaMain();
                    objGpa.gpamain();
                }case 11 -> {
                    StudentGpaMain objStudentGpa = new StudentGpaMain();
                    objStudentGpa.studentgpamain();
                }
                case 12 -> {
                    Hashmap objHashmap = new Hashmap();
                    objHashmap.hashmapmain();
                }case 13 -> {
                    Hashset objHashset = new Hashset();
                    objHashset.hashsetmain();
                }case 14 ->{
                    Treeset objTreeset = new Treeset();
                    objTreeset.treesetmain();
                }
                default -> l.info("Wrong choice");
            }
        } while (choice < 15);
    }
}
