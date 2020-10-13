/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistenta;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DatabaseMethods implements InterfataP {

    static void afisareAngajati() {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Query q = session.createQuery("from person");
            List<Person> person_collection = (List<Person>) q.list();
            for (Person per : person_collection) {
                System.out.println(per.getId() + ": " + per.getName() + "," + per.getAge() + "," + per.getAddress() + "," + per.getSalary());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void selectareAngajatiNume(String name) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Query q = session.createQuery("from person where name like '%'");
            List<Person> person_collection = (List<Person>) q.list();
            for (Person per : person_collection) {
                System.out.println(per.getId() + ": " + per.getName() + "," + per.getAge() + "," + per.getAddress() + "," + per.getSalary());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void selectareAngajatiVarsta(int age) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Query q = session.createQuery("from person where age like '%'");
            List<Person> person_collection = (List<Person>) q.list();
            for (Person per : person_collection) {
                System.out.println(per.getId() + ": " + per.getName() + "," + per.getAge() + "," + per.getAddress() + "," + per.getSalary());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

//        
        }
    }

    static void selectareAngajatiAdresa(String address) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Query q = session.createQuery("from person where adress like '%'");
            List<Person> person_collection = (List<Person>) q.list();
            for (Person per : person_collection) {
                System.out.println(per.getId() + ": " + per.getName() + "," + per.getAge() + "," + per.getAddress() + "," + per.getSalary());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }
    }
//
//        

    static void selectareAngajatiSalariu(int salary) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Query q = session.createQuery("from person where salary like '%'");
            List<Person> person_collection = (List<Person>) q.list();
            for (Person per : person_collection) {
                System.out.println(per.getId() + ": " + per.getName() + "," + per.getAge() + "," + per.getAddress() + "," + per.getSalary());
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }
    }

    static void modificareAngajatiNume(String name, int id) {

        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();

            sc.nextLine();
            String newName = sc.nextLine();
            Person emp = (Person) session.get(Person.class, id);
            if (emp == null) {
                System.out.println("Id inexistent!");
            } else {
                emp.setName(newName);
                session.update(emp);
                System.out.println("Datele modificate: ");
                System.out.println("Name - " + emp.getName());
                System.out.println("Age - " + emp.getAge());
                System.out.println("Address -  " + emp.getAddress());
                System.out.println("Salary -  " + emp.getSalary());
                tnx.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void modificareAngajatiVarsta(int age, int id) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();

            sc.nextLine();
            int newAge = sc.nextInt();
            Person emp = (Person) session.get(Person.class, id);
            if (emp == null) {
                System.out.println("Id inexistent!");
            } else {
                emp.setAge(newAge);
                session.update(emp);
                System.out.println("Datele modificate: ");
                System.out.println("Name - " + emp.getName());
                System.out.println("Age - " + emp.getAge());
                System.out.println("Address -  " + emp.getAddress());
                System.out.println("Salary -  " + emp.getSalary());
                tnx.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void modificareAngajatiAdresa(String address, int id) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();

            sc.nextLine();
            String newAddress = sc.nextLine();
            Person emp = (Person) session.get(Person.class, id);
            if (emp == null) {
                System.out.println("Id inexistent!");
            } else {
                emp.setAddress(newAddress);
                session.update(emp);
                System.out.println("Datele modificate: ");
                System.out.println("Name - " + emp.getName());
                System.out.println("Age - " + emp.getAge());
                System.out.println("Address -  " + emp.getAddress());
                System.out.println("Salary -  " + emp.getSalary());
                tnx.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void modificareAngajatiSalariu(int salary, int id) {

        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();

            sc.nextLine();
            int newSalary = sc.nextInt();
            Person emp = (Person) session.get(Person.class, id);
            if (emp == null) {
                System.out.println("Id inexistent!");
            } else {
                emp.setSalary(newSalary);
                session.update(emp);
                System.out.println("Datele modificate: ");
                System.out.println("Name - " + emp.getName());
                System.out.println("Age - " + emp.getAge());
                System.out.println("Address -  " + emp.getAddress());
                System.out.println("Salary -  " + emp.getSalary());
                tnx.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();

        }

    }

    static void stergereAngajati(int id) {

        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();
            Person AngajatS = (Person) session.get(Person.class, id);
            if (AngajatS == null) {
                System.out.println("Id inexistent");
            } else {
                session.delete(AngajatS);
                tnx.commit();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();
            System.out.println("Stergere efectuata.");
        }

    }

    static void noiAngajati(Person angajat) {
        SessionFactory sessionfactory = new Configuration().configure("C:\\Users\\Ruxi\\Documents\\NetBeansProjects\\persistentaHiber\\src\\resources\\hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionfactory.openSession();
        try {
            Transaction tnx = session.beginTransaction();
            Person nouA = new Person();
            String newName = sc.nextLine();

            nouA.setName(newName);
            int newAge = sc.nextInt();

            nouA.setAge(newAge);

            String newAddress = sc.nextLine();

            nouA.setName(newAddress);
            int newSalary = sc.nextInt();

            nouA.setAge(newSalary);
            session.save(nouA);
            tnx.commit();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            session.close();
            System.out.println("Noul angajat a fost adaugat cu succes.");
        }

    }

}
