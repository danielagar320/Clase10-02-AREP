package org.example;

public class CheckPersonEligibleForSelectiveService {
    public boolean test(Person p) {
        return p.gender == Person.Sex.FEMALE
                && p.getAge() >= 18
                && p.getAge() <= 25;
    }

}
