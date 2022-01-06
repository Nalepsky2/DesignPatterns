package com.company.flyweight;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class UserFactory {
    private static final Map<String, File> avatars = new HashMap<>();

    public static User createUser(String name, String fileName) {
        avatars.computeIfAbsent(fileName, newFile -> {
            return new File("/avatar/" + fileName);
        });

        return new User(name, avatars.get(fileName));
    }
}
