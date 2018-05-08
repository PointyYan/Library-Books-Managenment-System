package com.book.domain;

/**
 * @Author: VaporYan
 * @Decription: 读者信息
 * @Date: Created in 12:37 2018/5/8
 * @Modified By:
 */
public class ReaderInfo extends BaseDomain {
    private int readerId;
    private String name;
    private String sex;
    private Date birth;
    private String address;
    private String telcode;

    public void setName(String name) {
        this.name = name;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setTelcode(String telcode) {
        this.telcode = telcode;
    }

    public String getName() {
        return name;
    }

    public int getReaderId() {
        return readerId;
    }

    public Date getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getTelcode() {
        return telcode;
    }
}
