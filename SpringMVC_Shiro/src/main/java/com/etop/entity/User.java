package com.etop.entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by apple on 19/1/21.
 */

    @Table(name = "t_user")
    public class User implements Serializable {

        private Integer id;
        @NotEmpty(message = "用户名不能为空")
        private String username;
        @NotEmpty(message = "密码不能为空")
        private String password;
        private Set<Role> roleList;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @ManyToMany
        @JoinTable(name = "t_user_role", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "role_id")})
        public Set<Role> getRoleList() {
            return roleList;
        }

        public void setRoleList(Set<Role> roleList) {
            this.roleList = roleList;
        }

        @Transient
        public Set<String> getRolesName() {
            Set<Role> roles = getRoleList();
            Set<String> set = new HashSet<String>();
            for (Role role : roles) {
                set.add(role.getRolename());
            }
            return set;
        }

}
