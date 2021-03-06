package machine.model.enumerated;
public enum Operation {
    BUY("buy",1),
    FILL("fill",2),
    TAKE("take",3),
    REMAIN("remaining", 4),
    EXIT("exit",5);

    String name;
    int id;

    Operation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

}