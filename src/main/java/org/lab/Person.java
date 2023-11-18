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
        division = new Division("", 0);
    }

    /**
     * Constructor with params.
     * @param id - person`s id.
     * @param name - person`s name.
     * @param gender - person`s gender.
     * @param salary - person`s salary.
     * @param birthDate - person`s birthdate.
     * @param divisionTitle - person`s division title.
     * @param divisionId - person`s division id.
     */
    Person(int id, String name, String gender, Double salary, String birthDate, String divisionTitle, int divisionId)
    {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.birthDate = birthDate;
        this.division = new Division(divisionTitle, divisionId);
    }

    /**
     * Override method toString()
     * @return string - person`s information.
     */
    @Override
    public String toString() {
        return this.id + "; " +
                this.name + "; " +
                this.gender + "; " +
                this.salary.toString() + "; " +
                this.birthDate + "; " +
                this.division.getTitle() + "; " +
                this.division.getId();
    }
}
