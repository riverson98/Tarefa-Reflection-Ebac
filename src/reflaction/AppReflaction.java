package reflaction;

import entity.AnyEntity;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class AppReflaction {
    public static void main(String[] args) throws Exception {
        Class cs = AnyEntity.class;

        Constructor constructor = cs.getConstructor();
        AnyEntity entity = (AnyEntity) constructor.newInstance();

        Annotation[] annotations = entity.getClass().getAnnotations();
        for (Annotation annotation: annotations){
            System.out.println(annotation.toString());
        }
    }
}
