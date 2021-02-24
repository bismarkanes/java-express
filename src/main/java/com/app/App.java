package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

class Users {
    private String username = "bismark";
    private String email = "bismark.john.anes@gmail.com";
    private String[] numbers = { "abc", "def", "ghi" };
}

/**
 * App
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println(generateJSON());
        System.out.println(demoListToJoinString());

        // creating new list
        List<String> list = new ArrayList<>();
        demoStringToList(list);
        System.out.println(list.toString());
    }

    private static String generateJSON() {
        Users users = new Users();
        Gson gson = new Gson();
        return gson.toJson(users);
    }

    private static String demoListToJoinString() {
        // create new fixed length list
        List<String> list = Arrays.asList("foo", "bar", "baz");
        return String.join(",", list);
     }

    private static void demoStringToList(List<String> target) {
        String NAMES = "bismark,martin,johannes,jonas";
        if (target != null) {
            target.addAll(Arrays.asList(NAMES.split(",")));
        }
     }
}
