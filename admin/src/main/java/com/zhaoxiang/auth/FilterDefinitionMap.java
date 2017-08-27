package com.zhaoxiang.auth;

import org.springframework.beans.factory.FactoryBean;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author: RiversLau
 * Date: 2017/8/17 15:15
 */
public class FilterDefinitionMap implements FactoryBean<Map<String, String>> {

    @Override
    public Map<String, String> getObject() throws Exception {

        return getAllAuthorityRouteMap();
    }

    @Override
    public Class<?> getObjectType() {

        return Map.class;
    }

    @Override
    public boolean isSingleton() {

        return true;
    }

    private Map<String, String> getAllAuthorityRouteMap() {

        Map<String, String> list = new LinkedHashMap<String, String>();

        return list;
    }
}
