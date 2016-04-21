package com.twinkle.retwin.server.controller;

import com.twinkle.retwin.server.entity.Remind;
import com.twinkle.retwin.server.repository.RemindRepository;
import com.twinkle.retwin.server.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class ReminderController
{
    @Autowired
    private ReminderService service;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders()
    {
        List<Remind> all = service.getAll();
        return all;
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable("id") long remindID)
    {
        Remind el = service.getByID(remindID);
        return el;
    }

    @RequestMapping(value = "/reminders", method = RequestMethod.POST)
    @ResponseBody
    public Remind saveReminder(@RequestBody Remind remind)
    {
        Remind el = service.save(remind);
        return el;
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@PathVariable long id)
    {
        service.remove(id);
    }

}
