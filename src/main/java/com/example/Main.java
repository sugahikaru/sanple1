package com.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String>names= List.of("yamada","yasuda","suzuki","kana","momo");
        List<String>sortedResult=names.stream().sorted().toList();
        long count=names.stream().filter(name->name.startsWith("s")).count();
        boolean hasKana=names.stream().anyMatch(name->name.equals("nana"));
        List<String>result=names.stream().filter(name->name.startsWith("m")).toList();
        System.out.println(count);
        System.out.println(hasKana);
        System.out.println(sortedResult);
        System.out.println(result);
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
