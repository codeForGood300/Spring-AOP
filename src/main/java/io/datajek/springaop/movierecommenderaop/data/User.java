package io.datajek.springaop.movierecommenderaop.data;

import io.datajek.springaop.movierecommenderaop.aspect.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class User {

   @MeasureTime
    public String getUserDetails() {
        return "user details";
    }
}