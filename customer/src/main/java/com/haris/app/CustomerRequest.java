package com.haris.app;

// the jvm will compile record class as regular class except that each field is immutable and private. the jvm will generate a constructor that its list of parameters is the same as list of fields. jvm will also generate a getter for each field whose getter name is the same as the field. 
public record CustomerRequest(String firstName,
                                String lastName,
                                String email) {
    
}
