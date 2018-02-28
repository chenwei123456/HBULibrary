package com.hbu.service;

import com.hbu.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */

@Repository
public interface CardService {


    List<Card> queryAll();

    int updateCard(Card card);

    int deleteCard(Long id);

    Card findOne(String cardNum);

    int addCard(Card card);
}
