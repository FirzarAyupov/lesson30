package ru.ayupov.task;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "total";
        String s2 = "teter";

        System.out.println(getDuplicateSymbol(s));
        System.out.println(getDuplicateSymbol(s2));
    }

    public static Character getDuplicateSymbol(String str) {
        char[] a = str.toCharArray();
        List<Character> c = new ArrayList<>();
        int num;
        for (int i = 0; i < a.length; i++) {
            num = 0;
            if (c.contains(a[i])) {
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    num++;
                    if (num > 0) {
                        c.add(a[i]);
                        break;
                    }
                }
            }
            if (num == 0) {
                return a[i];
            }
        }
        return '-';
    }
}
