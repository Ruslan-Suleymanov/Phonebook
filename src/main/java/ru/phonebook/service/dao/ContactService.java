package ru.phonebook.service.dao;

import ru.phonebook.model.Contact;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ContactService {

    public void save(Contact contact) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Руслан-ПК/Desktop/sqllite/PhoneBook.db");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO contacts (name, surname, phone) VALUES ('" + contact.getName() + "', '" + contact.getSurname() + "', '" + contact.getPhoneNumber() + "')";
            statement.execute(sql);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public void delete(Contact contact) {

    }

    public List<Contact> showAll() {

        return null;

    }


}
