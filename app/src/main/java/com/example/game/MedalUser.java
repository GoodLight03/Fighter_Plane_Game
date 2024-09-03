package com.example.game;

public class MedalUser {

        private String name;
        private int imageResource;
        private String id;

        public MedalUser(String name, int imageResource, String id) {
            this.name = name;
            this.id=id;
            this.imageResource = imageResource;
        }

        public String getName() {
            return name;
        }

    public String getId() {
        return id;
    }

    public int getImageResource() {
            return imageResource;
        }

        public void setName(String name) {
            this.name = name;
        }

    public void setId(String id) {
        this.id = id;
    }

    public void setImageResource(int imageResource) {
            this.imageResource = imageResource;
        }
    }

