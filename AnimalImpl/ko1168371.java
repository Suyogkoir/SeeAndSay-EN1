package SeeAndSay.AnimalImpl;

import SeeAndSay.Animal;
import SeeAndSay.Talker;

public class ko1168371 extends Animal implements Talker {
    @Override
    public String getAuthor() {return "Suyog Koirala";}

    @Override
    public String getAnimalName() {return "Efficient Seal";}

    @Override
    public String getSound() {return "I Clap, I Bark, I Whistle.";}

    @Override
    public  String getDescription() {return "I love playing with the penguins but orcas love to play with me, :";}
}