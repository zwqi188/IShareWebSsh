package com.etop.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by apple on 19/1/21.
 */
@Entity
@Table(name = "resource")
public class Resource {

    private int id;
    private String resName;
    private String resDesc;
    private String userId;
    private List<Pic> resPic;
    private Integer resLike;
    private Integer resClick;
    private Integer resId;
    private Date createdAt;
    private Date updatedAt;
    private String resUrl;
    private String resPwd;
    private Integer resRecommend;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "resName")
    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    @Column(name = "resDesc")
    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    @Column(name = "userId")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Column(name = "resLike")
    public Integer getResLike() {
        return resLike;
    }

    public void setResLike(Integer resLike) {
        this.resLike = resLike;
    }

    @Column(name = "resClick")
    public Integer getResClick() {
        return resClick;
    }

    public void setResClick(Integer resClick) {
        this.resClick = resClick;
    }

    @Column(name = "resId")
    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Column(name = "updatedAt")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name = "createdAt")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "resUrl")
    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    @Column(name = "resPwd")
    public String getResPwd() {
        return resPwd;
    }

    public void setResPwd(String resPwd) {
        this.resPwd = resPwd;
    }

    @Column(name = "resRecommend")
    public Integer getResRecommend() {
        return resRecommend;
    }

    public void setResRecommend(Integer resRecommend) {
        this.resRecommend = resRecommend;
    }

    @Column(name = "resPic")
    public List<Pic> getResPic() {
        return resPic;
    }

    public void setResPic(List<Pic> resPic) {
        this.resPic = resPic;
    }

    private class Pic {

        private String pic;

        private String sort;

        public String getPic() {
            return pic;
        }

        public void setPic(String pic) {
            this.pic = pic;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }
    }
}
