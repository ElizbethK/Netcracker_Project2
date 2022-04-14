package com.netcracker.homeworks.project1;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------Part 1-----------------------------------");

        System.out.println("(1) Circle class");
       Circle circle = new Circle();
       Circle circle2 = new Circle(1.0, "red");

        System.out.println(circle.calculateArea());
        System.out.println(circle.toString());

        System.out.println(circle.equals(circle2));
        System.out.println(circle.hashCode());
        System.out.println(circle2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(2) Rectangle class");
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle2 = new Rectangle(1.0f,1.0f);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.toString());

        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.hashCode());
        System.out.println(rectangle2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(3) Employee class");
        Employee employee = new Employee(1, "Andrew", "Simonov", 35000);
        Employee employee2 = new Employee(1, "Andrew", "Simonov", 35000);

        System.out.println(employee.toString());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getLastName());
        System.out.println(employee.raiseSalary(10));

        System.out.println(employee.equals(employee2));
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(4) Book class");
        Author author1 = new Author("Lewis Carroll", "lew_carr.com", 'M' );
        Author author2 = new Author("Other Writer", "other.com", 'F' );

        Book book1 = new Book("Alice in wonderland", 500.0,  author1);
        Book book2 = new Book("Alice in wonderland", 500.0,  author1);

        System.out.println(book1.getName());
        System.out.println(book1.getAuthors());
        System.out.println(book1.getAuthorNames());
        System.out.println(book1.toString());

        System.out.println(author1.equals(author2));
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(5) MyPoint class");
        MyPoint p = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(2, 3);

        System.out.println(p.getXY());
        System.out.println(p.getX());
        System.out.println(p.getY());

        System.out.println(p.distance(4,5));
        System.out.println(p.distance(new MyPoint(9,9)));
        System.out.println(p.distance());
        System.out.println(p.toString());

        System.out.println(p.equals(p2));
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(6) MyTriangle class");
        MyTriangle triangle = new MyTriangle(1, 1, 1, 1, 7, 8);
        MyTriangle triangle2 = new MyTriangle(1, 1, 1, 1, 7, 8);

        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getType());
        System.out.println(triangle.toString());

        System.out.println(triangle.equals(triangle2));
        System.out.println(triangle.hashCode());
        System.out.println(triangle2.hashCode());

        System.out.println("---------------------------------Part 2-----------------------------------");
        System.out.println("(1) MyComplex");
        MyComplex mycx1 = new MyComplex(5,7);
        MyComplex mycx2 = new MyComplex(4,3);
        System.out.println(mycx1);
        System.out.println(mycx2);
        System.out.println(mycx1.isImaginary());
        System.out.println(mycx1.equals(mycx2));
        System.out.println(mycx1.magnitude());
        System.out.println(mycx1.argument());
        MyComplex mycx3 = mycx1.addNew(mycx2);
        System.out.println(mycx3);
        System.out.println(mycx3.conjugate());
        System.out.println(mycx1.multiply(mycx2));
        System.out.println(mycx1.divide(mycx2));
        System.out.println();

        System.out.println(mycx1.equals(mycx2));
        System.out.println(mycx1.hashCode());
        System.out.println(mycx2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(2) MyPolynomial");

        double arr1[] = {2,5};
        double arr2[] = {2,3,4,5};
        MyPolynomial pol1 = new MyPolynomial(arr1);
        MyPolynomial pol2 = new MyPolynomial(arr2);
        MyPolynomial sum = pol1.add(pol2);
        MyPolynomial mul = pol1.multiple(pol2);
        System.out.println(pol1);
        System.out.println(pol2);
        System.out.println(pol2.getDegree());
        System.out.println(sum);
        System.out.println(mul);
        System.out.println();

        System.out.println(pol1.equals(pol2));
        System.out.println(pol1.hashCode());
        System.out.println(pol2.hashCode());

        System.out.println("==========================================================");

        System.out.println("(3) Ball");

        Container c1 = new Container(5,4,7,9);
        Container c2 = new Container(5,4,7,9);
        System.out.println(c1);
        Ball ball = new Ball(2,3,4,5, -33);
        Ball ball2 = new Ball(2,3,4,5, -33);
        System.out.println(ball);
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.move();
        System.out.println(c1.collides(ball));
        ball.reflectVertical();
        ball.move();
        ball.move();
        System.out.println(c1.collides(ball));

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(ball.equals(ball2));
        System.out.println(ball.hashCode());
        System.out.println(ball2.hashCode());

    }
}
