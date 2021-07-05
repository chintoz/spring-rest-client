package es.menasoft.springrestclient.api.domain;

import lombok.Data;

@Data
public class User {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;

    @Data
    public static class Name {
        private String title;
        private String first;
        private String last;
    }

    @Data
    public static class Location {
        private String street;
        private String city;
        private String state;
        private String postcode;
    }

    @Data
    public static class Login {
        private String username;
        private String password;
        private String md5;
        private String sha1;
        private String sha256;
    }

    @Data
    public static class Job {
        private String title;
        private String company;
    }

    @Data
    public static class Billing {
        private Card card;
    }

    @Data
    public static class Card {
        private String type;
        private String number;
        private ExpirationDate expirationDate;
        private String iban;
        private String swift;
    }

    @Data
    public static class ExpirationDate {
        private String date;
        private Integer timezoneType;
        private String timezone;
    }


}
