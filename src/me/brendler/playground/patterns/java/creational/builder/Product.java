package me.brendler.playground.patterns.java.creational.builder;

public class Product {
	private String part1 = "";
	private String part2 = "";
    private String part3 = ""; 
 
    public void setPart1(String part1)	{ this.part1 = part1; }
    public void setPart2(String part2)  { this.part2 = part2; }
    public void setPart3(String part3)  { this.part3 = part3; }
    
    @Override
    public String toString() {
    	return "BaseProduct" 
    			+ (part1.length() > 0 ? " + " + part1 : "") 
    			+ (part2.length() > 0 ? " + " + part2 : "") 
    			+ (part3.length() > 0 ? " + " + part3 : "") ;
    }
}
