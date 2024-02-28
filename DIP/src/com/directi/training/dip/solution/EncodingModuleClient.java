package com.directi.training.dip.solution;


import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        com.directi.training.dip.solution.EncodingModule encodingModule = new com.directi.training.dip.solution.EncodingModule();
        encodingModule.encodeWithFiles();
        encodingModule.encodeBasedOnNetworkAndDatabase();
    }
}
