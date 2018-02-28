package com.hbu.service;

import com.hbu.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
@Repository
public interface TypeService {
    List<Type> queryAll();

}
