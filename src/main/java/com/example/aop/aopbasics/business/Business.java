package com.example.aop.aopbasics.business;


import com.example.aop.aopbasics.data.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business {

    @Autowired
    public Dao dao;

    public String calculateSomething()
    {
        return dao.retrieveSomething();
    }
}
