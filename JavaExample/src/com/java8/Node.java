package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String option;
    private String menu;
    private List<Node> list;

    public Node() {
    }

    public Node(String option, String menu, List<Node> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.option = option;
        this.menu = menu;
        this.list = list;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public List<Node> getList() {
        return list;
    }

    public void setList(List<Node> list) {
        this.list = list;
    }
}
