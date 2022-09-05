package com.practice.spring;
public class AmbiguityProblem {
    private int a;
    private int b;

    public AmbiguityProblem(float a, float b){
        this.a=(int)a;
        this.b=(int)b;
        System.out.println("Constructor : double, double");
    }
     public AmbiguityProblem(int a, int b){
         this.a=a;
         this.b=b;
         System.out.println("Constructor : int, int");
     }

     public void doSum(){
         System.out.println("Sum is:" + (this.a + this.b));
     }

}
