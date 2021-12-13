public class A_01_abstract {
    public static void main(String[] args) {
        //		Create several abstract classes by using an array.
                Shape shapes[] = new Shape[3];
                //Put the child class in the parent's instance arrangement element => downcasting
                shapes[0]=new Rect();
                shapes[1]=new Circle();
                shapes[2]=new Line();
                for (int i =0;i<3;i++) {
                    shapes[i].draw();
                }
            }
        
        }
        //Abstract methods must be redefined.!!
        abstract class Shape{
            void line() {}
            abstract void draw(); 
        }
        
        
        class Rect extends Shape{
            void draw() {
                System.out.println("draw a rectangle.");
            }
        }
        class Circle extends Shape{
            void draw() {
                System.out.println("draw circle.");
            }
        }
        class Line extends Shape{
            void draw() {
                System.out.println("draw line.");
            }
        }