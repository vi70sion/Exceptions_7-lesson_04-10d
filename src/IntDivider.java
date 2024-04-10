public class IntDivider {
    public int divide(String[] skaiciai) {
        int result = 0;
        try{
            if (Integer.parseInt(skaiciai[1]) == 0) {
                throw new ArgumentIsZero("Dalyba is nulio negalima!");
            } else { result = Integer.parseInt(skaiciai[0]) / Integer.parseInt(skaiciai[1]);}
        } catch (ArgumentIsZero e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
class ArgumentIsZero extends Exception {
    public ArgumentIsZero(String message) {
        super(message);
    }
}
