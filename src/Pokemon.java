public class Pokemon {
    //class attributes {variables/fields}
    private String name;
    private String type;
    private int level;

    //Constructors - Build objects
    public Pokemon(String name) {
        this.name = name;
        type = "normal";
        level = 1;
    }

    public Pokemon(String name, String type, int level){
        this.name = name;
        this.type = type;
        if (level > 0 && level <= 100) {
            this.level = level;
        } else {
            this.level = 1;
        }
    }

    //Accessor Methods (Getters) - Return data
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String toString(){
        String s = ("Name: "+ name+ "\nType: "+ type+ "\nLevel: "+ level);
        return s;
    }

    //Mutator Methods (setters) - void methods
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
       this.type = type;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}