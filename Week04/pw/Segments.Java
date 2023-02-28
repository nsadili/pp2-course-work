public class Segments {
	public double start;
	public double end;
	
	public Segments(double start, double end) {
		this.start = start;
		this.end = end;
	}
	
	public double getStart() {
		return this.start;
	}
	
	public double getEnd() {
		return this.end;
	}
	
	public double getLength() {
		return this.end - this.start;
	}
	
	public static Segments[] getMinLengthSegments(Segments[] segments) {
		double minLength = segments[0].getLength();
		List<Segments> minLengthSegments = new ArrayList<>();
		minLengthSegments.add(segments[0]);
		for(int i=1; i<segments.length; i++) {
			double currLength = segments[i].getLength();
			if(currLength < minLength) {
				minLength = currLength;
                minLengthSegments = new ArrayList<>();
				minLengthSegments.add(segments[i]);
			}
			else if(currLength == minLength) {
				minLengthSegments.add(segments[i]);
			}
		}
		
		Segments[] result = new Segments[minLengthSegments.size()];
		return minLengthSegments.toArray(result);
	}
	
	public static void main(String[] args) {
		Segments[] segments = new Segments[5];
		segments[0] = new Segments(1, 5);
		segments[1] = new Segments(3, 7);
		segments[2] = new Segments(4, 9);
		segments[3] = new Segments(2, 12);
		segments[4] = new Segments(7, 10);
		
		Segments[] minLengthSegments = getMinLengthSegments(segments);
        for(Segments segment : minLengthSegments) {
			System.out.println("Start: " + segment.getStart() + " End: " + segment.getEnd());
		}
	}
}