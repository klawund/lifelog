package com.klawund.lifelog.type.domain.vo;

import java.util.UUID;

import static java.util.Objects.requireNonNull;

public class TypeId {
    private final UUID id;

    public TypeId(UUID id) {
        this.id = requireNonNull(id);
    }

    public static TypeId generate() {
        return new TypeId(UUID.randomUUID());
    }

    public UUID getId() {
        return id;
    }
}
