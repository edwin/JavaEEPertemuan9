/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeepertemuan9;

/**
 *
 * @author edwin < edwinkun at gmail dot com >
 */
@MySimpleAnnotation(doSomething = "thisissomething")
public class JavaEEPertemuan9 {

    public static void main(String[] args) {
        JavaEEPertemuan9 jeep = new JavaEEPertemuan9();
        System.out.println(jeep.total(10));
        
        Class<JavaEEPertemuan9> obj = JavaEEPertemuan9.class;
        if(obj.isAnnotationPresent(MySimpleAnnotation.class)) {
            System.out.println("ada annotation yg berisi "+obj.getAnnotation(MySimpleAnnotation.class).doSomething());
        }
    }
    
    /**
     * Returns an integer value, which is
     * 20 plus the number passed as a parameter.
     *  @param aNumber Any Integer value
     *  @return 
     */
    int total(int aNumber) {
        int a_Value = aNumber + 20;
        
        return a_Value;
    }
    
}
