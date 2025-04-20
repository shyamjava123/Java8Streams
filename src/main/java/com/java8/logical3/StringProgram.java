package com.java8.logical3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringProgram {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Shyamkumar");
        names.add("AmolKumar");
        names.add("Vaibhav");
        names.add("Padmakar");
        names.add("Kapil");
        names.add("Sangam");
        names.add("Suraj");

        // Find names having length more than 7 char
        List<String> largeNames = names.stream().filter(n -> n.length() > 7).collect(Collectors.toList());
        System.out.println(largeNames);

        // Make all names to uppercase
        List<String> nameUppercase = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(nameUppercase);
    }
}
