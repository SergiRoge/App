/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Llango
 */
public class Controller 
{

    public void testApi(String url, String method)     
    {
        ApiCaller apiCaller = new ApiCaller(url, method);
        apiCaller.run();
    }
    
}
