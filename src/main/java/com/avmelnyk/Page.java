package com.avmelnyk;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.basic.MultiLineLabel;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import java.util.ArrayList;
import java.util.Arrays;

public class Page extends WebPage{
    String output = "0";
    public Page() {
        add(new Link("link") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "1";
                }
               else
                   output = output.concat("1");
            }
        });
        
        add(new Link("link2") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "2";
                }
                else
                    output = output.concat("2");
            }
        });
        add(new Link("link3") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "3";
                }
                else
                    output = output.concat("3");
            }
        });
        add(new Link("link4") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "4";
                }
                else
                    output = output.concat("4");
            }
        });
        add(new Link("link5") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "5";
                }
                else
                    output = output.concat("5");
            }
        });
        add(new Link("link6") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "6";
                }
                else
                    output = output.concat("6");
            }
        });
        add(new Link("link7") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "7";
                }
                else
                    output = output.concat("7");
            }
        });
        add(new Link("link8") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "8";
                }
                else
                    output = output.concat("8");
            }
        });
        add(new Link("link9") {
            @Override
            public void onClick() {
                if (output.equals("0")){
                    output = "9";
                }
                else
                    output = output.concat("9");
            }
        });
        add(new Link("null") {
            @Override
            public void onClick() {
            	output= output.concat("0");
            }
        });
        add(new Link("cancel") {
            @Override
            public void onClick() {
            	if (output.length()>1) {
            		 output = output.substring(0, output.length()-1);
            	}
            	else{
            		output = "0";
            	}
            }
        });
        
        add(new Link("divide") {
        	
            @Override
            public void onClick() {
            	String divide = " / ";
	        	output = replaceOperator(output, divide);
        }});
        add(new Link("multiply") {
            @Override
            public void onClick() {
            	String multiply = " x ";
	        	output = replaceOperator(output, multiply);
            }
        });
        add(new Link("minus") {
            @Override
            public void onClick() {
            	String minus = " - ";
            	output = replaceOperator(output, minus);
            }
        });
        add(new Link("dot") {
            @Override
            public void onClick() {
            	output = output.concat(".");
            }
        });
        add(new Link("equally") {
            @Override
            public void onClick() {
            	output = output.concat(" = ");
            }
        });
        add(new Link("plus") {
            @Override
            public void onClick() {
            	String plus = " + ";
            	output = replaceOperator(output, plus);
            }
        });
        add(new MultiLineLabel("label", new PropertyModel(this, "output")));
    }
    
    public static String replaceOperator(String output, String operator){
    	String lastElem = output.substring(output.length() -1, output.length());
    	if(isNumeric(lastElem)){
    		output = output.concat(operator);
    	}
    	else{
    		String  newoutput = output.substring(0, output.length()-3);
    		 output = newoutput.concat(operator);
    	}
    	return output;
    	
    }
    
    public static boolean isNumeric(String str)  
    {  
      try  
      {  
        double d = Double.parseDouble(str);  
      }  
      catch(NumberFormatException nfe)  
      {  
        return false;  
      }  
      return true;  
    }
}
