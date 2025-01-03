package com.klawund.lifelog.type.domain;

import com.klawund.lifelog.type.domain.vo.TypeId;
import com.klawund.lifelog.type.domain.vo.Unit;

import static java.util.Objects.requireNonNull;

public class Type {
    private final TypeId id;
    private final String name;
    private final Unit unit;

    public Type(TypeId id, String name, Unit unit) {
        this.id = requireNonNull(id);
        this.name = requireNonNull(name);
        this.unit = requireNonNull(unit);
    }

    public TypeId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Unit getUnit() {
        return unit;
    }
}
