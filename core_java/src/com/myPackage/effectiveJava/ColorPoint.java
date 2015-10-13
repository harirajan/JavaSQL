package com.myPackage.effectiveJava;

public class ColorPoint extends Point {
	private final int z;

	public ColorPoint(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public boolean equals(Object o) {
		if(!(o instanceof Point))
			return false;
		
		if (!(o instanceof ColorPoint))
			return o.equals(this);

		return super.equals(o) && ((ColorPoint) o).z == z;

	}
}
