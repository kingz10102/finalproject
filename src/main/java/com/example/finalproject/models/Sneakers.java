package com.example.finalproject.models;


import javax.persistence.*;

    @Entity
    @Table(name = "sneakers")
    public class Sneakers {

        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String title;

        @Column
        private String description;

        @Column
        private int price;

        @Column
        private Long skunum;

        @Column
        private String image;


        public Sneakers() {

        }

        public String getTitle() {

            return title;
        }

        public void setTitle(String title) {

            this.title = title;
        }

        public String getDescription() {

            return description;
        }

        public void setDescription(String description) {

            this.description = description;
        }

        public int getPrice() {

            return price;
        }

        public void setPrice(int price) {

            this.price = price;
        }

        public Long getSkunum() {

            return skunum;
        }

        public void setSkunum(Long skunum) {

            this.skunum = skunum;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }