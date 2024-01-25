package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Schedule;
import com.ejemplo.crudfast.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService ;

    @GetMapping
    public List<Schedule> getAllSchedules () {
        return scheduleService.getSchedules();
    }

    @PostMapping
    public Schedule saveSchedule (@RequestBody Schedule schedule) {
        scheduleService.saveOrUpdateSchedule(schedule);
        return schedule;
    }

    @DeleteMapping("/{scheduleId}")
    public String deleteSchedule(@PathVariable ("scheduleId") Long scheduleId) {
        scheduleService.deleteSchedule(scheduleId);
        return "Schedule deleted successfully";
    }

    @GetMapping("/{scheduleId}")
    public Optional<Schedule> getByIDSchedule (@PathVariable("scheduleId") Long scheduleId) {
        return scheduleService.getSchedule(scheduleId);
    }
}
