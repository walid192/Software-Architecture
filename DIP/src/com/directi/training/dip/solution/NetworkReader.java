package com.directi.training.dip.solution;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements Reader{
    private final URL url;
    public NetworkReader(String protocol,String host, String file) throws MalformedURLException {
        this.url=new URL(protocol,host,file);
    }
    @Override
    public String read() throws IOException {
        InputStream in = this.url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputStringBuilder = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            inputStringBuilder.append((char) c);
        }
      return inputStringBuilder.toString();
    }


}
