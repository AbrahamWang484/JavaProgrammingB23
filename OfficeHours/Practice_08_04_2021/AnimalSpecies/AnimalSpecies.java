package Practice_08_04_2021.AnimalSpecies;

public class AnimalSpecies {
    public String name;
    public int population;
    public double growthRate;

    public void setInfo(String name, int population, double growthRate) {
        this.name = name;
        this.population = population*1_000_000;
        this.growthRate = growthRate/100;
    }

    public String getName(){
        return name;
    }
    public int getPopulation (){
        return population;
    }
    public double getGrowthRate(){
        return  growthRate;
    }

    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

}
