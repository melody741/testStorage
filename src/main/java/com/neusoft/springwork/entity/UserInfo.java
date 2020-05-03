package com.neusoft.springwork.entity;

import java.util.Date;

/**
 * @Author: xhy
 * @Date: 2020/5/2 20:06
 */
public class UserInfo {
    /**
     * 数据id
     * @author xhy
     * @date
     */
    private String id;

    /**
     * 用户账号
     * @author xhy
     * @date
     */
    private String account;

    /**
     * 用户姓名
     * @author xhy
     * @date
     */
    private String name;

    /**
     * 用户角色
     * @author xhy
     * @date
     */
    private Integer role;

    /**
     * 用户性别
     * @author xhy
     * @date
     */
    private String sex;

    /**
     * 用户电话
     * @author xhy
     * @date
     */
    private String phone;

    /**
     * 用户密码
     * @author xhy
     * @date
     */
    private String password;

    /**
     * 邮箱
     * @author xhy
     * @date
     */
    private String email;

    /**
     * 身份证
     * @author xhy
     * @date
     */
    private String idCard;

    /**
     * 序号（排序用）
     * @author xhy
     * @date
     */
    private Integer sortNo;

    /**
     * 创建时间
     * @author xhy
     * @date
     */
    private Date gmtCreate;

    /**
     * 创建者
     * @author xhy
     * @date
     */
    private String createBy;

    /**
     * 修改时间
     * @author xhy
     * @date
     */
    private Date gmtModified;

    /**
     * 修改者
     * @author xhy
     * @date
     */
    private String lastModifiedBy;

    /**
     * 版本
     * @author xhy
     * @date
     */
    private Integer version;

    /**
     * 删除标志
     * @author xhy
     * @date
     */
    private Integer isDeleted;


    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", idCard='" + idCard + '\'' +
                ", sortNo=" + sortNo +
                ", gmtCreate=" + gmtCreate +
                ", createBy='" + createBy + '\'' +
                ", gmtModified=" + gmtModified +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", version=" + version +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}