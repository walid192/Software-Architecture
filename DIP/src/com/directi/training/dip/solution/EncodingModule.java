package com.directi.training.dip.solution;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private final FileReader _reader = new FileReader("DIP/src/com/directi/training/dip/solution/beforeEncryption.txt");
    private final FileWriter _writer = new FileWriter("DIP/src/com/directi/training/dip/solution/afterEncryption.txt");

    private final DatabaseWriter _databaseWriter = new DatabaseWriter();

    private final NetworkReader _networkReader = new NetworkReader("http","myfirstappwith.appspot.com","/index.html");

    public EncodingModule() throws IOException {
    }


    public void encodeWithFiles() throws IOException
    {
       try {
            String data = _reader.read();
            String encodedData = performEncoding(data);
            _writer.write(encodedData);
        } finally {
            _reader.close();
            _writer.close();
       }
    }

    private String performEncoding(String data)
    {

        return Base64.getEncoder().encodeToString(data.getBytes());
    }
    public void encodeBasedOnNetworkAndDatabase() throws IOException
    {
        String data = _networkReader.read();
        String encodedData = performEncoding(data);
        _databaseWriter.write(encodedData);
    }

}
