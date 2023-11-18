package org.lab;

import java.util.Random;

public class Division
{
    /**
     * Division identification
     */
    private final int id;

    /**
     * Division title
     */
    private final String title;

    /**
     * Class Constructor.
     * @param title - division title.
     */
    public Division(String title)
    {
        this.title = title;
        Random random = new Random();
        this.id = random.nextInt(25000);
    }

    /**
     * Allows you to get the id of the division.
     * @return int - division`s id.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Allows you to get the title of the division.
     * @return String - division`s title.
     */
    public String getTitle()
    {
        return title;
    }
}
