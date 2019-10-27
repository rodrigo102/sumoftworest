/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
        

/**
 *
 * @author rodrigo
 */


@Path("/add/{a},{b}")
public class SumOfTwoNumbers {
    @GET
    public String sumOftwo(@PathParam("a") int a1, @PathParam("b") int b1){
        
        int c = a1 + b1;
        return ("soma: " +  c);
    }
    }

