public class Mole {
    String name;
    String secret;
    StaticMediator staticmediator;

    public Mole(String n,String s, StaticMediator sm){
        this.name = n;
        this.secret = s;
        this.staticmediator = sm;
    }

    public void statusChange(){
        System.out.println(name + "status update");
    }

    public String toString(){
        if(name == null){
            return null;
        }
        return name + " " + secret;
    };
}
