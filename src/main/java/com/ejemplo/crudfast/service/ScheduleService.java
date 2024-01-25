package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.Schedule;
import com.ejemplo.crudfast.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ScheduleService {
    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> getSchedules() {
        return scheduleRepository.findAll();
    }

    public Optional<Schedule> getSchedule(Long id) {
        return scheduleRepository.findById(id);
    }
    public void saveOrUpdateSchedule (Schedule student) {
        scheduleRepository.save(student);
    }
    public void deleteSchedule (Long id) {
        scheduleRepository.deleteById(id);
    }
}
