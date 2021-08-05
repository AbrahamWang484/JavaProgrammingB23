package Practice_08_04_2021.AnimalSpecies;

public class AnimalSpecies {
    public String name;
    public int population,growthRate;

    public void setInfo(String name, int population, int growthRate) {
        this.name = name;
        this.population = population;
        this.growthRate = growthRate;
    }

    public String getName(){
        return name;
    }
    public int getPopulation (){
        return population;
    }
    public int getGrowthRate(){
        return  growthRate;
    }

    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +" million"+
                ", growthRate=" + growthRate +"%"+
                '}';
    }

}
