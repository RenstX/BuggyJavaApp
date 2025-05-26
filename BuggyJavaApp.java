public class BuggyJavaApp {
    public static void main (String[] args) {

        //Erreur 1 : division par 0
        int a = 10;
        int b = 0;
        int result = a / b;

        //Erreur 2 = Variable non utilisée
        String unusedVar = "Je ne sers à rien!";


        // Erreur 3 : result n'est pas déclarée
        try {
            System.out.println("Résultat : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Erreur 4 : Boucle infinie
        while(true) {
            System.out.println("boucle infinie");
        }
    }
}