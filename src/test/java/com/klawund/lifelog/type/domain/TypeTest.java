package com.klawund.lifelog.type.domain;

import com.klawund.lifelog.type.domain.vo.TypeId;
import com.klawund.lifelog.type.domain.vo.Unit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Domain - Type")
class TypeTest {

    private static final TypeId ID = TypeId.generate();
    private static final String SLEEP = "Sleep";
    private static final Unit HOURS = Unit.HOURS;

    @DisplayName("Should create Type when given valid fields")
    @Test
    void shouldCreateTypeGivenValidFields() {
        var type = new Type(ID, SLEEP, Unit.HOURS);

        assertNotNull(type);
        assertEquals(ID, type.getId());
        assertEquals(SLEEP, type.getName());
        assertEquals(HOURS, type.getUnit());
    }

    @DisplayName("Should not create Type when given invalid id")
    @Test
    void shouldNotCreateTypeGivenInvalidId() {
        assertThrows(NullPointerException.class, () -> new Type(null, SLEEP, HOURS));
    }

    @DisplayName("Should not create Type when given invalid name")
    @Test
    void shouldNotCreateTypeGivenInvalidName() {
        assertThrows(NullPointerException.class, () -> new Type(ID, null, HOURS));
    }


    @DisplayName("Should not create Type when given invalid unit")
    @Test
    void shouldNotCreateTypeGivenInvalidUnit() {
        assertThrows(NullPointerException.class, () -> new Type(ID, SLEEP, null));
    }
}
