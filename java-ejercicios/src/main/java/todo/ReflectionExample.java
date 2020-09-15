package todo;

import org.apache.commons.beanutils.PropertyUtils;
import todo.ejemplo1.Estudiante;

import java.beans.PropertyDescriptor;

public class ReflectionExample {

    public static void main(String[] args) {

        System.out.println("Fields for Estudiante are:");
        for (PropertyDescriptor pd : PropertyUtils.getPropertyDescriptors(Estudiante.class)) {
            System.out.println(pd.getDisplayName());
        }

    }

}
