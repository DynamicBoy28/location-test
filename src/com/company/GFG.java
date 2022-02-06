package com.company;

import java.net.*;
import java.io.*;

public class GFG
{
    public static void main(String[] args)
    {
        try
        {
            URL ip = new URL("https://checkip.amazonaws.com");
            BufferedReader br = new BufferedReader(new InputStreamReader(ip.openStream()));
            String pip = br.readLine();
            System.out.println("Public/External IP Address = " +pip);
        }
        catch(Exception e)
        {
            System.out.println("Exception: " +e);
        }
    }
}