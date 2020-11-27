package com.concepts.streams.entity;


import com.concepts.streams.Type;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
public class LambdaMethods {
    private List<ObjectClass> objectClassList;

    /*
    reduce method consists of 3 parts
    1. Identity - Start value
    2. Accumulator - a function that takes two parameters:
        a partial result of the reduction operation and the next
        element of the stream
    3. Combiner - a function used to combine the partial result of
        the reduction operation when the reduction is parallelized,
        or when there's a mismatch between the types of the accumulator
        arguments and the types of the accumulator implementation
     */
    public Integer reduceMethod() {
        return objectClassList
                .stream()
                .reduce(0,
                        (sum, object) -> sum + object.getObjectValue(), Integer::sum);
    }

    /*
    We have different variations of this method, such as map, mapToInt, mapToDouble
     */
    public void mapMethod() {
        objectClassList
                .stream()
                .map(objectClass ->
                        objectClass.getObjectName() + " " + objectClass.getObjectValue()
                ).forEach(System.out::println);
    }

    /*
    Collectors are used in this method
    the method toMap takes in two parameters
    1. Key
    2. Value
     */
    public Map<Integer, ObjectClass> returnMapMethod() {
        return objectClassList
                .stream()
                .collect(
                        Collectors.toMap(
                                ObjectClass::getObjectId,
                                Function.identity()
                        )
                );
    }

    /*
    The filter method takes in a predicate
    which means if the condition is true,
    only then we continue the operation on
    the object that is being passed to the stream
     */
    public void filterMethod() {
        objectClassList
                .stream()
                .filter(objectClass ->
                        Type.MEDIUM.equals(objectClass.getObjectType())
                ).forEach(System.out::println);
    }
}
