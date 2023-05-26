package org.launchcode.java.demos.lsn3classes1.studio;

import java.util.Arrays;
import java.util.Objects;

public class MenuItem {
    // Class Variables
    private String name;
    private  String description;
    private Double price;
    private String category;
    private Boolean isNew;

    // Constructors

    public MenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this.isNew = false;
    }

    public MenuItem(String name, String description, Double price,String category, Boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;

    }


    // Methods
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean isNew() {
        return isNew;
    }

    public void setIsNew(Boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString() {
      String returnString = "";
      returnString += "Item Name: " + this.name + "\n";
      returnString += "Item Description : " + this.description + "\n";
      returnString += "Item Category: " + this.category + "\n";
      returnString += "Item Is New ?: " + this.isNew + "\n";
      return returnString;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) obj;
        if (menuItem.name.equals(this.name)
                && menuItem.description.equals(this.description)
                && menuItem.price.equals(this.price)
                && menuItem.category.equals(this.category))
            return true;
        else return false;

    }
}


