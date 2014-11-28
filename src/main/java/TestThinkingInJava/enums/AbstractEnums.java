package TestThinkingInJava.enums;

/**
 * Created by lab on 14-11-8.
 */
public enum  AbstractEnums {
    Info1{
        public String info(){
            return "In Info1";
        }
    },
    Info2{
        public String info(){
            return "In Info2";
        }
    };

    public static void main(String[] args){
        for(AbstractEnums e : AbstractEnums.values())
            System.out.println(e.info());
    }

    public abstract String info();
}
