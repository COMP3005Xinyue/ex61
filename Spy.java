public class Spy {
    String name;
    String secret;
    int clearance;
    StaticMediator staticmediator;

    public Spy(String n,String s,int c, StaticMediator sm){
        this.name = n;
        this.secret = s;
        this.clearance = c;
        this.staticmediator = sm;
    }

    public void statusChange(){
        System.out.println(name + "status update");
    }

    public String toString(){
        return name + " " + secret + " and my clearance " + clearance;
    };
}
