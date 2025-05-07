package dev.ultreon.gdx.c.config.plugins;

import java.util.ArrayList;

import dev.ultreon.gdx.c.config.TeaBuilder;
import org.teavm.model.FieldReference;
import org.teavm.model.MethodReference;
import org.teavm.vm.spi.ElementFilter;

public class TeaClassFilter implements ElementFilter {
    private static final ArrayList<String> classesToExclude = new ArrayList<>();
    private static final ArrayList<Pair> methodsToExclude = new ArrayList<>();
    private static final ArrayList<Pair> fieldsToExclude = new ArrayList<>();

    private static final ArrayList<String> ALLOWED_CLASSES = new ArrayList<>();
    private static final ArrayList<String> EXCLUDED_CLASSES = new ArrayList<>();


    /**
     * my.package.ClassName or my.package
     */
    public static void addClassToExclude(String className) {
        classesToExclude.add(className);
    }

    /**
     * my.package.ClassName or my.package
     */
    public static void addMethodsToExclude(String className, String methodName) {
        methodsToExclude.add(new Pair(className, methodName));
    }

    /**
     * my.package.ClassName or my.package
     */
    public static void addFieldsToExclude(String className, String fieldName) {
        fieldsToExclude.add(new Pair(className, fieldName));
    }

    /**
     * Must be called after TeaBuilder.build
     */
    public static void printAllowedClasses() {
        TeaBuilder.logHeader("EXCLUDED CLASSES: " + ALLOWED_CLASSES.size());
        for(String allowedClass : ALLOWED_CLASSES) {
            TeaBuilder.log(allowedClass);
        }
        TeaBuilder.logEnd();
    }

    /**
     * Must be called after TeaBuilder.build
     */
    public static void printExcludedClasses() {
        TeaBuilder.logHeader("ALLOWED CLASES: " + EXCLUDED_CLASSES.size());
        for(String excludedClass : EXCLUDED_CLASSES) {
            TeaBuilder.log(excludedClass);
        }
        TeaBuilder.logEnd();
    }

    private static boolean containsClass(ArrayList<String> list, String className) {
        for(int i = 0; i < list.size(); i++) {
            String excludedClass = list.get(i);
            if(className.matches(excludedClass) || className.contains(excludedClass + "$") )
                return true;
        }
        return false;
    }

    private static boolean contains(ArrayList<Pair> list, String className, String methodOrFieldName) {
        for(int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            if(className.contains(pair.key)) {
                if(methodOrFieldName.equals(pair.value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean acceptClass(String fullClassName) {
        boolean accceptClass = true;
        if(containsClass(classesToExclude, fullClassName)) {
            accceptClass = false;
        }
        if(accceptClass) {
            ALLOWED_CLASSES.add(fullClassName);
        }
        else {
            EXCLUDED_CLASSES.add(fullClassName);
        }
        return accceptClass;
    }

    @Override
    public boolean acceptMethod(MethodReference method) {
        String fullClassName = method.getClassName();
        String name = method.getName();
        if(contains(methodsToExclude, fullClassName, name)) {
            return false;
        }
        return true;
    }

    @Override
    public boolean acceptField(FieldReference field) {
        String fullClassName = field.getClassName();
        String fieldName = field.getFieldName();
        if(contains(fieldsToExclude, fullClassName, fieldName)) {
            return false;
        }
        return true;
    }

    public static class Pair {
        public String key;
        public String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}