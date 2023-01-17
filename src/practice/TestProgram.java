package practice;

interface TestProgram {
	void talk();
	void walk();

	class Another implements  TestProgram{

		@Override
		public void talk() {
			System.out.println("its Talking");
		}

		@Override
		public void walk() {
			System.out.println("its Walking");
		}
		
		
	}
}
