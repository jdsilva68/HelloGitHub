/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulsa.test;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Jsilva test par agithub
 */
@WebService(serviceName = "HelloWs")
public class HelloWs {

    /**
     * This is a sample web service operation testing  prueba dowbnload 2222  48484848484
     */
    // test de verificacion del reporositorio
    @WebMethod(operationName = "hello")
    // Ejemplo de cambio
    // Otro cambio
    public String hello(@WebParam(name = "name") String txt) {
        
        return "Hello Cambio quitar el número test cambio 601 12 de mayo " + txt + " !";
    }
}
