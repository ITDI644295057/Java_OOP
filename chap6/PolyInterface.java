package chap6;

public class PolyInterface {
  static void printBuilding(Building buildingObject){
      buildingObject.drafBlueprint();
      buildingObject.constuct();
      buildingObject.interior();
  }
  
    public static void main(String[] args) {
        printBuilding(new House());
    }
}//end 
