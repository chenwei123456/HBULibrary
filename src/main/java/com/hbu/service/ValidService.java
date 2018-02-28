package com.hbu.service;

import com.hbu.entity.Valid;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
@Repository
public interface ValidService {
    List<Valid> queryAll();
}
