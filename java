abstract class Shape{
    abstract void numberofSides();}
    class Trapezoid{
        void numberofSides(){
            System.out.println("The number of sides of Trapezoid are : 6 " );
        }
    }
    class Triangle{
        void numberofSides(){
            System.out.println("The number of sides of Triangle are : 3");
        }
    }

    class Hexagon{
        void numberofSides(){
            System.out.println("The number of sides of Hexagon are : 6");
        }
    }
    class ShapeDemo{
    public static void main(String[] args) {
        Trapezoid obj1= new Trapezoid();
        Triangle obj2 = new Triangle();
        Hexagon obj3 = new Hexagon();

        obj1.numberofSides();
        obj2.numberofSides();
        obj3.numberofSides();
    }
}
//implement interface

class Demo1 implements inf2{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
    public static void main(String[] args) {
        inf2 obj = new Demo1();
        obj.method2();
    }
}
interface inf1{
    public void method1();
}
interface inf2 extends inf1{
    public void method2();
}
//Multilevel inheritance

class demomultilevelinheritance{
    public static void main(String[] args) {
        C X = new C();
        X.getData(10,20,30);
        X.Add();
    }
}
class A{
    int a;
    void showA()
    {
        System.out.println("a =" + a);
    }
}
class B extends A 
{
    int b;
    void showB()
    {
        System.out.println("b =" + b);
    }
}

class C extends B{
    int c;
    void getData(int x,int y,int z){
        {a=x;b=y;c=z ;}
    }
    void showC(){
        System.out.println("c = " + c);
    }
    void Add()
    {
        showA();
        showB();
        showC();
        System.out.println("Addition = " + (a+b+c));
    }
}

//user defined packages

class gfg{
    public void show(){
        System.out.println("Hello Geeks ! How are you ?");
    }
    public static void main(String[] args) 
    {
        gfg obj = new gfg();
        obj.show();
    }
}
