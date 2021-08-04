package Practice_08_04_2021.AnimalSpecies;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies animalSpecies1 = new AnimalSpecies();
        animalSpecies1.setInfo("Cat",100,12);

        AnimalSpecies animalSpecies2 = new AnimalSpecies();
        animalSpecies2.setInfo("Humman Being",6000_000,8);

        AnimalSpecies animalSpecies3 = new AnimalSpecies();
        animalSpecies3.setInfo("Elephant",1,1);

        System.out.println(animalSpecies1.getGrowthRate());
        System.out.println(animalSpecies2.getGrowthRate());
        System.out.println(animalSpecies2.getName());
        System.out.println(animalSpecies3.getPopulation());

    }
}
