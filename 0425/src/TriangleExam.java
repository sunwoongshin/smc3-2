public class TriangleExam {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("삼각형의 넓이: "+ tr.getArea());
		tr.setSize(7.5 , 9.2);
		System.out.println("삼격형의 넓이: "+ tr.getArea());
	}
}
class Triangel {
	double bottom;
	double height;
	double Triangle(double bt, double hg) {
		this.bottom = bt;
		this.height = hg;
	}
	public void setSize(double bt, double hg) {
		this.bottom = bt;
		this.height = hg;
	}
	public double getArea() {
		return bottom*height/2;
	}
}
