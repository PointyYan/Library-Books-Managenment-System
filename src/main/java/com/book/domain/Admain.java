package com.book.domain;

/**
 * @Author: VaporYan
 * @Decription: 管理员
 * @Date: Created in 12:27 2018/5/8
 * @Modified By:
 */
public class Admain {

    private int adminId;
    private String password;


    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public int getAdminId() {
        return adminId;
    }
}
