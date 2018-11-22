package Olimp.Intro.Cycle;

class A{

    static int c = 0;

    public A(){
        A.c++;
    }
    public int getC(){
        return A.c;
    }
}