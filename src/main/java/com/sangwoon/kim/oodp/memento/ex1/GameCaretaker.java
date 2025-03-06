package com.sangwoon.kim.oodp.memento.ex1;

import java.util.ArrayList;
import java.util.List;

public class GameCaretaker {

    private List<GameMemento> mementoList = new ArrayList<>();

    public void add(GameMemento memento) {
        mementoList.add(memento);
    }

    public GameMemento get(int index) {
        return mementoList.get(index);
    }


}
