package com.homework.daniel;

import com.homework.daniel.Model.Driver;

public class Main {

    public static void main(String[] args) {
        Driver Driver1 = new Driver("Daniel Peretz", "15/11/21", false);
        System.out.println(Driver1);
        Driver1.printMethod();
        Driver Driver2 = new Driver("Jesus", "16/11/21", true);
        System.out.println(Driver2);
        Driver2.printMethod();

    }
}
