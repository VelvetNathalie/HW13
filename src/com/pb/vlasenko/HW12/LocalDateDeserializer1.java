package com.pb.vlasenko.HW12;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;

public class LocalDateDeserializer1 extends StdDeserializer<LocalDate> {
    private static final long serialVersionUID = 1L;

    protected LocalDateDeserializer1() {
        super(LocalDate.class);
    }


    @Override
    public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
        return LocalDate.parse(jp.readValueAs(String.class));
    }
}
