package com.example.aop.aopbasics.data;

import com.example.aop.aopbasics.aspect.Tracktime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao {
    @Tracktime
    public String retrieveSomething(){
        return "Azhagiye kani";
    }
}
