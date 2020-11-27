package com.concepts.streams;


import com.concepts.streams.entity.LambdaMethods;
import com.concepts.streams.entity.ObjectClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<ObjectClass> generateObjects() {
        List<ObjectClass> objectList = new ArrayList<>();
        for (int index = 1; index <= 5; index++) {
            ObjectClass object = new ObjectClass();
            object.setObjectId(index);
            object.setObjectName("Object " + index);
            object.setObjectType(Type.randomType());
            object.setObjectValue(index * 10);
            objectList.add(object);
        }
        return objectList;
    }

    public static void main(String[] args) {
        List<ObjectClass> objectList = generateObjects();
        LambdaMethods lambdaMethods = new LambdaMethods(objectList);
        System.out.println(lambdaMethods.reduceMethod());
        lambdaMethods.mapMethod();
        Map<Integer, ObjectClass> map = lambdaMethods.returnMapMethod();
        map.forEach((id, objectClass) -> {
            System.out.println("ID: " + id);
            System.out.println("Value: " + objectClass);
        });
        lambdaMethods.filterMethod();
    }
}
