package com.hbu.service.impl;

import com.hbu.dao.CardDao;
import com.hbu.entity.Card;
import com.hbu.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenwei on 2017/11/25.
 */
@Repository
public class CardServiceImpl implements CardService {

    @Autowired
    CardDao cardDao;

    public List<Card> queryAll() {
        return  cardDao.queryAllCards();
    }

    public int updateCard(Card card) {
        return  cardDao.updateCard(card);
    }

    public int deleteCard(Long id) {
        return cardDao.deleteCard(id);
    }

    public Card findOne(String cardNum) {
        return cardDao.queryOneCard(cardNum);
    }

    public int addCard(Card card) {
        return cardDao.insertCard(card);
    }
}
