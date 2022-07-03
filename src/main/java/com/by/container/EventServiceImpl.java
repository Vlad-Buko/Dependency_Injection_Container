package com.by.container;

/**
 * Created by Vladislav Domaniewski
 */

public class EventServiceImpl  {
    private EventDao eventDao;

    public EventServiceImpl(EventDao eventDao) {
        this.eventDao = eventDao;
    }
}
