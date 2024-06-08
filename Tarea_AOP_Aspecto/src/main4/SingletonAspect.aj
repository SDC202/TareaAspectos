package main4;

import java.util.HashMap;
import java.util.Map;

public aspect SingletonAspect {
	private final Map<Class<?>, Object> singletonInstances = new HashMap<>();

    pointcut singletonGetInstance() : execution(public static * getInstance(..));

    Object around() : singletonGetInstance() {
        Class<?> clazz = thisJoinPointStaticPart.getSignature().getDeclaringType();
        if (singletonInstances.containsKey(clazz)) {
            System.out.println("No se puede crear otra instancia de " + clazz.getSimpleName() + ".");
            return singletonInstances.get(clazz);
        } else {
            try {
                Object instance = proceed();
                singletonInstances.put(clazz, instance);
                return instance;
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                return null;
            }
        }
    }
    
}
