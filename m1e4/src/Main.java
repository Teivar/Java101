public class Main {

	public static House createHouse(){
		
		House house = new House();
		house.address = "str1";
		house.countOfFloors = 5;
		house.appartmentsCount = 10;
		house.owner = "Max";		
		return house;

	}

	public static void main(String[] args){
		House myHome = createHouse();
		House myWork = createHouse();
		
		System.out.println(myHome.owner + myHome.address);
		System.out.println(myWork.owner + myWork.address);

        myHome.address = "Tula, Hvorostuhina 11";
        myHome.countOfFloors = 9;
        myHome.appartmentsCount = 36;
        myHome.owner = "JK";

		myWork.address = "Tula, Lenina 6";
		myWork.countOfFloors = 11;
		myWork.appartmentsCount = 213;
		myWork.owner = "Zdravservice";

		System.out.println(myHome.owner + myHome.address);
		System.out.println(myWork.owner + myWork.address);

        myHome = null;
		myWork = null;

	}

}