package com;

import java.util.LinkedList;
import java.util.List;

public class Product
{
    private List<String> parts;

    public Product()
    {
        parts = new LinkedList();
    }

    public void add(final String part)
    {
        parts.add(part);
    }

    public void show()
    {
        System.out.println("\nProduct completed as below:");
        parts.forEach(System.out::println);
    }
}
