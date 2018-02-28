package com.hbu.service;

import com.hbu.entity.Identity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
@Repository
public interface IdentityService {
    List<Identity> queryAll();

}
