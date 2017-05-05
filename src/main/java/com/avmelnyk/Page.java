package com.avmelnyk;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.ExternalLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class Page extends WebPage{
    String message = "0";
    public Page() {
        add(new Link("link") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "1";
                }
               else
                   message = message.concat("1");
            }
        });
        
        add(new Link("link2") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "2";
                }
                else
                    message = message.concat("2");
            }
        });
        add(new Link("link3") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "3";
                }
                else
                    message = message.concat("3");
            }
        });
        add(new Link("link4") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "4";
                }
                else
                    message = message.concat("4");
            }
        });
        add(new Link("link5") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "5";
                }
                else
                    message = message.concat("5");
            }
        });
        add(new Link("link6") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "6";
                }
                else
                    message = message.concat("7");
            }
        });
        add(new Link("link7") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "7";
                }
                else
                    message = message.concat("7");
            }
        });
        add(new Link("link8") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "8";
                }
                else
                    message = message.concat("8");
            }
        });
        add(new Link("link9") {
            @Override
            public void onClick() {
                if (message.equals("0")){
                    message = "9";
                }
                else
                    message = message.concat("9");
            }
        });
        add(new Link("divide") {
            @Override
            public void onClick() {
            	message = message.concat(" / ");
            }
        });
        add(new Link("multiply") {
            @Override
            public void onClick() {
            	message = message.concat(" x ");
            }
        });
        add(new Link("minus") {
            @Override
            public void onClick() {
            	message = message.concat(" - ");
            }
        });
        add(new Link("plus") {
            @Override
            public void onClick() {
            	message = message.concat(" + ");
            }
        });
        add(new Label("label", new PropertyModel(this, "message")));
    }
}
