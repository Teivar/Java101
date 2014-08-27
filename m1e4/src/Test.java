class Test {
	
	public static void main(String... args) throws Exception {
		House h = Main.createHouse();
		if (!h.address.equals("str1"))
			throw new Exception();
		if (h.countOfFloors != 5)
			throw new Exception();
		if (h.appartmentsCount != 10)
			throw new Exception();
		if (!h.owner.equals("Max"))
			throw new Exception();
	}

}