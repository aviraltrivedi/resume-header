open module jpms.springboot {

    requires resume.header;

    requires spring.web;
    requires spring.boot;
    requires spring.boot.autoconfigure;

    requires com.fasterxml.classmate;
    requires com.fasterxml.jackson.databind;
}