package MVC;

public class Model {
    private String name="";

    //setter
    public void setName(String name)
    {
        this.name=name;
    }

    //getter
    public String getGreeting()
    {
        return "Hello "+name+"!";
    }

}
