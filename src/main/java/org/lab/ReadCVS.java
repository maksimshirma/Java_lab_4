package org.lab;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class ReadCVS
{
    /**
     * The array of the persons.
     * */
    private final ArrayList<Person> persons;

    /**
     * The array of the divisions.
     * */
    private final ArrayList<Division> divisions;

    /**
     * Default constructor.
     * */
    public ReadCVS() {
        this.persons = new ArrayList<Person>();
        this.divisions = new ArrayList<Division>();
    }

    /**
     * Finds the division by title in the array of the divisions.
     * If array has the certain division than method returns found division and null otherwise.
     * @param divisionTitle - title of the division.
     * @return Division - found division.
     * */
    private Division findDivision(String divisionTitle)
    {
        for (Division division : this.divisions) {
            if (Objects.equals(division.getTitle(), divisionTitle)) {
                return division;
            }
        }
        return null;
    }

    /**
     * Allows you to read the csv file with information about persons.
     * @param csvFilePath - path to file.
     * @param separator - separator of the string.
     * */
    public void read(String csvFilePath, String separator)
    {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(csvFilePath));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] string = line.split(separator);
                int id = Integer.parseInt(string[0]);
                String name = string[1];
                String gender = string[2];
                String birthdate = string[3];
                String divisionTitle = string[4];
                Double salary = Double.parseDouble(string[5]);

                Person person;
                Division division = this.findDivision(divisionTitle);
                if (division != null) {
                    person = new Person(id, name, gender, birthdate, division, salary);
                } else {
                   division = new Division(divisionTitle);
                   this.divisions.add(division);
                   person = new Person(id, name, gender, birthdate, division, salary);
                }
                this.persons.add(person);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Override method toString()
     * @return string - information about all persons.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person person : this.persons) {
            result.append(person.toString());
            result.append("\n");
        }
        return result.toString();
    }
}