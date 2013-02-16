package me.brendler.playground.patterns.java.creational.abstractFactory.usecase;

public class ApplicationRunner {
    public static void main(String[] args) {
        new Application(createOsSpecificFactory());
    }
 
    public static GUIFactory createOsSpecificFactory() {
        String osname = System.getProperty("os.name");
        
        if (osname.startsWith("Win") ) return new WinFactory();
        else return new OSXFactory();
    }
}
