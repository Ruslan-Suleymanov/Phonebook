package ru.phonebook.main;

import ru.phonebook.model.Contact;
import ru.phonebook.service.dao.ContactService;

public class Main {

    public static void main(String[] args) {

        Contact test = new Contact("Вася", "Пупкин", "89524561232");

        ContactService contactService = new ContactService();
        contactService.save(test);
        contactService.save(new Contact("Ваня", "Мупкин", "89456421232"));
    }

}
