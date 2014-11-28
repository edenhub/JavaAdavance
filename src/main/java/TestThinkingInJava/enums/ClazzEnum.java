package TestThinkingInJava.enums;

/**
 * Created by lab on 14-11-8.
 */
public enum ClazzEnum {
    First("adam","chen"),Second("Jack","Jone"),Third("Kate","Jance");

    private ClazzEnum(String name,String tags){
        this.name = name;
        this.tags = tags;
    }

    public String description(){
        return this.name+" : "+this.tags;
    }



    private String name;
    private String tags;

    @Override
    public String toString() {
        return "{"+this.name+" : "+this.tags+"}";
    }
}
