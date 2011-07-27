/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kap.services.user;

import com.kap.services.connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian Caicedo
 */
class UserDAO {

    private static UserDAO dao;

    private UserDAO(){}

    public static UserDAO getUserDAO(){
        if(dao == null){
            dao = new UserDAO();
        }
        return dao;
    }

    public List<UserDTO> getUsers() {
        List<UserDTO> result = new ArrayList<UserDTO>();
        Connection con = null;
        try{
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(UserDAOHelper.getUsers());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                UserDTO u = new UserDTO();
                u.setName(rs.getString(1));
                result.add(u);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            DBConnection.returnConnection(con);
        }
        return result;
    }

    public UserDTO getUserByName(UserDTO user) {
        UserDTO result = null;
        Connection con = null;
        try{
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(UserDAOHelper.getUserByName());
            ps.setString(1, user.getName());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                result = new UserDTO();
                result.setCode(rs.getInt(1));
                result.setName(rs.getString(2));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            DBConnection.returnConnection(con);
        }
        return result;
    }

    public boolean insertUser(UserDTO user) {
        boolean result = true;
        Connection con = null;
        try{
            con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(UserDAOHelper.insertUser());
            ps.setString(1, user.getName());
            ps.execute();
        }
        catch(Exception e){
            result = false;
            e.printStackTrace();
        }
        finally{
            DBConnection.returnConnection(con);
        }
        return result;
    }

}
