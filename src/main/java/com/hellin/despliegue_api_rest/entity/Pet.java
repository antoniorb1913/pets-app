package com.hellin.despliegue_api_rest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Pet {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String name;
        private LocalDate born;
        private String chip;
        private String category;
        private boolean adopt;
        
        
        public boolean isAdopt() {
            return adopt;
        }
        public void setAdopt(boolean adopt) {
            this.adopt = adopt;
        }
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
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

