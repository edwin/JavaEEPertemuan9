package javaeepertemuan9;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * <pre>
 *  javaeepertemuan9.MySimpleAnnotation 
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * Nov 28, 2016 1:42:22 PM
 *
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MySimpleAnnotation {
    String doSomething();
}
