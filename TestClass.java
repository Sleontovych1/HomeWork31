package ua.home.javapro;

public class TestClass {

    @TestNew(a = 11, b = 5)
    public void test(int a, int b){

        System.out.println("result for " + a + " and " + b);
    }
}
