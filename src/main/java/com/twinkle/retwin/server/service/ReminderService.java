package com.twinkle.retwin.server.service;

import com.twinkle.retwin.server.entity.Remind;

import java.util.List;

public interface ReminderService
{
    List<Remind> getAll();
    Remind getByID(long id);
    Remind save(Remind remind);
   void remove(long id);
}
