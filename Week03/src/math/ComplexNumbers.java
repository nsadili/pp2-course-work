package math;

class ComplexNumbers {
	private double real;
	private double imaginary;

	public ComplexNumbers(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double re() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public ComplexNumbers add(ComplexNumbers other) {
		return new ComplexNumbers(real + other.real, imaginary + other.imaginary);
	}

	public ComplexNumbers subtract(ComplexNumbers other) {
		return new ComplexNumbers(real - other.real, imaginary - other.imaginary);
	}

	public ComplexNumbers multiply(ComplexNumbers other) {
		double realPart = real * other.real - imaginary * other.imaginary;
		double imaginaryPart = real * other.imaginary + imaginary * other.real;
		return new ComplexNumbers(realPart, imaginaryPart);
	}

	public ComplexNumbers conjugate() {
		return new ComplexNumbers(real, -imaginary);
	}

	public String toString() {
		return real + " + " + imaginary + "i";
	}
}
