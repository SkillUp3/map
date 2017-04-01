package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> languages = new HashMap<>();

//        System.out.println(languages.put("Java", "a compiled high level , oop language"));
        languages.put("Python", "an interpreted, oop language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein Lies madness");

        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "this course is about Java");
        }

        languages.remove("Java");
        languages.remove("Python", "an interpreted, oop language with dynamic semantics");
//        System.out.println(languages.put("Java", "test"));

        for(String key: languages.keySet()){
            System.out.println(key + " : "+ languages.get(key));
        }


    }
}
