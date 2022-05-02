package Technology;

public abstract class AbstractEntity {
    private String id;

    public AbstractEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void myId() {
        System.out.println("My ID is: " + id);
    }
}
