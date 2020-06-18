package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {

        String s = "1*2*1*2*21343*665";
        StringTokenizer st = new StringTokenizer(s, "*");
        String status = st.nextToken();

        while (st.hasMoreTokens()) {
            switch (status){
                case "1":
                    ham1();
                case "2":
                    ham2();
                case "3":
                    ham3();
                default:
            }
        }
    }

    private static void ham1() {
    }

    private static void ham2() {
    }

    private static void ham3() {
    }

    private static void setUp() {
        List<Node> list = new ArrayList<>();
        Node node = new Node("1", "A",list );
    }
}
