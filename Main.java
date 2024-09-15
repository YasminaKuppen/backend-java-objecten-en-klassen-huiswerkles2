public class Main {

    public static void main(String[] args) {//methode

        ApplePieRecipe recept = new ApplePieRecipe();
        recept.printIngredients();
        recept.ovenVoorverwarmen();
        recept.ei();
        recept.mengen();
        recept.schillen();
        recept.invetten();
        recept.bodem();
        recept.vulling();
        recept.bovenkant();
        recept.stroken();
        recept.bakken();

    }

    public static class Ingredient {                             //class
        private float amount;
        private String unit;
        private String name;

        private Ingredient(float amount, String unit, String name) {//constructor
            this.amount = amount;
            this.unit = unit;
            this.name = name;
        }
    }


    public static class ApplePieRecipe {
        Ingredient roomboter = new Ingredient(200f, "gram", "ongezouten roomboter");
        Ingredient wittesuiker = new Ingredient(200f, "gram", "witte bastard suiker");
        Ingredient bakmeel = new Ingredient(400f, "gram", "zelfrijzend bakmeel");
        Ingredient ei = new Ingredient(1f, "stuk(s)", "ei");
        Ingredient vanillesuiker = new Ingredient(8f, "gram", "vanillesuiker");
        Ingredient zout = new Ingredient(1f, "snuf", "zout");
        Ingredient appels = new Ingredient(1.5f, "kilo", "zoetzure appels");
        Ingredient kristalsuiker = new Ingredient(75f, "gram", "suiker");
        Ingredient kaneel = new Ingredient(3f, "theelepels", "kaneel");
        Ingredient paneermeel = new Ingredient(15f, "gram", "paneermeel");

        public void printIngredients() {
            System.out.println(roomboter.amount + " " + roomboter.unit + " " + roomboter.name);
            System.out.println(wittesuiker.amount + " " + wittesuiker.unit + " " + wittesuiker.name);
            System.out.println(bakmeel.amount + " " + bakmeel.unit + " " + bakmeel.name);
            System.out.println(ei.amount + " " + ei.unit + " " + ei.name);
            System.out.println(vanillesuiker.amount + " " + vanillesuiker.unit + " " + vanillesuiker.name);
            System.out.println(zout.amount + " " + zout.unit + " " + zout.name);
            System.out.println(appels.amount + " " + appels.unit + " " + appels.name);
            System.out.println(kristalsuiker.amount + " " + kristalsuiker.unit + " " + kristalsuiker.name);
            System.out.println(kaneel.amount + " " + kaneel.unit + " " + kaneel.name);
            System.out.println(paneermeel.amount + " " + paneermeel.unit + " " + paneermeel.name);
        }

        public void ovenVoorverwarmen() {
            System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).");
        }

        public void ei() {
            System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
        }

        public void mengen() {
            System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
        }

        public void schillen() {
            System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
        }

        public void invetten() {
            System.out.println("Vet de springvorm in en bestrooi deze met bloem");

        }

        public void bodem() {
            System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
        }

        public void vulling() {
            System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
        }

        public void bovenkant() {
            System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
        }

        public void stroken() {
            System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
        }

        public void bakken() {
            System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");

        }

    }
}


