package org.lab;

public class Person
{
    /**
     * Person identification.
     */
    private final int id;

    /**
     * Person name.
     */
    private final String name;

    /**
     * Person gender.
     */
    private final String gender;

    /**
     * Person salary.
     */
    private final Double salary;

    /**
     * Person birthdate.
     */
    private final String birthDate;

    /**
     * Person division.
     */
    private final Division division;

    /**
     * Default constructor.
     */
    public Person() {
        id = 0;
        name = "";
        gender = "";
        salary = 0.0;
        birthDate = "";
        division = new Division("");
    }

    /**
     * Constructor with params.
     * @param id - person`s id.
     * @param name - person`s name.
     * @param gender - person`s gender.
     * @param birthDate - person`s birthdate
     * @param division - person`s division.
     * @param salary - person`s salary..
     */
    Person(int id, String name, String gender, String birthDate, Division division, Double salary)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthDate = birthDate;
        this.division = division;
    }

    /**
     * Override method toString()
     * @return string - person`s information.
     */
    @Override
    public String toString() {
        return "id: " + this.id + "; name: " +
                this.name + "; gender: " +
                this.gender + "; salary: " +
                this.salary.toString() + "; birthdate: " +
                this.birthDate + "; division`s title: " +
                this.division.getTitle() + "; division`s id: " +
                this.division.getId();
    }
}
