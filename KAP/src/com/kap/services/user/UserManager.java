/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kap.services.user;

import java.util.List;

/**
 *
 * @author Julian Caicedo
 */
public class UserManager {

    private static UserManager manager;
    private UserDAO dao = UserDAO.getUserDAO();

    private UserManager(){}

    public static UserManager getUserManager(){
        if(manager == null){
            manager = new UserManager();
        }
        return manager;
    }

    public List<UserDTO> getUsers(){
        List<UserDTO> users = null;
        users = dao.getUsers();
        return users;
    }

    public UserDTO getUserByName(UserDTO user) {
        return dao.getUserByName(user);
    }

    public boolean insertUser(UserDTO user) {
        return dao.insertUser(user);
    }

}
