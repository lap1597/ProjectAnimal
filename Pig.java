public class Pig implements IAnimal, Comparable<IAnimal>{
    private int idTag;
    private String AnimalType;
    private int minTemperature;
    private int maxTemperature;
     Pig(int idTag,int minTemperature, int maxTemperature){
    		
     		this.idTag=idTag;
     		this.minTemperature=minTemperature;
     		this.maxTemperature=maxTemperature;
 		

     }



  @Override
  public String getAnimalType(){
	  
  
      return AnimalType=this.getClass().getName();

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
	  return minTemperature;



  }
  @Override
  public int getMaxTemperature(){
	  return maxTemperature;

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
