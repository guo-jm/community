package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @author GuoJiaming
 * @version 1.0
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
