/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.persistent.test;

import sun.security.x509.AlgorithmId;

public class App {
    public String getGreeting() {
        return "Hello Connectors!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        
        // https://www.baeldung.com/java-migrate-8-to-17#1-enhanced-instanceof-operator
        String city = null;
        Object obj = new Address();
        if (obj instanceof Address) {
            Address address = (Address) obj; 
            city = address.getCity();
        }
        
        
        
    }
    
    public static void clearAlgorithms() throws Exception {
        try {
            Class<?> clazz = sun.security.x509.AlgorithmId.class;
            java.lang.reflect.Field field1 = clazz.getDeclaredField("oidTable");
            field1.setAccessible(true);
            field1.set(clazz, null);
            try {
                java.lang.reflect.Field field2 = clazz.getDeclaredField("initOidTable");
                field2.setAccessible(true);
                field2.set(clazz, false);
            } catch (NoSuchFieldException fe) {
            	//do nothing, go ahead with just field1, as in newer java versions initOidTable field is removed
            }
 
        } catch (Exception e) {
        	e.printStackTrace();
            throw e;
        }
    }
}
