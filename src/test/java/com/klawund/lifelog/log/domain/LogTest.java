package com.klawund.lifelog.log.domain;

import com.klawund.lifelog.log.domain.vo.LogId;
import com.klawund.lifelog.type.domain.vo.TypeId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Domain - Log")
class LogTest {
    private static final LogId ID = LogId.generate();
    private static final LocalDate NOW = LocalDate.now();
    private static final BigDecimal ONE = new BigDecimal(1);
    private static final TypeId READING_TYPE_ID = TypeId.generate();
    private static final String DESCRIPTION = "Dostoevsky";

    @DisplayName("Should create Log when given valid fields")
    @Test
    void shouldCreateLogWhenGivenValidFields() {
        var log = new Log(ID, NOW, ONE, READING_TYPE_ID, DESCRIPTION);

        assertNotNull(log);
        assertEquals(ID, log.getId());
        assertEquals(NOW, log.getDate());
        assertEquals(ONE, log.getAmount());
        assertEquals(READING_TYPE_ID, log.getTypeId());
        assertEquals(DESCRIPTION, log.getDescription());
    }

    @DisplayName("Should create Log when given only required fields")
    @Test
    void shouldCreateLogWhenGivenOnlyRequiredFields() {
        var log = new Log(ID, null, ONE, READING_TYPE_ID, null);

        assertNotNull(log);
    }

    @DisplayName("Should not create Log when given invalid id")
    @Test
    void shouldNotCreateLogWhenGivenInvalidId() {
        assertThrows(NullPointerException.class, () -> new Log(null, NOW, ONE, READING_TYPE_ID, DESCRIPTION));
    }

    @DisplayName("Should not create Log when given invalid amount")
    @Test
    void shouldNotCreateLogWhenGivenInvalidAmount() {
        assertThrows(NullPointerException.class, () -> new Log(ID, NOW, null, READING_TYPE_ID, DESCRIPTION));
    }

    @DisplayName("Should not create Log when given invalid typeId")
    @Test
    void shouldNotCreateLogWhenGivenInvalidTypeId() {
        assertThrows(NullPointerException.class, () -> new Log(ID, NOW, ONE, null, DESCRIPTION));
    }
}
