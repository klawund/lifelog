package com.klawund.lifelog.type.domain;

import com.klawund.lifelog.type.domain.vo.TypeId;
import com.klawund.lifelog.type.domain.vo.Unit;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import static java.util.Objects.requireNonNull;

@Entity
@Table(name = "log_type")
public class Type {
    @EmbeddedId
    private TypeId id;
    private String name;
    private Unit unit;

    public Type() {
    }

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
