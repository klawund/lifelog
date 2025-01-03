package com.klawund.lifelog.log.domain.vo;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class LogId {
    private final UUID id;

    public LogId(UUID id) {
        this.id = requireNonNull(id);
    }

    public static LogId generate() {
        return new LogId(UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }
}
