import java.awt.*;

public class PersonThinBuilder extends PersonBuilder {
    public PersonThinBuilder(Graphics g){
        super(g);
    }
    public void buildArmLeft(){
        g.drawLine(60,80,40,130);
    }
    public void buildArmRight(){
        g.drawLine(70,80,90,130);
    }
    public void buildBody(){
        g.fillRect(60,80,10,50);
    }
    public void buildHead(){
        g.fillOval(50,50,30,30);
    }
    public void buildLegLeft(){
        g.drawLine(60,130,45,180);
    }
    public void buildLegRight(){
        g.drawLine(70,130,85,180);
    }
}
