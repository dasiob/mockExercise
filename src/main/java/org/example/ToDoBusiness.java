package org.example;

import java.util.ArrayList;
import java.util.List;

public class ToDoBusiness {

    ToDoService tds;

    public ToDoBusiness(ToDoService tds) {
        this.tds = tds;
    }


    public List<String> listhaveSpring(String user) {
        List<String> lmaos = tds.getTodos(user);
        List<String> lhs = new ArrayList<>();
        for (String lmao : lmaos) {
            if (lmao.contains("Spring")) lhs.add(lmao);
        }

        return lhs;
    }
}