
package com.mycompany.persistenta;

import java.sql.SQLException;
import java.util.Scanner;


public interface InterfataP {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

             
        boolean continuare = true;
        boolean trecere = true;
        boolean davai = true;

        while (continuare) {
            afisareOperatii();

           
            String operatie = sc.nextLine();

            switch (operatie) {

                case "afisare":

                    DatabaseMethods.afisareAngajati();
                    break;
                case "selectare":

                   
                    System.out.println("Introduceti criteriul de cautare:");

                    while (davai) {

                        afisareSelectii();
                        String criteriu = sc.nextLine();

                        switch (criteriu) {
                            case "name":
                                System.out.println("Nume: ");
                                String name = sc.nextLine();
                                DatabaseMethods.selectareAngajatiNume(name);

                                break;
                            case "age":
                                System.out.println("Varsta: ");
                                int age = sc.nextInt();
                                DatabaseMethods.selectareAngajatiVarsta(age);
                                break;
                            case "address":
                                System.out.println("Adresa: ");
                                String address = sc.nextLine();
                                DatabaseMethods.selectareAngajatiAdresa(address);
                                break;
                            case "salary":
                                System.out.println("Salariu: ");
                                int salary = sc.nextInt();
                                DatabaseMethods.selectareAngajatiSalariu(salary);
                                break;
                            case "exit":

                                System.out.println("Iesire din program");

                                davai = false;

                            default:

                                System.out.println("Criteriul " + criteriu + " nu exista");
                        }

                    }
                    break;

                case "modificare":
                    
                    System.out.println("Introduceti ID-ul angajatului:");

                    while (trecere) {

                        System.out.println("Selectati ce doriti sa modificati:");
                        afisareSelectii();
                        String selectie = sc.nextLine();
                        System.out.println("Introduceti ID-ul angajatului:");
                        int iD = sc.nextInt();
                        switch (selectie) {
                            case "name":

                                System.out.println("Nume: ");
                                String name = sc.nextLine();
                                DatabaseMethods.modificareAngajatiNume(name, iD);
                                break;
                            case "age":

                                System.out.println("Varsta: ");
                                int age = sc.nextInt();
                                DatabaseMethods.modificareAngajatiVarsta(age, iD);
                                break;
                            case "adress":
                                System.out.println("Adresa: ");
                                String address = sc.nextLine();
                                DatabaseMethods.modificareAngajatiAdresa(address, iD);
                                break;
                            case "salary":
                                System.out.println("Salariu: ");
                                int salary = sc.nextInt();
                                DatabaseMethods.modificareAngajatiSalariu(salary, iD);
                                break;
                            case "exit":

                                System.out.println("Iesire din program");

                                trecere = false;

                            default:

                                System.out.println("Selectia " + selectie + " nu exista");
                        }

                    }

                    break;
                case "stergere":
                    Scanner inStergere = new Scanner(System.in);
                    System.out.println("introduceti id pentru stergere:");
                    int id = sc.nextInt();
                    DatabaseMethods.stergereAngajati(id);
                    sc.nextLine();
                    break;
                case "adaugare":
                    System.out.println("Nume: ");
                    String name = sc.nextLine();
                    System.out.println("Varsta: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Adresa: ");
                    String address = sc.nextLine();
                    System.out.println("Salariul: ");
                    int salary = sc.nextInt();
                    sc.nextLine();

                    Person person = new Person(name, age, address, salary);
                    DatabaseMethods.noiAngajati(person);
                    break;
                case "exit":

                    System.out.println("Iesire din program");

                    continuare = false;

                    break;
                default:

                    System.out.println("Optiunea " + operatie + " nu exista");

            }
        }

    }

    public static void afisareOperatii() {
        System.out.println("afisare");
        System.out.println("selectare");
        System.out.println("modificare");
        System.out.println("stergere");
        System.out.println("adaugare");
        System.out.println("exit");
    }

    public static void afisareSelectii() {

        System.out.println("name");
        System.out.println("age");
        System.out.println("address");
        System.out.println("salary");
        System.out.println("exit");

    }
    
    
    
}
