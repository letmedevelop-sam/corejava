package p07Methods;

public class GoogleSearch {
    public static void main(String[] args) {


        navigateGoogle();
        searchForShoes();
        printResults();

    }

    public static void navigateGoogle() {
        System.out.println("Launch browser");
        System.out.println("navigate to google.com\n");
    }

    public static void searchForShoes(){
        System.out.println("type shoes in the search field");
        System.out.println("click on search button\n");
    }

    public static void printResults() {
        System.out.println(" result for shoes ... ");
    }
}
