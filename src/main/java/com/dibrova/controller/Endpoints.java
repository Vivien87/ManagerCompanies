package com.dibrova.controller;

public final class Endpoints {
    public static final String WEB_API_ENDPOINT = "/api";
    public static final String DEPARTMENT_ENDPOINT = WEB_API_ENDPOINT + "/departments";

    public static final String COMPANY_ENDPOINT = "/company";
    public static final String COMPANIES = "/companies";
    public static final String COMPANY = COMPANIES + "/company/{id}";
    public static final String COMPANY_CREATE = COMPANY_ENDPOINT + "/create";


    public static final String USERS = "/users";
    public static final String USER_ENDPOINT = "/user";
    public static final String USER = USERS + "/user/{id}";
    public static final String USER_CREATE = USER_ENDPOINT + "/create";


    public static final String DEPARTMENTS = "/departments";
    public static final String DEPARTMENT = DEPARTMENTS+"/department/{id}";
    public static final String DEPARTMENT_CREATE = DEPARTMENT_ENDPOINT + "/create";


}
