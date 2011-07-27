/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kap.services.user;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Julian Caicedo (spark990@gmail.com)
 */
@Entity
@Table(name = "kap_user")
@NamedQueries({
    @NamedQuery(name = "UserDTO.findAll", query = "SELECT u FROM UserDTO u"),
    @NamedQuery(name = "UserDTO.findByCode", query = "SELECT u FROM UserDTO u WHERE u.code = :code"),
    @NamedQuery(name = "UserDTO.findByName", query = "SELECT u FROM UserDTO u WHERE u.name = :name")})
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    public UserDTO() {
    }

    public UserDTO(Integer code) {
        this.code = code;
    }

    public UserDTO(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserDTO)) {
            return false;
        }
        UserDTO other = (UserDTO) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kap.services.user.UserDTO[code=" + code + "]";
    }

}
