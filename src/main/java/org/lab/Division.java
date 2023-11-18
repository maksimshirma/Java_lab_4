package org.lab;

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
     * @param id - division id.
     */
    public Division(String title, int id)
    {
        this.title = title;
        this.id = id;
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
