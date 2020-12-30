package com.javagraphql.demo.resolver;

import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DateScalar extends GraphQLScalarType {
    public DateScalar(){
        super("Date","Date value", new Coercing<Date,String >(){

            public String serialize(Object input) {
                if (input instanceof Date) {
                    return Long.toString(((Date) input).getTime());
                }
                return null;
            }

            public Date parseValue(Object input) {
                if (input instanceof String) {
                    return new Date(Long.parseLong((String) input));
                }
                return null;
            }

            public Date parseLiteral(Object input) {
                if (input instanceof String) {
                    return new Date(Long.parseLong((String) input));
                }
                return null;
            }
        });
    }
}
