package org.lab;

public class App 
{
    public static void main( String[] args )
    {
        ReadCVS readCVS = new ReadCVS();
        readCVS.read("C:\\Users\\maksi\\Downloads\\foreign_names.csv", ";");
        System.out.println(readCVS.toString());
    }
}
