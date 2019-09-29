package model;

public class BuilderPattern {

}

interface HousePlan {
	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);
}

interface HouseBuilder {
	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();
}

class House implements HousePlan {
	private String basement;
	private String structure;
	private String roof;
	private String interior;

	public void setBasement(String basement) {
		this.basement = basement;
		System.out.println(basement);
	}

	public void setStructure(String structure) {
		this.structure = structure;
		System.out.println(structure);
	}

	public void setRoof(String roof) {
		this.roof = roof;
		System.out.println(roof);
	}

	public void setInterior(String interior) {
		this.interior = interior;
		System.out.println(interior);
	}

}

class IglooHouseBuilder implements HouseBuilder {
	House house;

	IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("igloo bars");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("igloo str");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("igloo roof");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("igloo inte");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub

		return this.house;
	}

}
class CivilEngineer{
	private HouseBuilder houseBuilder;
	public CivilEngineer(HouseBuilder hb) {
		this.houseBuilder=hb;
	}
	public House getHouse() {
		return this.houseBuilder.getHouse();
	}
	public void constructHouse() {
		this.houseBuilder.buildBasement();
		this.houseBuilder.buildStructure();
		this.houseBuilder.buildInterior();
		this.houseBuilder.buildRoof();
	}
	public static void code() {
		HouseBuilder hb=new IglooHouseBuilder();
		CivilEngineer ce=new CivilEngineer(hb);
		ce.constructHouse();
	}
	
}