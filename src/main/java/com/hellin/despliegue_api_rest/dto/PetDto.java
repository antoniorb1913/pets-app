package com.hellin.despliegue_api_rest.dto;

    import java.time.LocalDate;

public class PetDto {

    private String name;
    private LocalDate born;
    private String chip;
    private String category;

    // Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBorn() {
        return born;
    }
    public void setBorn(LocalDate born) {
        this.born = born;
    }
    public String getChip() {
        return chip;
    }
    public void setChip(String chip) {
        this.chip = chip;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
    
