package com.jschuah.main;

import static spark.Spark.get;

/**
 * Created by chuah on 2/26/2017.
 */
public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "Hello World 5");
    }
}
