import java.util.Objects;
public class SuperHero
{


    enum Type {Marvel, DC}


    private Type type;
    private String name;
    private int level;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

     public void sposob(Ulita ulita){
        System.out.println("Супергеой: " + name);
        ulita.ready();
        ulita.use();

     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperHero superHero = (SuperHero) o;
        return level == superHero.level && type == superHero.type && Objects.equals(name, superHero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, level);
    }

    @Override
    public String toString() {
        return "SuperHero{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
