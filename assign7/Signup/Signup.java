/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Chitrangad Patil
 */
@WebService(serviceName = "Signup")
public class Signup {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "signup")
    public String[] signup(@WebParam(name = "firstname") String firstname, @WebParam(name = "lastname") String lastname) {
        String[] state = new String[2];
        state[0] = firstname;
        state[1] = lastname;
        return state;
    }
 
}
