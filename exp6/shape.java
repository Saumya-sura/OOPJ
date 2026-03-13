

    
	// Shape interface
	interface Shape {
		double area();
		double perimeter();
	}
    
	// Abstract class for common properties (optional, for demonstration)
	abstract class AbstractShape implements Shape {
		String name;
		public AbstractShape(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	}
    
	// Circle class implementing Shape
	class Circle extends AbstractShape {
		private double radius;
    
		public Circle(double radius) {
			super("Circle");
			this.radius = radius;
		}
    
		@Override
		public double area() {
			return Math.PI * radius * radius;
		}
    
		@Override
		public double perimeter() {
			return 2 * Math.PI * radius;
		}
	}
    
	// Rectangle class implementing Shape
	class Rectangle extends AbstractShape {
		private double length, width;
    
		public Rectangle(double length, double width) {
			super("Rectangle");
			this.length = length;
			this.width = width;
		}
    
		@Override
		public double area() {
			return length * width;
		}
    
		@Override
		public double perimeter() {
			return 2 * (length + width);
		}
	}
    
	// Test class
	public class shape {
		public static void main(String[] args) {
			Shape c = new Circle(5);
			Shape r = new Rectangle(4, 6);
			System.out.println("Circle area: " + c.area());
			System.out.println("Circle perimeter: " + c.perimeter());
			System.out.println("Rectangle area: " + r.area());
			System.out.println("Rectangle perimeter: " + r.perimeter());
		}
	}
