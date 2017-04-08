package com.pedroborgesalves.javadesignpatterns.template;

public class TemplateDemo {

    public static void main(String[] args) {
        System.out.println("For MYSQL....");
        ConnectionTemplate template = new MySqLCSVCon();
        template.run();
        System.out.println("For Oracle...");
        template = new OracleTxtCon();
        template.run();
    }
}