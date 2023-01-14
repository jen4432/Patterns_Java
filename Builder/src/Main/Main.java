package Main;

import Decorator.Developer;
import Decorator.JavaDeveloper;
import Decorator.JavaTeamLead;
import Decorator.SeniorJavaDeveloper;

public class Main {


    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.doJob());
    }
}
