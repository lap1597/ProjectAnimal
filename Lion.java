public class Lion implements IAnimal, Comparable<IAnimal>  {
    private int idTag;
    private String AnimalType;
    private int minTemperature;
    private int maxTemperature;
	Lion(int idTag,int minTemperature, int maxTemperature){
 		AnimalType=this.getClass().getName();
 		this.idTag=idTag;
 		this.minTemperature=minTemperature;
 		this.maxTemperature=maxTemperature;

	}
	@Override
	public String getAnimalType() {
		// TODO Auto-generated method stub
		return AnimalType;
	}
	@Override
	public int getIdTag() {
		// TODO Auto-generated method stub
		return idTag;
	}
	@Override
	public void setIdTag(int anIdTag) {
		idTag=anIdTag;
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getMinTemperature() {
		// TODO Auto-generated method stub
		return minTemperature;
	}
	@Override
	public int getMaxTemperature() {
		// TODO Auto-generated method stub
		return maxTemperature;
	}
	@Override
	public int compareTo(IAnimal o) {
		// TODO Auto-generated method stub
		return AnimalType.compareTo(o.getAnimalType());
	}
	@Override
	public String toString() {
		return "\nType Animal:"+AnimalType+"\nID: "+getIdTag()+"\nMin Temp: "+getMinTemperature()+"\nMax Temp: "+getMaxTemperature();
		
	}

}
