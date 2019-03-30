package com.zipcodewilmington.Maven.SpringBeansLearnerLab;

import java.util.*;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{
    private List<PersonType> personList;

    public People(PersonType... personList) {
        if(personList != null)
            this.personList = new ArrayList<>(Arrays.asList(personList));
        else
            this.personList = new ArrayList<>();
    }
    public void add(PersonType person){
        personList.add(person);
    }
    public void remove(PersonType person){
        personList.remove(person);
    }
    public int size(){
        return personList.size();
    }
    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> persons){
            persons.forEach(person->personList.add(person));
    }

    public PersonType findById(long personId){
        return personList.stream().filter(person -> person.getId() == personId)
        .findFirst().orElseGet(null);
    }
    public List<PersonType> findAll(){
        return new ArrayList<>(personList);
    }
    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
