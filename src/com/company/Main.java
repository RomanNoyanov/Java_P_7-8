package com.company;

public class Main {
//-------------------------------------------
//===================Интерфейсы как параметры и результаты методов========================
//------------------------------------------
//    public static void main(String[] args) {
//
//        Printable printable = createPrintable("Foreign Affairs",false);
//        printable.print();
//
//        read(new Book("Java for impatients", "Cay Horstmann"));
//        read(new Journal("Java Dayly News"));
//    }
//
//    static void read(Printable p){
//
//        p.print();
//    }
//
//    static Printable createPrintable(String name, boolean option){
//
//        if(option)
//            return new Book(name, "Undefined");
//        else
//            return new Journal(name);
//    }
//}
//interface Printable{
//
//    void print();
//}
//class Book implements Printable{
//
//    String name;
//    String author;
//
//    Book(String name, String author){
//
//        this.name = name;
//        this.author = author;
//    }
//
//    public void print() {
//
//        System.out.printf("%s (%s) \n", name, author);
//    }
//}
//class Journal implements Printable {
//
//    private String name;
//
//    String getName(){
//        return name;
//    }
//
//    Journal(String name){
//
//        this.name = name;
//    }
//    public void print() {
//        System.out.println(name);
//    }
//}

//-------------------------------------------
//===================Интерфейсы в механизме обратного вызова========================
//------------------------------------------

//
//    public static void main(String[] args) {
//
//        Button button = new Button(new ButtonClickHandler());
//        button.click();
//        button.click();
//        button.click();
//    }
//}
//
//    class ButtonClickHandler implements EventHandler{
//
//        public void execute(){
//
//            System.out.println("Кнопка нажата!");
//        }
//    }
//

//    class Button{
//
//        EventHandler handler;
//        Button(EventHandler action){
//
//            this.handler=action;
//        }
//        public void click(){
//
//            handler.execute();
//        }
//    }
//
//-------------------------------------------
//===================Интерфейсы в механизме обратного вызова========================
//------------------------------------------

//    public static void main(String[] args) {
//
//        TVPipe pipe = new TVPipe();
//        pipe.printState(0);
//        pipe.printState(2);
//        pipe.printState(1);
//    }
//}
//class TVPipe implements Stateable{
//
//    public void printState(int n){
//        if(n==OPEN)
//            System.out.println("Телевизор выключен");
//        else if(n==CLOSED)
//            System.out.println("Телевизор включен");
//        else
//            System.out.println("Запущена печать на принтере...");
//    }
//}
//interface Stateable{
//
//    int OPEN = 1;
//    int CLOSED = 0;
//
//    void printState(int n);
//}
//
public static void main(String[] args) {
Car c1 = new Car("Mercedes-Benz", "S-klass", "S500", 7000000, 2015);
        c1.println();
        Car c2 = new Car("BMW", "7 series", "750 Li", 7050000, 2016);
        c2.println();
        Car c3 = new Car("Audi",  "A8", "Long", 7450000, 2016);
        c3.println();
        }
        }