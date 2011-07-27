/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kap.services.user;

/**
 *
 * @author Julian Caicedo
 */
class UserDAOHelper {

    public static String getUsers() {
        String SQLQuery = "SELECT name FROM kap_user ORDER BY code";
        return SQLQuery;
    }

    public static String getUserByName() {
        String SQLQuery = "SELECT code, name FROM kap_user WHERE name=?";
        return SQLQuery;
    }

    public static String insertUser() {
        String SQLQuery = "INSERT INTO kap_user(name) VALUES (?)";
        return SQLQuery;
    }

}
