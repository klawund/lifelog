package com.klawund.lifelog.type.domain.vo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Domain - TypeID")
class TypeIdTest {

    @DisplayName("Should create TypeId when given valid id")
    @Test
    void shouldCreateTypeIdWhenGivenValidId() {
        var id = UUID.randomUUID();
        var typeId = new TypeId(id);

        assertNotNull(typeId);
        assertEquals(id, typeId.getId());
    }

    @DisplayName("Should generate valid TypeId")
    @Test
    void shouldGenerateValidTypeId() {
        var typeId = TypeId.generate();

        assertNotNull(typeId);
    }

    @DisplayName("Should not create TypeId given a null id")
    @Test
    void shouldNotCreateTypeIdWhenGivenNullId() {
        assertThrows(NullPointerException.class, () -> new TypeId(null));
    }
}
