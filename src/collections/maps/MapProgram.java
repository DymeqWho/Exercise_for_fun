package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
//        java.util.Map<String, String> languages = new HashMap<>();
        Map<String, String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic symantics");
        languages.put("Algol", "a family of algorithmic languages");
        languages.put("BASIC", "Beginners All Purposes System Instruction Code");
        languages.put("Lisp", "Therein lies madness");

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("=====================================================");

        showItemsInMap(languages);

//        languages.remove("Lisp");
        System.out.println();

        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }
        System.out.println();

//        System.out.println(languages.replace("Lisp", "a functional programming language"));
//        System.out.println(languages.replace("Scala", "this will not be added because it not exist in map"));
//
//        if (languages.replace("Lisp", "This will not work", "a functional programming language")) {
//            System.out.println("Lisp replace");
//        } else {
//            System.out.println("Lisp was not replaced");
//        }
        replaceItemsInMap(languages, "Lisp", "This will not work", "a functional programming language");
//
//        if (languages.replace("Lisp", "Therein lies madness", "a functional programming language")) {
//            System.out.println("Lisp replace");
//        } else {
//            System.out.println("Lisp was not replaced");
//        }

        replaceItemsInMap(languages, "Lisp", "Therein lies madness", "a functional programming language");

        System.out.println();

        showItemsInMap(languages);

    }

    static void showItemsInMap(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    static Map<String, String> replaceItemsInMap(Map<String, String> map, String key, String oldValue, String newValue) {
        if (map.replace(key, oldValue, newValue)) {
            System.out.println(key + " replace");
        } else {
            System.out.println(key + " was not replaced");
        }
        return map;
    }
}
