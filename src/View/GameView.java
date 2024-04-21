package View;

public class GameView {
    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_RESET = "\u001B[0m";
    String view;

    public void printView(){
        System.out.println("--------------------------------------------\n");
        System.out.println(view);
        System.out.println("--------------------------------------------\n");
    }
    public void welcome(){
        System.out.println(ANSI_CYAN + "Welcome to Dungeon Adventure!\n" + ANSI_RESET);
    }

    public void updateView(String view){
        if(view.equalsIgnoreCase("No room")){
            System.out.println(ANSI_RED + "There is nowhere to go in that direction, try another direction." + ANSI_RESET);
        }
        else {
            this.view = view.replaceAll("[.?!]\\s?", "$0\n");
        }
    }

    public void lockedRoom(){
        System.out.println(ANSI_RED + "This direction is blocked off! You may need to complete a task to unlock it." + ANSI_RESET);
    }

    public void wrongCommand(){
        System.out.println(ANSI_RED + "Please only enter the commands given." + ANSI_RESET);
    }

    public void hasVisited(){
        System.out.println(ANSI_BLUE + "This place seems familiar, you have been here before!" + ANSI_RESET);
    }

    public void updateSearch(String search){
        System.out.println(ANSI_BLUE + search + ANSI_RESET);
    }

    public void displayPuzzle(String name, String desc){
        System.out.println(ANSI_BLUE + name + ANSI_RESET);
        System.out.println(ANSI_CYAN + desc.replaceAll("[.?!]\\s?", "$0\n") + ANSI_RESET);
    }

    public void puzzleResults(String result){
        if(result.equalsIgnoreCase("Solved")){
            System.out.println(ANSI_GREEN + "You did it! You solved the puzzle!" + ANSI_RESET);
        }
        if(result.equalsIgnoreCase("Failed")){
            System.out.println(ANSI_RED + "You have failed the puzzle, please try it again later." + ANSI_RESET);
        }
        if(result.equalsIgnoreCase("NoItem")){
            System.out.println(ANSI_RED + "You do not have this item in your inventory! Please retrieve it before you can use it here." + ANSI_RESET);
        }
    }

    public void noPuzzle(){
        System.out.println(ANSI_RED + "There is no puzzle here!" + ANSI_RESET);
    }
    public void isLocked(boolean locked){
        System.out.println("It is " + locked);
    }

    public void equip(String item){
        if(item.equalsIgnoreCase("Wrong")){
            System.out.println(ANSI_RED + "You cannot equip that item! Try a different one!" + ANSI_RESET);
        }
        System.out.println(ANSI_BLUE + "You have succesfully equipped: " + item + ANSI_RESET);
    }

    public void noItem(){
        System.out.println(ANSI_RED + "There is no item with that name!" + ANSI_RESET);
    }

    public void useItem(String item){
        if(item.equalsIgnoreCase("Success")){
            System.out.println(ANSI_BLUE + "You have gone to the new floor." + ANSI_RESET);
        }
    }

    public void nothing(String item){
        if(item.equalsIgnoreCase("Nothing")){
            System.out.println(ANSI_RED + "Nothing happens." + ANSI_RESET);
        }
    }

    public void con(String item){
        if(item.equalsIgnoreCase("Heal")){
            System.out.println(ANSI_GREEN + "You healed some HP back." + ANSI_RESET);
        }
    }

    public void viewInv(String item){
        System.out.println(item);
    }

    public void emptyInv(){
        System.out.println(ANSI_RED + "There is nothing in your inventory!" + ANSI_RESET);
    }

    public void pickUp(String name){
        System.out.println(ANSI_BLUE + "You have successfully picked up " + name + ANSI_RESET);
    }

    public void notInv(){
        System.out.println(ANSI_RED + "You do not have that item in your inventory." + ANSI_RESET);
    }
}
