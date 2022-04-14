public class Pig implements IAnimal, Comparable<IAnimal>{
    private int idTag;
    private String AnimalType=this.getClass().getName();

  @Override
  public String getAnimalType(){
	  
  
      return AnimalType;

  }   
  @Override
  public int getIdTag(){
      return idTag;


  }
  @Override
  public void setIdTag(int anIdTag){
      idTag=anIdTag;

  }
  @Override
  public int getMinTemperature(){
	  return 30;



  }
  @Override
  public int getMaxTemperature(){
	  return 50;

  }





@Override
public int compareTo(IAnimal o) {

	// TODO Auto-generated method stub
	return AnimalType.compareTo(o.getAnimalType());
//			+ idTag-o.getIdTag();
}
@Override
public String toString() {
	return "\nType Animal:"+getAnimalType()+"\nID: "+getIdTag()+"\nMin Temp: "+getMinTemperature()+"\nMax Temp: "+getMaxTemperature();
	
}
}
