package level01.exercise04;

public class StringToEnum {
    public static Level convertStringToEnum(String sourceString){
        try{
            return Level.valueOf(sourceString);
        } catch(IllegalArgumentException e) {
            System.out.format("Invalid level String: %s\n", sourceString);
            return null;
        }
    }
}
