import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
            menu[2] = "Latte"; //change array value
        // String menuString = Arrays.toString(menu);
        // System.out.println(menuString);
        System.out.println(Arrays.toString(menu));//two methods to print an array without for loop.

        String[] newMenu = new String[5];
        newMenu[3] = "House Roast";
        newMenu[4] = "Dark Roast";

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));
    }
}
