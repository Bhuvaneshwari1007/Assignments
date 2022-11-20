package com.assignments.Assignment3.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.assignments.Assignment3.bean.Details;

@Component
	public class DetailsService {
	    private static List<Details> info=new ArrayList<>();
	    static
	    {
	        info.add(new Details(603210,"Tamilnadu","Chennai","INDIA"));
	        info.add(new Details(603202,"Kerala","Trivandrum","INDIA"));
	        info.add(new Details(600001,"Karnataka","Bangalore","INDIA"));
	    }
	    public Details findOne(int code)
	    {
	        Predicate<? super Details> predicate=u->u.getZipcode().equals(code);
	        return info.stream().filter(predicate).findFirst().orElse(null);
	    }
	}
