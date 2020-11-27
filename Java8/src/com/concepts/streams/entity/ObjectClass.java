package com.concepts.streams.entity;

import com.concepts.streams.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ObjectClass {
    private Integer objectId;
    private String objectName;
    private Type objectType;
    private Integer objectValue;
}
