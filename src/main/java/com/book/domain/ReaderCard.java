package com.book.domain;

/**
 * @Author: VaporYan
 * @Decription: 读者卡片
 * @Date: Created in 12:37 2018/5/8
 * @Modified By:
 */
public class ReaderCard extends BaseDomain {
    private int readerId;
    private String name;
    private String passwd;
    private int cardState;

    public void setCardState(int cardState) {
        this.cardState = cardState;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getReaderId() {
        return readerId;
    }

    public int getCardState() {
        return cardState;
    }

    public String getName() {
        return name;
    }

    public String getPasswd() {
        return passwd;
    }
}
