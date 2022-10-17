package com.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexp {

    public static void main(String[] args) {
        String content = "III...I wantwant... tototo...to learn Java";

        Pattern pattern =  Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        System.out.println(content);

        pattern = Pattern.compile("(\\w+?)\\1+");
        matcher = pattern.matcher(content);

        content = matcher.replaceAll("$1");
        System.out.println(content);
    }

}
