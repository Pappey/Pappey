

public class Ulita {

    private String name;

    private boolean ready;


    public boolean isReady() {
        return ready;
    }

    public void isReady(boolean ready) {
        this.ready = ready;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ready() {
        ready = true;
        System.out.println("Суперспособность готова!");
    }
    public void uncharged() {
        ready = false;
        System.out.println("Суперспособность не готова!" );
    }
    public void use() {
        if (!isReady())
        {throw new IllegalStateException("Суперспособность не заряжена");
        }
        System.out.println("Суперспопобность сработала: " +
                name);
    }

    @Override
    public String toString() {
        return "Ulita{" +
                "name='" + name + '\'' +
                ", ready=" + ready +
                '}';
    }
}
