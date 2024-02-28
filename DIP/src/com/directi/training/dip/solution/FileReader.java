package com.directi.training.dip.solution;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader implements Reader{
    private final BufferedReader reader;

    public FileReader(String filePath) throws IOException {

            this.reader = new BufferedReader(new java.io.FileReader(filePath)) ;
    }



    @Override
    public String read() throws IOException {
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }
}
