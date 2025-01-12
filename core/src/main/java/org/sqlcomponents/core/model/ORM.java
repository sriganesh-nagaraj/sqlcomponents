package org.sqlcomponents.core.model;

import lombok.Getter;
import lombok.Setter;
import org.sqlcomponents.core.model.relational.Database;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class ORM {
    public ORM(final Application application) {
        setApplication(application);
    }

    private Application application;

    private String userName;

    private String password;

    private String schemaName;

    private Database database;

    private String url;

    private Map<String, String> wordsMap;
    private Map<String, String> modulesMap;
    private Map<String, String> updateMap;
    private Map<String, String> insertMap;
    private Map<String, String> validationMap;
    private List<String> encryption;

    private List<Entity> entities;
    private List<Service> services;
    private List<Method> methods;
    private List<Default> defaults;
    private boolean pagination;
    private List<String> methodSpecification;

    private ClassLoader applicationClassLoader;

    public void setApplicationClassLoader(final ClassLoader applicationClassLoader) {
        this.applicationClassLoader = applicationClassLoader;
    }

    public boolean hasJavaClass(final String className) {
        if (applicationClassLoader != null) {
            try {
                applicationClassLoader.loadClass(className);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
}
