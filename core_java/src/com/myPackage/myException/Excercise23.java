package com.myPackage.myException;

class FailingConstructorException1 extends Exception {
}

class FailingConstruction {
	FailingConstruction(boolean b) throws FailingConstructorException1 {
		WithDisposeMethod wd1 = new WithDisposeMethod(1);
		try {
			if (b)
				throw new FailingConstructorException1();
		} catch (FailingConstructorException1 fe) {
			wd1.dispose();
			//throw fe;
		}
		WithDisposeMethod wd2 = new WithDisposeMethod(2);
	}
}

class WithDisposeMethod {

	private int i;

	public WithDisposeMethod(int i) {
		this.i = i;
		System.out.println("inside the constructor i = " + i);

	}

	public void dispose() {

		System.out.println("inside the dispose method");
	}
}

public class Excercise23 {

	public static void main(String[] args) throws FailingConstructorException1 {
		try {
			FailingConstruction fc = new FailingConstruction(true);
		} catch (FailingConstructorException1 fe) {
			System.out.println("catching the exception"+fe);

		}
	}

}
