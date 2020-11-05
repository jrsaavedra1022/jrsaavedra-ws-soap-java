/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jrsaavedra.wsexample.app;

import com.jrsaavedra.wsexample.ws.User;
import java.util.List;

/**
 *
 * @author Bios-hp
 */
public class ApplicationC {
    public static void main(String args[]){
        System.out.println("Response message: " + getMessage("225"));
        User user = getUser("574");
        System.out.println("Response user Obj: " + user.getUsername());
        List<User> users = getListUsers("897");
        System.out.println("Response list obj users");
        for(User u : users){
            System.out.println("Username: " + u.getUsername());
        }
    }

    private static String getMessage(java.lang.String code) {
        com.jrsaavedra.wsexample.ws.WS100_Service service = new com.jrsaavedra.wsexample.ws.WS100_Service();
        com.jrsaavedra.wsexample.ws.WS100 port = service.getWS100Port();
        return port.getMessage(code);
    }

    private static User getUser(java.lang.String code) {
        com.jrsaavedra.wsexample.ws.WS100_Service service = new com.jrsaavedra.wsexample.ws.WS100_Service();
        com.jrsaavedra.wsexample.ws.WS100 port = service.getWS100Port();
        return port.getUser(code);
    }

    private static java.util.List<com.jrsaavedra.wsexample.ws.User> getListUsers(java.lang.String code) {
        com.jrsaavedra.wsexample.ws.WS100_Service service = new com.jrsaavedra.wsexample.ws.WS100_Service();
        com.jrsaavedra.wsexample.ws.WS100 port = service.getWS100Port();
        return port.getListUsers(code);
    }
    
}
