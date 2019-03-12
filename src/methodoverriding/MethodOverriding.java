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
class A{
    public void show()
    {
        System.out.println("\n A");
    }
}

class B extends A
{
    
    public void show1()
    {
        super.show();
        System.out.println("B");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        // TODO code application logic here
        B obj1 = new B();
        obj1.show();
    }
}

