package com.klawund.lifelog.log.domain;

import com.klawund.lifelog.log.domain.vo.LogId;
import com.klawund.lifelog.type.domain.vo.TypeId;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

public class Log {
    private final LogId id;
    private LocalDate when;
    private BigDecimal amount;
    private TypeId typeId;
    private String description;

    public Log(LogId id, LocalDate when, BigDecimal amount, TypeId typeId, String description) {
        this.id = requireNonNull(id);
        this.when = nonNull(when) ? when : LocalDate.now();
        this.amount = requireNonNull(amount);
        this.typeId = requireNonNull(typeId);
        this.description = description;
    }

    public LogId getId() {
        return id;
    }

    public LocalDate getWhen() {
        return when;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public TypeId getTypeId() {
        return typeId;
    }

    public String getDescription() {
        return description;
    }
}
