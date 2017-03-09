package com.vikings.ragnar.services;

import com.vikings.ragnar.ejb.UserService;
import com.vikings.ragnar.entities.UserEntity;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

/**
 * Created by c12317616 on 02/03/2017.
 */
@Path("/user")
public class UserRest {
    @EJB
    UserService userServiceEjb;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}/{password}")
    public UserEntity getUser(@PathParam("userId") Integer userId,@PathParam("password") String password){
        return userServiceEjb.getUser(userId,password);
    }

}