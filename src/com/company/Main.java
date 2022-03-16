package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(2,3,4,5,6,3,5,7,8,4));
        System.out.println(array);
        System.out.println();

        List<Integer> L1 = array.stream().filter(integer -> 1 % 2 == 0).collect(Collectors.toList());
        System.out.println("Жуп сандар: " + L1);
        System.out.println();

        List<Integer> list = L1.stream().map(n ->(int) Math.pow(n, 2)).collect(Collectors.toList());
        System.out.println(list);

    Integer max = list.stream().max(Integer::compare).get();
        System.out.println(" Эн чону: " + max);

    }
}
