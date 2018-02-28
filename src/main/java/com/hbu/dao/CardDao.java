package com.hbu.dao;

import com.hbu.entity.Card;

import java.util.List;

/**
 * Created by chenwei on 2017/11/24.
 */
public interface CardDao {

    List<Card> queryAllCards();

    int insertCard(Card card);

    int deleteCard(Long id);

    Card queryOneCard(String cardNum);

    int updateCard(Card card);
}
