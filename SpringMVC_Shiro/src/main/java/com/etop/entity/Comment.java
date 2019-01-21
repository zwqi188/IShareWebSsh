package com.etop.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by apple on 19/1/21.
 */
@Entity
@Table(name = "comment")
public class Comment {

    private Integer id;
    private String userId;
    private String comId;
    private String comParentId;
    private String comDesc;
    private Integer comLike;
    private Date createdAt;
    private Date updatedAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "userId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "comId")
    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    @Column(name = "comParentId")
    public String getComParentId() {
        return comParentId;
    }

    public void setComParentId(String comParentId) {
        this.comParentId = comParentId;
    }

    @Column(name = "comDesc")
    public String getComDesc() {
        return comDesc;
    }

    public void setComDesc(String comDesc) {
        this.comDesc = comDesc;
    }

    @Column(name = "comLike")
    public Integer getComLike() {
        return comLike;
    }

    public void setComLike(Integer comLike) {
        this.comLike = comLike;
    }

    @Column(name = "createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
