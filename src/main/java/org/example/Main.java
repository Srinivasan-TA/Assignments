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
                    BankMain ObjBank = new BankMain();
                    ObjBank.Bankmain();
                }
                case 2 -> {
                    Basicpointmain ObjBasicpoint = new Basicpointmain();
                    ObjBasicpoint.Basicpoint();
                }
                case 3 -> {
                    ContactList ObjContactList = new ContactList();
                    ObjContactList.ContactListmain();
                }
                case 4 -> {
                    Tictac ObjTictac = new Tictac();
                    ObjTictac.Tictacmain();
                }
                case 5 -> {
                    ShapeMain ObjShape = new ShapeMain();
                    ObjShape.Shapemain();

                }
                case 6 -> {
                    CalculatorMain ObjCalculator = new CalculatorMain();
                    ObjCalculator.CalculatorMain();

                }case 7 -> {
                    FileMain ObjFileMain = new FileMain();
                    ObjFileMain.File();
                }case 8 -> {
                    CardMain ObjCardMain = new CardMain();
                    ObjCardMain.myclone();

                }case 9 -> {
                    DC ObjDC = new DC();
                    ObjDC.DataBaseMain();
                }case 10 -> {
                    GpaMain ObjGpa = new GpaMain();
                    ObjGpa.GpaMain();
                }case 11 -> {
                    StudentGpaMain ObjStudentGpa = new StudentGpaMain();
                    ObjStudentGpa.StudentGpaMain();
                }
                case 12 -> {
                    Hashmap ObjHashmap = new Hashmap();
                    ObjHashmap.Hashmapmain();
                }case 13 -> {
                    Hashset ObjHashset = new Hashset();
                    ObjHashset.Hashsetmain();
                }case 14 ->{
                    Treeset ObjTreeset = new Treeset();
                    ObjTreeset.Treesetmain();
                }
                default -> l.info("Wrong choice");
            }
        } while (Choice < 15);

    }

    }
