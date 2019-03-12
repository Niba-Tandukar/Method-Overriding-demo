/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;

/**
 *
 * @author hello
 */
public class ClassB extends ClassA{
    @Override
    public void show(){
        super.show();
        System.out.println("In B");
    }
    public static void main(String[] args) {
       ClassB obj1 = new ClassB();
       obj1.show();
    }
}
