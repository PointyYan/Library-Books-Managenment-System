package com.book.service;

import com.book.dao.ReaderCardDao;
import com.book.domain.ReaderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @Author: VaporYan
 * @Decription: ReaderCardService
 * @Date: Created in 9:54 2018/5/9
 * @Modified By:
 */
@Service
public class ReaderCardService {

    private ReaderCardDao readerCardDao;

    @Autowired
    public void setReaderCardDao(ReaderCardDao readerCardDao) {
        this.readerCardDao = readerCardDao;
    }

    public boolean addReaderCard(ReaderInfo readerInfo){
        return  readerCardDao.addReaderCard(readerInfo)>0;
    }
    public boolean updatePasswd(int readerId,String passwd){
        return readerCardDao.rePassword(readerId,passwd)>0;
    }
    public boolean updateName(int readerId,String name){
        return readerCardDao.updateName(readerId,name)>0;
    }

}
