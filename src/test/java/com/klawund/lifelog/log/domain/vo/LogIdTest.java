package com.klawund.lifelog.log.domain.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Domain - LogId")
class LogIdTest {

    @DisplayName("Should create LogId when given valid id")
    @Test
    void shouldCreateTypeIdWhenGivenValidId() {
        var id = UUID.randomUUID();
        var logId = new LogId(id);

        assertNotNull(logId);
        assertEquals(id, logId.getId());
    }

    @DisplayName("Should generate valid LogId")
    @Test
    void shouldGenerateValidLogId() {
        var logId = LogId.generate();

        assertNotNull(logId);
    }

    @DisplayName("Should not create LogId given a null id")
    @Test
    void shouldNotCreateLogIdWhenGivenNullId() {
        assertThrows(NullPointerException.class, () -> new LogId(null));
    }
}
