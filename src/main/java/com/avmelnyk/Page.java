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
        add(new Label("label", new PropertyModel(this, "message")));
    }
}
