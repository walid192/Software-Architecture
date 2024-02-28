package com.directi.training.dip.solution;

import com.directi.training.dip.exercise.MyDatabase;

public class DatabaseWriter implements Writer{
    private final MyDatabase database = new MyDatabase();
    public void write(String data){
        database.write(data);
    }
}
