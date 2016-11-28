package javaeepertemuan9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *  javaeepertemuan9.MySimpleAnnotation2 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Nov 28, 2016 2:31:34 PM
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MySimpleAnnotation2 {
}
