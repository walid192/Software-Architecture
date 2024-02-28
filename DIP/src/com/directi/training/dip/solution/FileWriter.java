package com.directi.training.dip.solution;

import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter implements Writer{
    private final BufferedWriter writer;
    public FileWriter(String filePath) throws IOException{
        this.writer= new BufferedWriter(new java.io.FileWriter(filePath));
    }
    public void write(String data) throws IOException{
        System.out.println(data);
        this.writer.append(data);
        this.writer.flush();
    }
    public void close() throws IOException{
        this.writer.close();
    }
}
