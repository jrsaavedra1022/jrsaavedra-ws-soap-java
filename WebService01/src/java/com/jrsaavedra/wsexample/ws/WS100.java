package com.jrsaavedra.wsexample.ws;

import com.jrsaavedra.wsexample.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jrsaavedra
 */
@WebService(serviceName = "WS100")
public class WS100 {

    /**
     * Web service getMessage
     * @param code
     * @return 
     */
    @WebMethod(operationName = "getMessage")
    public String getMessage(@WebParam(name = "code") String code) {
        //TODO write your implementation code here:
        String msg = "Bienvenido al web service de tipo soap " + code;
        return msg;
    }

    /**
     * Web service getUser
     * @param code
     * @return 
     */
    @WebMethod(operationName = "getUser")
    public User getUser(@WebParam(name = "code") String code) {
        //TODO write your implementation code here:
        User u = new User();
        u.setId(code);
        u.setUsername("jrsaavedra");
        u.setName("Jose Saavedra");
        u.setEmail("robertosaavedra1022@gmail.com");
        return u;
    }
    
    /**
     * Web Service getListUsers
     * @param code
     * @return 
     */
    @WebMethod(operationName = "getListUsers")
    public List<User> getListUsers(@WebParam(name = "code") String code) {
        //TODO write your implementation code here:
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User u = new User();
            u.setId("c-" +code);
            u.setUsername("usename" + i);
            u.setName("name"+i);
            u.setEmail("email"+i+"@example.com");
            
            list.add(u);
        }
        return list;
    }

}
