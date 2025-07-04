package com.cleararchitecture.event.core.domain;

import com.cleararchitecture.event.core.enums.EventType;

import java.time.LocalDateTime;

public record Event(

        Long id,
        String name,
        String description,
        String identifier,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String location,
        String organization,
        EventType type

) {}
