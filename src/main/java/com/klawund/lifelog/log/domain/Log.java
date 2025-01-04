package com.klawund.lifelog.log.domain;

import com.klawund.lifelog.log.domain.vo.LogId;
import com.klawund.lifelog.type.domain.vo.TypeId;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.util.Objects.nonNull;
import static java.util.Objects.requireNonNull;

@Entity
@Table(name = "log")
public class Log {
    @EmbeddedId
    private LogId id;
    @Column(name = "log_date")
    private LocalDate date;
    private BigDecimal amount;
    @Embedded
    @AttributeOverride(name = "id", column = @Column(name = "type_id"))
    private TypeId typeId;
    private String description;

    public Log() {
    }

    public Log(LogId id, LocalDate date, BigDecimal amount, TypeId typeId, String description) {
        this.id = requireNonNull(id);
        this.date = nonNull(date) ? date : LocalDate.now();
        this.amount = requireNonNull(amount);
        this.typeId = requireNonNull(typeId);
        this.description = description;
    }

    public LogId getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
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
