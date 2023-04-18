package chap6;

public interface Building {
    public void drafBlueprint();
    public void interior();
    public void constuct();    
}//end

class House implements Building {

    @Override
    public void drafBlueprint() {
        System.out.println("drafBlueprint"); 
    }

    @Override
    public void interior() {
        System.out.println("interior");
    }

    @Override
    public void constuct() {
         System.out.println("constuct");
    }
    
}