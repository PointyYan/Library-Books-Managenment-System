package com.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @Author: VaporYan
 * @Decription: 书DAO
 * @Date: Created in 13:24 2018/5/8
 * @Modified By:
 */
public class BookDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final static String ADD_BOOK_SQL="INSERT INTO book_info VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?)";
    private final static String DELETE_BOOK_SQL="delete from book_info where book_id = ?  ";
    private final static String EDIT_BOOK_SQL="update book_info set name= ? ,author= ? ,publish= ? ,ISBN= ? ,introduction= ? ,language= ? ,price= ? ,pubdate= ? ,class_id= ? ,pressmark= ? ,state= ?  where book_id= ? ;";
    private final static String QUERY_ALL_BOOKS_SQL="SELECT * FROM book_info ";
    private final static String QUERY_BOOK_SQL="SELECT * FROM book_info WHERE book_id like  ?  or name like ?   ";
    //查询匹配图书的个数
    private final static String MATCH_BOOK_SQL="SELECT count(*) FROM book_info WHERE book_id like ?  or name like ?  ";
    //根据书号查询图书
    private final static String GET_BOOK_SQL="SELECT * FROM book_info where book_id = ? ";

}
