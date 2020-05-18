public class PersonDirector {
    private PersonBuilder pd;
    public PersonDirector(PersonBuilder pd){
        this.pd=pd;
    }
    public void createPerson(){
        pd.buildHead();
        pd.buildBody();
        pd.buildArmLeft();
        pd.buildArmRight();
        pd.buildLegLeft();
        pd.buildLegRight();
    }
}
