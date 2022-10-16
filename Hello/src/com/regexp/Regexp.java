package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {
        String content = "123456, abc efg";

        Pattern pattern =  Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
